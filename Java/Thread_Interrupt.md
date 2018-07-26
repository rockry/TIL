# Java Thread의 Interrupt

> 관련 함수 : isInterrupted(), interrupt(), sleep(), wait()

 - isInterrupted() : 현재 스레드가 인턴럽트 신호를 받았는지 리턴.

 - interrupt() : 스레드에게 인터럽트를 건다.

 - sleep(long time) : time시간 동안 스레드를 정지시키며, 인터럽트를 받을 경우 정지를 해제하고 InterruptException을 발생시킴.

 - wait() : sleep과 동일합니다. 다만 lock영역에서만 사용가능하고 lock을 놓습니다.

작업을 하다가 당황한 상황이.. interrupt() 를 걸었는데, isInterrupted() 는 false를 리턴하고 있었다.
interrupt()가 제대로 안걸린다고 생각하고 있었는데..

쓰레드가 대기중(sleep, wait...) 상태.

두 경우 인터럽트 처리가 달랐다.

쓰레드가 활성중인 상태에 interrupt메세지를받으면 interrupt상태가 true가 된다.

isInterrupted() 가 true를 반환하고, 이걸통해 반복문을 빠져나올 수 있다.

*그러나* 대기중인 상태에서는 interrupt 상태가 true가 되지 않습니다.

InterruptException 만 발생시키고 true가 되지않습니다.

사실 대기상태에서 interrupt를 받으면 상태가 true가 되었다가 나가면서 다시 false가 된다고 한다.

그래서 나는 InterruptedException 시 intterupt()를 다시 호출해 줬다.. 
```java
        while(!isFinished && !isInterrupted()) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                interrupt();
            }
        }
```

참조 :
- http://blog.naver.com/PostView.nhn?blogId=skykingkjs&logNo=150171169241