# RxJava와 Hot Observable / Cold Observable

> ‘언제 아이템들이 Emit 되는가’ 는 Observable 에 따라 다릅니다. “Hot” 이면 만들어 졌을때 emit 되기 시작하고, 나중에 구독하는 Observer 는 중간에 아무대나 관찰을 시작 할수 있습니다. “Cold” 는 반대로 Observer 가 구독시작할때까지 기다리고, 구독시작할때 아이템들을 emit 하기 시작합니다. 따라서 Observer 가 모든 item 을 구독할수 있는 보장이 됩니다.

Subject를 사용하여 실시간 데이터를 전송하도록 하는 방식을 Hot Observable, 구독할 데이터는 정해져있고 Observable을 구독하는 모든 구독자는 정해진 데이터를 모두 받아서 사용할 수 있는 방식을 Cold Observable로 본다.
(ConnectableObservable 을 Hot Observable 라 부르고, 일반적으로 많이 쓰는 Observable 이 Cold 라 부르기도 하지만, 개인적으로 connect만으로 Hot/Cold를 구분하기보다는 데이터 실시간성과 Life Cycle(stream이 종료되지 않고 onNext()로 데이터를 계속해서 전달할 수 있느냐.)에 따라 Hot/Cold를 구분하는게 맞는 것 같다.)

Subject도 ReplaySubject등을 통해서 모든 데이터를 전부 전달받을 수는 있다.
하지만 Hot Observable은 명시적으로 complete시키거나 error(Exception)가 발생하기 전까지는 stream이 유지되고,
Cold Observable은 정해진 데이터를 모두 사용할 경우 그 stream은 종료 된다.

Observable A와 subscriber1,2,3이 있다고 하면,
<Hot Observable>
    A
  / | \
s1  s2 s3
A가 방출하는 데이터를 1,2,3이 동시에 소비 (구독하는 시점에 따라서 나중에 구독한 Observer는 받지 못하는 데이터가 있을 수 있다.)
A가 종료되면 1,2,3 모두 종료

<Cold Obervable>
  A  A  A
  |  |  |
  s1 s2 s3
1,2,3이 각각 A를 구독하며, 모두 동일한 데이터를 소비하고 각자 종료한다.

소스로 보면,

<Hot Observable>
```java
PublishSubject<Integer> publishSubject = PublishSubject.create();

Observable<String> observableA = publishSubject
        .timestamp()
        .map( timestamped -> {
            System.out.println("\n________________map 연산________________\n");
            count.increase();
            return String.format("[%d] %d", timestamped.getValue(), timestamped.getTimestampMillis());
        } )
        .publish().refCount();

observableA.subscribe( value -> {
    System.out.println("subscriber1 : " + value);
});
publishSubject.onNext( 1 );
publishSubject.onNext( 2 );

observableA.subscribe(value -> {
    System.out.println("subscriber2 : " + value);
});

publishSubject.onNext( 3 );
publishSubject.onNext( 4 );
//publishSubject.onCompleted(); 가 불리기 전까지 stream이 유지 된다.
System.out.println("연산횟수 : " + count.count());
/** 결과
    ________________map 연산________________
    subscriber1 : [1] 1466583114891
    ________________map 연산________________
    subscriber1 : [2] 1466583114891
    ________________map 연산________________
    subscriber1 : [3] 1466583114891
    subscriber2 : [3] 1466583114891
    ________________map 연산________________
    subscriber1 : [4] 1466583114892
    subscriber2 : [4] 1466583114892
    연산횟수 : 4
*/
```

<Cold Observable>
```java
Observable<String> observableA = Observable
    .range(0, 4)
    .timestamp()
    .map(timestamped -> {
        System.out.println("\n________________map 연산________________\n");
        return String.format("[%d] %d", timestamped.getValue(), timestamped.getTimestampMillis());
    })
    .doOnNext(value -> count.increase());
    // .publish().refCount(); -> publish()하면 connectableObsavable이 되어 connect하기전까지 stream을 시작하지 않는다. refCount()하면 connect를 자동으로 해준다.

observableA.subscribe(value -> {
    System.out.println("subscriber1 : " + value);
});
System.out.println("*******************************************************");
observableA.subscribe(value -> {
    System.out.println("subscriber2 : " + value);
});

System.out.println("연산횟수 : " + count.count()); 
/** 결과
    ________________map 연산________________
    subscriber1 : [0] 1466581248156
    ________________map 연산________________
    subscriber1 : [1] 1466581248157
    ________________map 연산________________
    subscriber1 : [2] 1466581248157
    ________________map 연산________________
    subscriber1 : [3] 1466581248157
    *****************************************
    ________________map 연산________________
    subscriber2 : [0] 1466581248158
    ________________map 연산________________
    subscriber2 : [1] 1466581248158
    ________________map 연산________________
    subscriber2 : [2] 1466581248159
    ________________map 연산________________
    subscriber2 : [3] 1466581248159
    연산횟수 : 8
*/
```

- https://moka-a.github.io/android/rxAndroid_study/
- http://reactivex.io/RxJava/javadoc/rx/subjects/PublishSubject.html



## Hot Observable의 stream을 무한히 유지하기

이전에 RxJava를 이용해서 EventBus를 만들어 사용하였다.
그런데 Exception이 발생하면 stream이 종료되고 더이상 이벤트를 전달할 수 없는 쓸모없는 EventBus가 되었다.
그래서 Exception이 발생해도 Observable의 stream을 계속 유지할 수 있는 방법을 찾아보았다.

내가 하고자 하는 일은 state를 구독하고 state변경이 일어날때마다 handleStateChanged(state)를 호출해서 여러가지 동작(UI 조작 포함)을 하도록 하는 것이었다.
.observeOn(AndroidSchedulers.mainThread()) 를 빼고 하니 Exception이 발생했고, stream을 유지할 수 없었다.

retry(), onError...()구문, flatMap 사용, RxReplay, 이중 stream 유지하기까지 이것저것 다 적용해 보았지만 내가 만든 구조에서는 동작하지 않았다.
```java
        disposables.add(mRobotStateMachine.getRelay()
                .toFlowable(BackpressureStrategy.LATEST) //Backpressure처리를 위해 Observable을 Flowable로 변경
                .subscribeOn(Schedulers.computation())
//                .observeOn(AndroidSchedulers.mainThread())
//                .flatMap(state -> {
//                    Log.d(TAG, "flatMap process");
//                    return Flowable.just(state)
//                            .onErrorReturnItem(RobotStateMachine.ENVIRONMENT_CONCENTRATION_MODE)
//                            .onErrorResumeNext(Flowable.just(state))
//                            .onExceptionResumeNext(Flowable.just(state));
//                })
//                .onErrorReturnItem(RobotStateMachine.ENVIRONMENT_CONCENTRATION_MODE)
//                .onErrorResumeNext(Flowable.just(RobotStateMachine.ENVIRONMENT_CONCENTRATION_MODE))
//                .onExceptionResumeNext(Flowable.just(RobotStateMachine.ENVIRONMENT_CONCENTRATION_MODE))
//                .retry()
                .subscribe(
                       this::handleStateChanged //state -> handleStateChanged(state) 와 동일한 문법
                       error -> {
                           Log.d(TAG, "mRobotStateMachine onError() : " + error);
                           mLGVoiceActivationManager.startVoiceActivation();
                       },
                       () -> Log.d(TAG, "mRobotStateMachine onCompleted()")
                )
        );
```

결국 가장 simple한 방법으로 Exception이 발생가능한 곳에 try/catch 하는 것으로 일단락 되었다--;
```java
        disposables.add(mRobotStateMachine.getRelay()
                .toFlowable(BackpressureStrategy.LATEST) //Backpressure처리를 위해 Observable을 Flowable로 변경
                .subscribeOn(Schedulers.computation())
//                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(state -> {
                    try {
                        handleStateChanged(state);
                    } catch(Exception e) {
                        Log.d(TAG, "handleStateChanged Exception : " + e);
                    }
                }
                )
        );
```

- https://stackoverflow.com/questions/28969995/how-to-ignore-error-and-continue-infinite-stream/28971140#28971140
- https://www.google.co.kr/search?q=RxJava+infinite+stream&oq=RxJava+infinite+stream&aqs=chrome..69i57&sourceid=chrome&ie=UTF-8
- https://github.com/JakeWharton/RxRelay
- https://github.com/ReactiveX/RxJava/issues/3870