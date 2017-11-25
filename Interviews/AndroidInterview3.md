# R사 (1)
https://opentutorials.org/module/2870/16875
## Activity lifecycle -> onStart onResume 차이
* onCreate -> onStart -> onResume -> onPuase -> onStop -> onDestroy
* onStart는 최초 생성 될때 onCreate 이후 또는 Activity가 정지된 상태에서 전면으로 돌아올 때 호출(Activity가 비 정상적으로 소멸됬을 경우를 대비해 리소스들을 확인하고 재 할당 등의 작업들을 하는 것을 권장, receiver 등록이나 state initial)
* onResume은 Acitivity가 다른 작업에 의해 잠시 onPuase(focus를 잃음)되었다가 다시실행될때마다 호출(onResume 이전에 onActivityResult나 onSaveInstanceState가 불리므로 상태값을 가지고 준비과정을 거칠때는 onResume에서 수행이 필요. onStart와는 다르게 focus를 잃은시점에 동작을 멈추고 다시 실행해야하는 작업들을 수행.)
> https://stackoverflow.com/questions/9934248/android-when-to-use-onstart-onstop

> https://stackoverflow.com/questions/21302220/what-does-onstart-really-do-android

## 디자인패턴 아는 것을 말해보세요 (중복)
## AsyncTask 최근 변화
* 5.1부터 AsyncTask 내부의 Handler가 Singleton으로 변경.
> http://sjava.net/tag/android-asynctask/
* 3.2부터는 병렬처리를 위해 .executeOnExecutor(AsyncTask .THREAD_POOL_EXECUTOR, ...); 와 같이 사용해야 함.
> https://www.android-tech.io/category/%EA%B0%9C%EB%B0%9C-%EA%B2%BD%ED%97%98%EB%8B%B4/
* IO 관련 로직을 UI 레이어에서 처리해야 하는 점, 메인 스레드 외에서는 시작을 할 수 없는 것, 메모리 누수가 일어나기 매우 쉬운점 등을 이유로 RxJava를 사용하는 흐름도 보이고 있다.
> http://kimjihyok.info/2017/06/02/asynctask%EC%99%80-%EB%B9%84%EA%B5%90%ED%95%B4%EC%84%9C-%EB%8B%B9%EC%8B%A0%EC%9D%B4-rxjava%EB%A5%BC-%EB%8B%B9%EC%9E%A5-%EC%8D%A8%EC%95%BC%ED%95%98%EB%8A%94-%EC%9D%B4%EC%9C%A0/
## ListView, RecyclerView 차이와 ConstraintLayout behavior 적용이 왜 안되는지?
* RecyclerView와 ListView의 가장 큰 차이점은 Layout Manager 추가와, View Holder 패턴의 의무사용, Item에 대한 뷰의 변형이나 애니메이션할 수 있는 개념이 추가된 것 입니다. 
> http://itmining.tistory.com/12
## 최근 안드로이드 트렌드
* Kotlin, RxJava, Retrofit2, Dagger2등의 library, MVVM, etc??
> https://medium.com/@joongwon/%EC%89%B4%EC%83%88-%EC%97%86%EC%9D%B4-%EB%B0%94%EB%80%8C%EA%B3%A0-%EC%9E%88%EB%8A%94-%EA%B0%9C%EB%B0%9C-%ED%8A%B8%EB%A0%8C%EB%93%9C-f18ccad7ed69
## Interface 와 Abstract 에 대한 설명
* Interface는 파생될 클래스들이 구현해야할 공통점들을 모아놓은 객체이고,
Abstract 클래스는 파생될 클래스들이 variation할 수 있는 abstract method를 가진 클래스

<공통점>
- 추상클래스와 인터페이스는 선언만 있고 구현 내용이 없다.
- 그래서 자기 자신이 new를 통해 객체를 생성할 수 없으며, 상속받은 자식만이 객체를 생성할수있다.
- 상속받은 자식이 구현을 반드시 하도록 해야할 때 사용한다.

<차이점>
| 인터페이스(Interface) | 추상클래스(Abstract Class) |
| -------------------- | -------------------------
구현 객체의 같은 동작을 보장하기 위함 | 추상클래스를 상속받아 기능을 이용하고, 확장시키기 위함 
다중 상속 가능 | 다중 상속 불가능 
implments | extends
상수+추상메서드 형태 | 상수 + 생성자(가능) + 일반변수(가능)+일반메서드(가능)+추상메서드 형태

> http://private.tistory.com/20

> http://silentcargo.tistory.com/76

## Set, Map, List 에 대해 설명
| 인터페이스 | 구현 클래스 | 특징 | 
| --------- | ---------- | ---- |
List | LinkedList / Stack / Vector /ArrayList | 순서가 있는 데이터의 집합, 데이터의 중복을 허용한다.
Set | HashSet / TreeSet | 순서가 없는 데이터의 집합, 데이터의 중복을 허용하지 않는다. 
Map | HashMap / TreeMap / HashTable / Properties | 키(key)와 값(value)의 쌍으로 이루어진데이터의 집합, 순서는 유지되지 않고, 키는 중복을 허용하지 않으며 값의 중복을 허용한다.
> http://hackersstudy.tistory.com/26

> http://platonic.tistory.com/entry/Java-Collections-%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-List-Set-Map-Tree-Stack-Iterator-Enumeration

## 동기화 방법에 대해 설명
* 블록 synchronized, 메소드 synchronized, volatile, ConcurrentUtils의 Concurrent Collection들
> https://okky.kr/article/279692

> http://ooz.co.kr/71

## HashMap을 사용할 때 주의점은 무엇인가?
* 속도를 위해 동기화 지원안함. synchronizedMap 이나 ConcurrentHashMap 사용.
> http://ooz.co.kr/71

## 프로세스와 스레드에 대해서 설명 (중복)
## GC 과정에 대해서 설명(아래쪽 참고)
## 접근지정자에 대해서 설명
| 접근 지정자 | 접근 범위 | 동일 클래스 | 동일 패키지 | 다른 패키지의 자식 클래스 | 다른 패키지 |
| -- | -- | -- | -- | -- | -- |
| private | 동일 클래스 내에서만 | O |  |  |  |
| default | 동일 패지키 내에서만 | O | O |  | |
| protected | 동일 패키지와 상속 받은 클래스 내부 | O | O | O |  |
| public | 접근 제한 업음 | O | O | O | O |

## 오버로딩과 오버라이딩에 대해서 설명 (중복)
## 리플렉션에 대해 설명
* 구체적인 클래스 타입을 알지 못해도, 컴파일된 바이트 코드를 통해 역으로 클래스 정보를 알아내어 클래스를 사용할 수 있는 기법.
> http://hiddenviewer.tistory.com/114

> http://hiddenviewer.tistory.com/115

## Parcelable 에 대해서 설명
* Parcelable이나 Serializable 인터페이스를 구현한 객체는 intent에 putExtra()로 객체를 넘길수 있다.
* serialization 은 reflection 방법을 사용하여 serialization 을 하는데, parcelable 은프로그래머가 직접 바로 setting 을 해주기 때문에 빠르다.
* Kotlin Android Extensions에 Parcelable을 자동으로 생성해주는 plugin도 제공한다.
> http://isntyet.tistory.com/113

> http://developer88.tistory.com/64

## Strict Mode 에 대해서 설명
* 메인 스레드에서 디스크 접근, 네트워크 접근등의 비효율적인 작업을 하려는 것을 감지하여 사용자에게 알려줌.
> http://noota.tistory.com/entry/StrictMode-%EA%B0%84%EB%8B%A8-%EC%A0%95%EB%A6%AC

> http://www.kmshack.kr/2013/04/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EC%95%B1-%EC%84%B1%EB%8A%A5-%EC%B5%9C%EC%A0%81%ED%99%94-1-%EC%A6%89%EA%B0%81%EC%A0%81%EC%9D%B8-%EB%B0%98%EC%9D%91%EC%9D%84-%EC%9C%84%ED%95%9C-strictmode/

## 일반 뷰와 Surface View 의 차이
* 일반 View는 onDraw 메소드를 시스템에서 자동으로 호출해줌으로써 화면을 그린다. 그래서 화면에 늦게 그려질 수도 있다.
SurfaceView는 그리기를 시스템에 맡기는 것이 아니라 스레드를 이용해 강제로 화면에 그림으로써 원하는 시점에 바로 화면에 그릴 수 있다.
그래서 SurfaceView는 애니메이션이나 동영상과 같이 연산처리가 많이 필요한 뷰를 위해 사용된다.
SurfaceView는 더블 버퍼링 기법을 이용하여 SurfaceHolder가 Surface에 미리 그리고 이 Surface가 SurfaceView에 반영되는 방식이다.
> http://blog.naver.com/PostView.nhn?blogId=muri1004&logNo=221054311714&categoryNo=0&parentCategoryNo=0&viewDate=&currentPage=1&postListTopCurrentPage=1&from=postView
## Handler, Looper 에 대해서 설명(중복)
## ANR 에 대해서 설명 피하려면 어떻게?
* Main Thread(UI Thread)가 일정 시간 어떤 Task에 잡혀 있어 응답이 없는 상태를 경고.
* Input 이벤트(키를 누르거나 화면을 터치하는 등)에 5초안에 반응을 하지 않을 때
* BroadcatReceiver 가 10초내로 실행을 끝내지 않을 때 (UI가 없는 브로드캐스트 리시버, 서비스도실행 주체가 메인스레드이므로 긴 시간을 소모하는 작업인 경우 ANR을 발생시킨다.)
* <예방>
    - 시간 소모가 많은 작업은 스레드를 통해 처리하라.
    - onProgressUpdate()를 통해 사용자에게 프로그레스바 등을 이용해 작업의 진행 과정을 안내해기다리도록 한다.
> http://itmining.tistory.com/3

## 백키로 앱을 종료했을 때 프로세스는 종료되나요, 되지 않나요?
* 종료 됨.
## 종료되면 왜 종료되나요? 종료되지 않으면 왜 종료되지 않나요?
* Back키는 사용자의 종료 의도가 있는 직접적인 행동이므로 Activity가 onPause -> onStop ->onDestroy 과정이 정상적으로 동작된다.
* 작업을 종료하고 싶지 않다면 Service로 작업을 돌려야한다.
> https://m.blog.naver.com/PostView.nhn?blogId=highkrs&logNo=220488213481proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F
## Zygote 에 대해서
* Zygote 프로세스는 애플리케이션이 실행되기 전에 실행된 **가상 머신의 코드 및 메모리 정보를 공유**함으로써 애플리케이션이 실행되는 시간을 단축, 여기에 더해 안드로이드 프레임워크에서 동작하는 **애플리케이션이 사용할 클래스와 자원을 미리 메모리에 로딩**(preload resources/classes)해 두고 이러한 자원에 대한 연결 정보를 구성한다. 새로 실행되는 안드로이드 애플리케이션은 필요한 자원들에 대한 연결정보를 매번 새롭게 구성하지 않고 그대로 사용(fork())하기 때문에 빠르게 실행된다.
> http://dev-ahn.tistory.com/87
