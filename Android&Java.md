# 안드로이드 뷰의 생성 과정
![안드로이드 뷰의 생성 과정](../images/안드로이드뷰의생성과정.jpg "Process of creating View in Android")

# 안드로이드 액티비티 생명주기 
![안드로이드 액티비티 생명주기](../images/액티비티생명주기.jpg "Lifecycle of Activity in Android")

# enum 의 장점
간결한 코드로 인해 개발 및 유지보수가 용이하게 합니다. 

일반 클래스와 다르게 switch case 문에서도 사용이 가능하며, final static 으로 정의된 경우의 동일 이름의 중복이 문제가 될 수 있는데 이런 부분을 해결할 수 있습니다. 
 
# 안드로이드에서 Enum 사용을 자제시켰는데 그 이유는 무엇인가?
The price of ENUMs : https://brunch.co.kr/@oemilk/94

ENUM의 각 값은 객체이며 각 선언은 객체를 참조하기 위해 런타임 메모리를 사용합니다. 따라서 ENUM 값은 Integer 또는 String 상수보다 많은 메모리를 사용합니다. 

단일 ENUM을 추가하면 최종 DEX 파일의 크기 가 증가합니다. 또한 런타임 오버 헤드 문제가 발생하고 응용 프로그램에 더 많은 공간이 필요합니다.
 
Android에서 ENUM을 과도하게 사용하면 DEX 크기가 증가하고 런타임 메모리 할당 크기가 늘어납니다.
 
응용 프로그램이 더 많은 ENUM을 사용하는 경우 ENUM 대신 정수 또는 문자열 상수를 사용하는 것이 좋습니다. 
 
# 대용량 Bitmap 을 불러올 경우 메모리 문제가 있기 쉬운데 이럴 때 어떻게 처리하는가?
 inJustDecodeBounds 설정하기 - Scaled Down된 버전의 이미지 메모리에 로딩하기 - 이미지 전처리 메소드 생성하기 - ImageView에 출력하기

# String Literal 
String a = new String("abc"); 는 Heap 내의 일반 객체를 생성하고, 그 객체의 Reference 를 가지게 되는 것입니다 .

그리고 String b = "abc"; 문장은 Heap 내의 String constant pool 에 저장하거나, 이미 존재하는 문자열이라면 해당 인스턴스를 여러 Reference 가 참조한다고 할 수 있습니다.

특별한 이유가 없다면 String 문자열을 사용하는 것이 읽기 쉽고 컴파일러가 코드를 최적화할 수 있는 기회를 제공합니다. 
  
# 프로세스와 스레드의 차이
프로세스는 운영체제로 부터 자원을 할당받는 작업의 단위이고 스레드는 프로세스가 할당받은 자원을 이용하는 실행의 단위입니다. 

프로세스는 자신만의 고유 공간과 자원을 할당 받아 사용하지만 그에 반해 스레드는 다른 스레드와 공간과 자원을 공유하여 사용하는 차이가 있습니다. 
 
# ArrayList vs LinkedList
http://seeit.kr/36

ArrayList - 데이터 검색에 유리하며, 추가/삭제 시에는 성능을 고려해야함

LinkedList - ArrayList 에 비해 데이터의 추가/삭제에 유리하지만 검색 시에는 성능을 고려해야함
 
# Quick Sort  
 
# Iterator 를 쓰지 않고 직접 참조 시 문제점
내부가 노출되고 자료 구조 마다 순환하는 방식이 달라진다. 
 
# DP란? 
분할 정복과 같은 접근 방식을 가지고 있지만, 다른 점은 
부분 문제가 여러 번 사용될 경우 중복 계산이 아닌 한번만 계산하고 저장하여 재활용하는 방법이다. 
(캐시와 유사)
 
# 제네릭이란? 
클래스를 정의할 때에는 데이터 타입을 확정하지 않고, 인스턴스를 생성할 때 데이터 타입을 지정하는 기능을 제네릭이라고 한다. 
 
# 싱글턴 더블체크드락
```Java
public class Singleton {
    private volatile static Singleton singleton;
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized(this) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
    private Singleton() {
    }
}
```

# Singleton 동기화  
중첩 클래스를 이용한 Holder 를 사용하는 방법. 

getInstance 가 호출되기 전까지는 Singleton 인스턴스가 생성되지 않고, getInstance 가 호출되는 시점에 SingletonHolder가 참조되고 그 때 Singleton 객체가 생성된다. 

지연된 초기화를 사용하기 때문에 메모리 점유율 면에서 유리하고 Synchronized 키워드를 사용하지 않기 때문에 성능 문제도 보이지 않는다. VM 이 클래스를 초기화하기 위한 필드 접근은 동기화하기 때문에 동기화 검사도 필요가 없다. 
```java
public class Singleton {
    private Singleton() {}
    private static class SingletoneHolder {
        public static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getSingletonObject() {
        return SingletonHolder.INSTANCE;
    }
}
```
http://asfirstalways.tistory.com/335
 
# Heap Data Stack 영역 
- 코드 영역 : 실제 프로그램 코드가 적재되는 영역
- 데이터 영역 : 프로그램이 구동되는 동안 항상 접근 가능한 변수가 저장되는 영역이며 전역 변수, 정적 변수를 할당하기 위한 공간
- 스택 영역 : 함수 내의 정의된 지역 변수가 저장되는 영역 
- 힙 영역 : 위에서 관리되지 않는 다른 형태의 데이터를 저장하기 위한 공간. 보통 동적 할당이 해당한다. 
 
# Vector
add, remove 와 같이 삽입, 삭제하는 자료구조인 것은 동일 하나 메소드에 동기화 키워드들이 붙어있습니다. 

따라서 성능 저하가 있을 수 있으며 요즘은 많이 쓰이지 않습니다. 

# 서비스에서 뷰를 띄울 수 있는가? 
가능하다. WindowManager 를 통해서 Inflate 된 Layout 을 WindowManager에 붙이는 방법을 이용하면 된다. 

# Lambda 식이란? 
"식별자 없이 실행 가능한 함수 표현식"
> 기존 
```Java
new Thread(new Runnable() {
    @Override
    public void run() {
        System.out.println("Hello World.");
    }
}).start();
```

> 람다 
```Java
new Thread(()->{
    System.out.println("Hello World.");
}).start();
```

# Doze 모드란? 
1. 배터리가 충전되고 있지 않음
2. 휴대폰이 물리적으로 움직이지 않음
3. 스크린 Off 상태로 방치됨

위 세가지 조건을 모두 만족할 때 Doze 모드에 진입하게 된다. 

진입하게 되면 아래와 같이 동작한다. 

1. 앱의 네트워크와 CPU 의 사용을 제한
2. Doze 모드 중이더라도 시스템이 주기적으로 Doze 에서 빠져나와서 미룬 작업을 하고 다시 Doze 로 진입한다. 
3. WakeLock 이 무시된다. 
4. Wi-Fi 스캔을 하지 않는다. 
 
# 허프만 코드 알고리즘
자주 쓰이는 문자에는 작은 bit 를 할당하고 덜 쓰이는 문자에는 큰 bit 를 할당해서 문자열을 전체적으로 압축하는 개념이다.

AABBAC 가 있다면 가장 많이 사용하는 순으로 A에는 0, B에는 01, C에는 11을 부여하여 000101011 으로 압축한다. 따라서 48bit 를 9bit로 압축할 수 있는 기법이 되는 것이다. 
 
# ListView vs RecyclerView  
http://itmining.tistory.com/12

RecyclerView와 ListView의 가장 큰 차이점은 Layout Manager와, View Holder 패턴의 의무사용, Item에 대한 뷰의 변형이나 애니메이션할 수 있는 개념이 추가되었습니다. 

# Annotation 이란?  
어노테이션은 소스 코드에 메타데이터를 삽입하는 것이기 때문에 잘 이용하면 구독성 뿐 아니라 체계적인 소스 코드를 구성하는데 도움이 됩니다. 

쉽게 말해서 "이 속성을 어떤 용도로 사용할까, 이 클래스에게 어떤 역할을 줄까?"를 결정해서 붙여준다고 볼 수 있습니다.
 
# Annotation 생성 방법 (관점프로그래밍) 
어노테이션의 본질적인 목적은 소스 코드에 메타데이터를 표현하는 것입니다. 

단순히 부가적인 표현 뿐만 아니라 리플렉션을 이용하면 어노테이션 지정만으로 원하는 클래스를 주입 등이 가능합니다

# Multi Dex 란? 
DEX (Dalvik Executable) 파일은 안드로이드 달빅 가상 머신 (DVM) 에서 실행되는 파일 포맷인데 해당 파일의 제약으로 함수 개수는 65K (65,536)개를 초과할 수 없습니다. 

이를 해결하기 위해서 Multidex 개념이 나온 것이며 APK 당 하나의 dex 를 생성하는 것이 아닌 여러 개의 dex 를 만들어서 이런 문제를 해결하는 것 입니다. 
 
# Binary Search Tree

# Equals 를 Override 할 때, 반드시 Override 해야하는 함수 

http://aroundck.tistory.com/244

hashCode 를 override 해야합니다. 

하지 않게 되면 hashCode 의 보편적은 계약을 위배하므로 HashMap, HashSet, HashTable 을 포함하여 해시 기반 컬렌션들이 정상 동작하지 않을 가능성이 높습니다. 

hashCode 의 보편적 계약사항 
1. 같은 객체에 한 번 이상 호출되더라도 hashCode 는 같은 정수를 반환
2. equals 가 동일하다면 hashCode 도 같아야 한다.
3. equals 가 다를 때, hashCode 도 반드시 달라야 할 필요는 없지만, 다르면 성능이 향상된다.  

# Android 서비스는 메인 스레드에서 실행
서비스는 스레드도 아니고, 별도의 프로세스도 아닙니다. Service는 Android Component의 하나로 Service 자체는 main thread에서 동작한다.

앱이 실행 중일때만 필요한 기능이라면 Thread를 사용하는게 맞고 

앱이 실행 중이지 않을 때 실행되어야 한다면 Service를 이용해야 한다.

Ex) 네트워크 통신,음악재생,I/O 작업등
 
# HashMap 자료구조 
http://d2.naver.com/helloworld/831311

Map 을 구현하기 위해 해시를 사용한다. 해시 테이블은 키와 값 쌍으로 이루어진 구조로 접근 시 O(1)으로 속도가 아주 빠르다.  키는 중복이 허용되지 않고, 값은 중복이 허용된다. 

hash충돌시 linkedlist->tree의 구조를 이용한다.

HashTable은 thread safe하지만 하위 호환성을 위해 존재하며 잘 업데이트 되지 않는다.
 
# Composite 패턴 
객체를 트리 구조로 구성하고 개별 객체와 복합 객체(Composite) 가 구성된다. 

Client 에서는 두 객체를 동일하게 사용할 수 있다. 

Client 는 Component 의 인터페이스, 추상클래스를 상속받으며 해당 메소드 중 연관된 메소드만 재정의한다 
 
# 상속의 위험성  
다이아몬드 문제가 있을 수 있으며, 상속을 고려하여 구성된 객체가 아니라면 캡슐화가 깨져 부모와 자식 사이에 강한 결합이 생길 가능성이 있다. 
 
# 객체지향언어의 4대 특징
https://m.blog.naver.com/PostView.nhn?blogId=itperson&logNo=220817680631&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F
1. 추상화 : 대상의 특성 중 불필요한 부분을 무시하고 필요한 공통점만을 다루어 중요한 부분을 강조기위해 추상화 시킴.
2. 캡슐화 : 데이터 캡슐화를 통해 상태와 행동을 하나의 단위로 묶음. 또는 외부에서 객체의 상태를 변경할 수 없도록 은닉화. 재사용성 올라감.
3. 상속성 : 부모클래스의 속성과 기능을 상속받아 동일하게 사용.
4. 다형성 : 동일 요청에 대해 서로 다른 방식으로 응답할 수 있도록 만드는 것
 
# 서비스 생명주기 
![서비스생명주기](../images/서비스생명주기.png "서비스생명주기")
 
# 서비스에서 Bind 와 Start Service 를 섞어쓰지 않는 이유
bindService 가 된 상태에서 startService 를 하게 되면 이전(bindService)는 무시되고 새로운 상태로 변경된다.

# Volatile vs Synchronized 
volatile 은 변수에 한해서만 동기화 해주는 도구이며, synchronized 는 작업에 대해서 동기화를 지원해주는 도구입니다. 
 
# Java UnitTest 
http://www.nextree.co.kr/p11104/

자바에서는 JUnit 단위 테스트 Framework 를 지원합니다. 

기본적으로는 assertEquals(예상 값, 실제 값) 으로 사용
 
# View dispatchTouchEvent 
dispatchTouchEvent 는 단지 뷰를 탐색해 나가는 기능을 위한 함수이고, 이벤트를 처리하려면 onTouchEvent 를 재정의하여 처리하여야 한다. 

이벤트 발생 시에 각 레이어의 dispatchTouchEvent 가 가장 먼저 호출된다. 역할은 하위 레이어의 dispatchTouchEvent 를 호출하고 하위 레이어가 터치 이벤트를 처리했는지 결과를 받아서 처리하지 않은 경우에 자기 자신의 이벤트 처리 메서드(onTouch, onTouchEvent) 로 이벤트를 보낸다. 그리고 이벤트 처리 여부를 상위 dispatchTouchEvent에 리턴한다. 
 
# Dalvik 과 ART 의 차이  
Dalvik 은 JIT "Just-In-Time" 방식으로 코드를 사용할 때, 컴파일하며 

ART는 AOT "Ahead-Of-Time" 방식으로 코드를 컴파일 해놓고 사용하는 방식 

실행 시 컴파일해서 사용하는 Dalvik 은 실행 시간 및 성능에서 단점을 가지고, 설치 시간에는 ART 가 단점을 가짐 
 
# Android N 변경사항
- 멀티 윈도우 
- 알림창 업데이트
- 배터리 최적화, 데이터 절감 기능 

개발 측면 

- 프로파일 가이드 JIT/AOT 컴파일
- 더 나은 도즈 모드 (배터리 절약)
- 백그라운드 최적화 
- TextureView 대신 SurfaceView 권장 (배터리 소모 최적화)
- 인스턴트 앱
- ART 가 AOT + JIT 로 변경 
- 멀티 윈도우
 

# 안드로이드 런타임 퍼미션
Android 6.0 마시멜로우부터 앱에서 해당 권한이 필요할 때마다 사용자로부터 권한을 허가받도록 변경되었습니다. 그리고 권한을 허가했더라도 설정을 통해서 권한을 허용/거부를 할 수 있습니다. 
 
# 안드로이드 Memory Leak
- 앱의 상태와 관계없이 존재하고 액티비티에 참조로 유지하는 프로세스 전역 정적 객체에 의해서 발생 
- 액티비티에서 강한 참조를 가진 스레드가 액티비티의 수명보다 오래 지속하는 경우 
 
# Strong Reference vs Weak Reference in Java

# 프로세스와 스레드의 차이는 무엇입니까, 프로세스는 어떠한 영역을 공유하고 스레드는 어떤 영역을 공유할 수 있는지 자세하게 설명해주세요. 
프로세스는 자신만의 고유 공간과 자원을 할당받아 사용하지만 스레드는 다른 스레드와 공간과 자원을 공유하여 사용하는 차이가 있습니다. 프로세스는 코드, 데이터, 스택, 힙 영역을 고유하게 가지고 있으며 스레드는 코드, 데이터, 힙 영역을 공유할 수 있습니다. 
 
# 디자인 패턴에 대해서 알고 있는 것을 모두 말해주세요. 
singleton, builder, composite, strategy, adapter, facade 답변
각각 자세하게 설명해주세요. 
 
# 말씀하신 것 중 singleton 은 논란이 있는 부분이 있는데요. 어떤 부분인지 아시나요?  
멀티스레드 환경에서 문제가 있고, synchronized 를 이용하면 해결되지만 비용이 비싼 측면이 있어 지연 초기화를 통한 Holder 를 이용하는 방법이 있습니다. 
 
# 자신을 UI Driven 인지 Data Driven 엔지니어인지 어느쪽에 가깝다고 생각하시나요?
UI Driven 에 가깝다고 생각합니다. 
 
# 객체지향의 4대 특징이 무엇인가요?
추상화, 캡슐화, 상속성, 다형성 
 
# 각각을 자세한 예를 들어서 설명해주실 수 있나요?
추상화란 복잡한 현실의 문제를 공통적인 특징을 뽑아서 그룹화 하는 것을 의미합니다. (클래스)

캡슐화란 사용 방법만을 알려주고 내부 구조는 숨겨서 데이터를 보호하는 것을 의미합니다. (추상 클래스, 인터페이스)

상속성은 부모의 기능을 자식이 물려받는 것을 의미합니다. 

다형성은 하나의 메소드나 클래스가 이걸 이용하는 방법에 따라서 다양한 방법으로 동작하는 것을 의미합니다. 

(인스턴스 생성 후 부모 메소드로 사용하는 경우와 자식 메소드로 사용하는 경우를 예를 듬)
 
# 인텐트 등의 프로세스 간의 통신이 아닌 앱 내부적으로 이벤트를 받았을 때, 업데이트 하는 방법에는 무엇이 있나요?
 
# 백그라운드 작업을 할 때 안드로이드에서는 어떤 방법을 이용할 수 있나요?
Handler, AsyncTask 설명
 
# Activity class 를 이용해서 바로 백그라운드 스레드를 돌릴 수 있는 방법?
기억이 안나서 대답을 못 했는데 runOnUIThread 라고 말해줌
 
# 다이나믹 프로그래밍이란 무엇인가?
동적할당법을 피보나치를 예를 들어서 설명했는데, 다이나믹 프로그래밍의 다른 의미를 물어본듯..

# 네이티브힙
Java Object 가 아닌 Native Object 가 거주하는 공간이며 OS 차원에서 결정된다. 
- 가장 기초 Thread 를 제외한 모든 Thread
- Buffer, Lookup table 및 ZIP 관련 작업 (GZIPOutputStream methods)
- Swing, AWT 하에 native GUI 와 관련된 Buffer 및 구조체
- JNI Code 에 의해 사용된 Data
- Just-in-time(JIT) Compiler 및 Mixed-Mode-Interpreter 를 지원하는 함수
- JIT 관련 수행 코드 
 
# MVP 패턴 
MVC 패턴과는 다르게 입력이 View 에서 처린된다. Presenter 는 View의 인스턴스를 갖고 있으며 View 와 1대1 관계이고, 그에 해당하는 Model 의 인스턴스 또한 갖고 있기에 View 와 Model 사이에서 다리와 같은 역할을 한다. View 에서 이벤트가 발생하면 Presenter 에게 전달해주고 Presenter 는 해당 이벤트에 따른 Model 을 조작하고 그 결과를 바인딩을 통해 View 에게 통보하여 View 를 업데이트 시켜준다. MVC 패턴과는 다르게 Presenter 를 통해 Model / View 를 완벽히 분리해 주기 때문에 View 는 Model 을 따로 알고 있지도 앓아도 됨, 단점은 View 와 1:1 관계이기 때문에 View와의 의존성이 매우 강하다.

# Parcelable vs Serializable
Serializable 은 Serialize 가 필요한 순간에 알아서 Serialize 해주는 maker interface 이다. 

Parcelable 은 IPC (Inter Process Communication) 에 최적화된 녀석으로 Serialize 보다 속도가 빠르다. 

속도가 차이나는 이유는 Serialization 은 Reflection 방법을 사용하여 Serialization 을 하는데, Parcelable 은 프로그래머가 직접 바로 Setting 을 해주기 때문에 빠른 것이다. 
 
# Comparable 
Comparable - 기본 정렬 기준을 구현하는데 사용

Comparator - 기본 정렬 기준 이외에 다른 기준을 정렬하고자 할 때 사용 
 
# RxJava란? 
RxJava란 Reactive Programming 을 하기 위한 라이브러리인 Rx(Reactive Extensions)의 JVM 판 입니다. 

이벤트를 정의한 Observable 인스턴스에 대해 짧은 함수를 엮은 스트림 같이 이벤트 결과 데이터를 가공하는 처리를 정의, 지연 실행, 비동기 콜백을 할 수 있습니다. 
 
# Atomic Type
Synchronized 키워드를 AtomicBoolean, AtomicInteger 를 이용하여 변경 가능하다. 
 
# 데드락을 해결하려면?  
데드락 발생 조건은 아래와 같다. 
1. Mutual Exclusion (자원에 대한 동시접근 불가)
2. Hold and Wait (점유하고 기다리기)
3. No Preemption (자원을 뺏어오지 못함)
4. Circular Wait (순환 형태로 대기함)

데드락을 예방 하려면 위 4가지 조건 중 하나라도 발생하지 않도록 하면 해결됨, 

프로세스가 자원을 요구하는 시점에서 자원을 할당해도 안전한지를 검사하여 데드락을 방지하는 은행원 알고리즘,

교착 상태가 발생하는 것을 아예 막지 않고, 발생 시에 해결, 

거의 무시해도 좋을 확률의 데드락이라면 무시 

# 해시코드란?
객체를 구별하기 위해서 고유한 정수값으로 출력시켜주는 메소드이다. 

객체에 대한 서명, checksum 과 같은 것으로 보통 객체의 내용을 바탕으로 만들어진 난수처럼 보이는 객체 인식용 정수이다. 
 
# 해시맵을 만들려면 무슨 자료구조를 쓸까? 
기본적인 자료구조는 key, value 값을 저장하고 있는 Entry 가 있고 각 entry 를 저장하기 위한 array table이 있다. 

# Android에서 @Inject, @Test
http://d2.naver.com/helloworld/342818

# ArrayMap, HashMap
HashMap : 키에 대한 해쉬값을 이용하여 값을 저장하고 조회하며, 키-값 쌍의 개수에 따라 동적으로 크기가 증가하는 Map, 데이터조회시 항상 O(1)의 장점.
ArrayMap : 안드로이드에서 제공. HashMap과 같은 기능을 제공하지만 큰 배열 하나 대신 작은 배열 두 개를 이용해 낭비하는 메모리를 줄임. But 데이터 처리 비용 증가.
ArrayMap을 사용하기 좋은 경우 : 데이터 객체수가 1000개 미만, 데이터 처리(추가, 삭제, 조회)가 잘 일어나지 않는 경우.
SparseArray : Key Value에 객체(참조형)을 이용해야 하는 ArrayMap과 달리 SparseArray는 기본형(Primitive Type)을 이용할 수 있음.
https://brunch.co.kr/@oemilk/97

# Java8 Optional
실제 레퍼런스를 한번 감싸는 래퍼 객체를 만들어 null 체크를 내부로 숨겨 반복적인 null체크를 없애줌.
```java
public static void main(String args[]) {
   String str = "hello";
   Optional<String> o1 = Optional.of(str); // str이 null이면 NPE 발생
   Optional<String> o2 = Optional.ofNullable(str); // str이 null이면 빈 Optional 객체 반환
   Optional<String> o3 = Optional.empty(); // 빈 Optional 객체 반환
}
```
출처: http://multifrontgarden.tistory.com/131 [우리집앞마당]

# Retrofit, OkHttpClient

