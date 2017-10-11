# SK 테크엑스 면접
2017년 5월 12일 금요일
 
1.	Java Collection Framework 에 대해서 설명하라
2.	Android View 가 생성되는 Callback 과정에 대해서 설명하라
3.	Android 생명주기를 설명하라 
4.	Closure 란 무엇인가
5.	JavaScript 단에서 앱에서 데이터를 공유하기 위한 방법은 무엇인가
6.	현재 구현하고 있는 앱에 대해서 설명하고 클래스 다이어그램으로 표현하라 
7.	Java 에 Class A 가 있고 A 를 상속한 Class B 가 있을 때 List 를 사용하면 A 는 사용할 수 있지만 B 는 사용할 수 없다 이유는 무엇인지 아는가
8.	Java 에서 == 과 equals 를 이용하는 것의 차이는 무엇인가?
9.	Java 에서 equals 와 hash 를 같이 상속받게 하는 이유는 무엇인가?
10.	Java 에서 hash 번호는 어느 경우에 사용하는가?
11.	메시지에서 첨부할 때, Bitmap 을 사용할텐데 Bitmap 을 사용하면 메모리에 문제가 생기는 하는 방법은 무엇인가?
12.	JavaScript 2 Way Data Binding 의 과정을 아는가 
13.	Android 에서 Enum 사용을 자제 시켰는데 이유가 무엇인가
14.	Div 와 Span 의 차이 
15.	옮기려는 이유
16.	자신의 장점 어필
17.	배열과 ArrayList 의 차이점 (ArrayList 는 어떻게 메모리를 할당하나?)
18.	Linked List 와 Array List 의 차이점
19.	Weak Reference 와 Strong Reference 에 대해 설명하라  

# N사 전화면접
https://opentutorials.org/module/2870/16572
-	이직 사유
    * 제조사에서 제품 중심의 개발 프로세스 및 관점하에 SW 개발을 진행했는데, 서비스 관점에서의 SW 개발에 관심이 있었습니다. 개인적으로 서비스 측면에서의 기술적 완성도를 높이는데 한계를 느꼈고, 이직을 통해서 개발자로서 더 성장하고 싶었습니다. 서비스 개발의 전문가들에게 많이 배우고 커뮤니케이션 하면서 기술적인 성장을 이루고 싶었습니다.
-	정렬 알고리즘을 알고 있는대로 말해주세요
    * Insertion, Selection, Bubble, Merge, Quick, Radix
-	퀵소트를 말했는데, 해당 정렬 알고리즘을 상세히 설명해주세요.
    * 피벗을 중심으로 피벗보다 작은 수와 큰 수를 양쪽으로 나누는 연산을 반복하여 분할정복을 사용합니다.
    * 1/2로 나누는 방식으로 n번씩 비교를 하기때문에 O(nlogn) 시간복잡도(time complexity)를 가집니다.
-	프로세스와 스레드의 차이는 무엇입니까?
    * 프로세스는 프로그램의 실행단위이고 스레드는 그 프로그램의 Task당 실행단위 입니다.
    * 하나의 프로세스에서 여러개의 스레드가 수행될 수 있습니다.
-	프로세스는 어떠한 영역을 공유하고 스레드는 어떤 영역을 공유하나요.
    * 프로세스는 프로세스마다 고유의 코드, 데이터, 스택, 힙 영역을 가지고 있으며, 스레드는 고유의 스택영역을 가지고 있고, 나머지 영역을 공유 합니다.
-	디자인패턴을 알고 있는대로 알려주세요
    * singleton, factory, adapter, facade, decorator, proxy, strategy, iterator, observer
    https://www.slideshare.net/jinhwason/ss-60227208
    http://gyrfalcon.tistory.com/entry/%EB%94%94%EC%9E%90%EC%9D%B8%ED%8C%A8%ED%84%B4-%EC%A0%95%EB%A6%AC
    http://hyeonstorage.tistory.com/99
    http://supark7.tistory.com/

    | 생성패턴 | 객체의 생성방식을 결정하는 패턴 |
    | --------- | --------- |
    | Factory Method | 슈퍼클래스에서 파생된 클래스들이 하나의 생성작업함수(인터페이스)를 재정의하여 사용. 어떤 객체를 생성할지 각각의 파생 클래스들이 결정. |
    | Abstract Factory | Factory를 추상화하여 멤버객체구성을 사용하는 측에서 결정.(Strategy + Factory), 여러 객체를 담은 Factory에서 객체의 구성을 각각 다르게 구성할 때 사용. |
    | Singleton | 프로그램에 인스턴스가 하나만 존재하고 어디서든 인스턴스에 접근할 수 있도록 하는 패턴 |

    | 구조패턴 | 객체를 조직/구조화 하는데 유용한 패턴 |
    | --------- | --------- |
    | Facade | 여러가지 API를 통합한 단일 API를 제공함으로써 모든 서브시스템을 컨트롤, 여러 객체를 감싸서 인터페이스를 단순화 |
    | Adapter | 객체를 감싸서 다른 인터페이스 제공 (인터페이스 불일치 해결) |
    | Decorator | 객체의 재귀적 포함을 사용한 기능의 동적 추가(Java IO), 다른 객체를 감싸서 새로운 행동 추가 |
    | Proxy | 객체를 감싸서 객체에 대한 접근 제어(래퍼) |

    | 행위패턴 | 객체의 행위를 조직화하는데 유용한 패턴 |
    | --------- | --------- |
    | Iterator | 컬렉션 내부를 드러내지 않으면서 컬렉션 내의 모든 객체에 대한 탐색 작업 처리 |
    | Observer | 객체의 상태변화를 관찰하는 관찰자들을 객체가 가지고 있다가, 상태변화시 통지하는 패턴(1:n) |
    | Strategy | 알고리즘을 구조화하여 교체하여 사용할 수 있도록 한 구조(클래스가 호출할 Strategy 인터페이스를 각 구현체에서 각자의 동작 정의) |

-	말씀하신 디자인패턴을 각각 예를 들어 설명해주세요.
    * singleton : 프로그램 전체에서 하나의 객체를 공유하기를 원할때. 로거, 프로그램 전체 매니저, 뮤직플레이어 등
    * factory : 버튼과 스크롤을 가진 객체를 버튼과 스크롤 종류에 따라 객체의 종류를 나눌때. 예) 객체(원형버튼, 원형스크롤), 객체(사각버튼, 사각스크롤)
    * facade : 가입 신청 시, 회원가입 + 기관 생성 + 기관 소속 + 승인까지의 API통합
    * adapter : 다양한 인터페이스에서 원하는 데이터를 얻을수 있게 해줌. ArrayAdapter CursorAdapter 등 다양한 Dataset에 대해, 모두 getView(), getCount(), getItem()등 통일된 데이터를 얻을 수 있게 함. (http://sunphiz.me/wp/archives/1292)
    * decorator : 원래 객체를 포함하고 그 객체를 이용하여 추가적인 동작을 구현. 커피(에스프레소/드립/디카페인) + 데코(우유/두유/휘핑) => 데코 객체는 커피를 포함하고 있음.
    * proxy : 캐싱, 방화벽, 동기화 등
    * strategy : 동작을 위한 인터페이스를 다양한 동작에 맞게 구현. Shooter interface를 SoccerShooter / BasketballShooter 에서 각각의 동작 구현.
    * iterator : 리스트 iterator
    * observer : 방송을하는 주체가 있고 각 observer는 방송을 listen한다. A.register, B.register 후 방송국.update 하면 A와 B 각각의 update가 호출되어 방송국의 update를 들을 수 있다.
    https://www.slideshare.net/soomong/pattern-4797069
    http://huiyu.tistory.com/category/Programming/DesignPatterns
    http://copynull.tistory.com/category/Gof%20%EB%94%94%EC%9E%90%EC%9D%B8%20%ED%8C%A8%ED%84%B4?page=2
    https://gist.github.com/dwpark1112/a164d1cdc4d1c771b0972080f616394c
-	언급하신 Singleton 은 논란이 있는 부분이 있습니다. 어떤 부분인지 아시나요?
    * Singleton은 멀티스레드 환경에서 동기화 문제가 있습니다. synchronized를 이용하면 해결되지만 비용이 비싼 측면이 있어 Holder 클래스를 통한 지연초기화 방법을 사용할 수 있습니다.
```java
    private static class InstanceHolder {
        private static final YourObject instance = new YourObject();
    }

    public static YourObject getInstance() {
        return InstanceHolder.instance;
    }
```
    https://stackoverflow.com/questions/11165852/java-singleton-and-synchronization
    interface 로컬변수는 무조건 public static final 이고, 생략 가능하기 때문에 아래와 같이 활용 가능하다.
```java
public class SampleModule {
    interface Holder {
        SampleModule instance = new SampleModule();
    }
    static public SampleModule getInstance() {
        return Holder.instance;
    }
}
```
    http://gangzzang.tistory.com/entry/Java-%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4interface
-	자신이 UI Driven 인지 Data Driven 인지 어느 쪽에 가깝다고 생각하시나요?
    * UI Driven / 상상하는 것을 현실화 시키는게 좋다.
-	객체지향의 4대 특징이 무엇인가요?
    * 추상화, 캡슐화, 다형성, 상속성
-	각각에 대해서 예를 들어 자세히 설명해주세요
    * 추상화는 복잡한 현실의 문제를 공통적인 특징을 뽑아서 그룹화 하는 것을 의미합니다.(추상클래스, 인터페이스)
    * 캡슐화는 내부구조를 감춘 상태로 외부에 사용방법만을 노출하여 내부 데이터를 보호하는 것을 의미합니다.(private)
    * 다형성은 하나의 메소드나 클래스가 사용하는 주체에 따라서 다양한 방법으로 동작하도록 하는 것을 의미합니다.(Override, Overload)
    * 상속성은 부모의 기능을 자식이 물려받는 것을 의미합니다.
-	인텐트 등의 프로세스 간의 통신이 아닌 앱 내부적으로 이벤트를 받았을때, 업데이트 하는 방법에는 무엇이 있나요?
    * Handler를 이용하여 앱 내부 스레드간의 통신이 가능 합니다.
-	백그라운드 작업을 할 때, 안드로이드에서는 어떤 방법을 이용할 수 있나요?
    * 컴포넌트 관점에서의 백그라운드 개념으로 서비스를 이용할 수 있고, Task관점에서는 Thread나 AsyncTask 등을 이용할 수 있습니다.
-	백그라운드 스레드에서 바로 Activity Class를 이용할 수 있는 방법?
    * runOnUIThread를 이용할 수 있습니다. 
-	다이나믹 프로그래밍이란 무엇인가요?
    * 분할정복방법과 접근법은 같으나 memoization 방법을 이용한 cache를 통해 중복된 연산을 제거한 방법 입니다.
    * ex) 피보나치 수열은 f(x) = f(x-1) + f(x-2) 인데, 각각의 f(x)는 중복된 연산을 반복할 수 있기 때문에 cache를 이용하여 기존 계산된 값을 가져와서 계산한다.
-	오버로딩과 오버라이딩의 차이점은 무엇인가요?
    * 오버로딩은 동일한 메소드를 매개변수에 차이를 두어 여러 함수를 구현하여 매개변수에 따라 다르게 동작시키는 것을 말하며,
    * 오버라이딩은 자식이 메소드를 재정의하여 부모의 메소드 구현을 사용하지 않거나 추가작업을 하는 것을 말합니다.
-	자바와 자바스크립트 외에 어떤 언어를 할 줄 아나요?
    * python, c
-	요즘 관심있는 언어나 분야는 무엇인가요?
    * Rx, 함수형 프로그래밍 등
-	Github 사용하시나요, 사용하시면 어떤 프로젝트를 진행했나요?
    * 개인 프로젝트
-	현재 진행하는 프로젝트 중에 Kotlin 을 이용하거나 진행할 예정이 있나요?
    * 개인적으로 일부분에 사용해보려고 생각 중.

# N Labs
https://opentutorials.org/module/2870/16724
- RecyclerView Holder
    * 기존 ListView에서 View의 재사용을 위해서 ViewHolder 개념을 사용하였으나 RecyclerView는 Holder를 강제화 함으로써 성능의 향상을 꾀했다.
- 안드로이드 성능 개선 툴
    *  안드로이드 앱 성능개선 작업을 해보지 못했습니다.
- onTouchEvent 리턴값의 의미 등을 자세히 설명
    * 가장 상위 레이어부터 dispatchTouchEvent가 호출되며, dispatchTouchEvent는 하위레이어 dispatchTouchEvent를 호출하고 하위레이어의 터치이벤트 처리결과에 따라 true일 경우 결과를 리턴, false일 경우 자기자신의 이벤트 처리 메소드(onTouch / onTouchEvent)로 이벤트를 보내고 결과를 리턴한다.
    * 모든 메서드는 리턴값이 boolean형인데 true일 경우 이벤트를 처리했음을 의미하고, false일 경우 이벤트가 처리되지 않았음을 의미한다.
    http://dktfrmaster.blogspot.kr/2016/09/blog-post_26.html
- onInterceptTouch 리턴값의 의미를 자세히 설명
    * onInterceptTouchEvent는 ViewGroup의 dispatchTouchEvent의 로직을 대신 담당하여, 자신에게 속한 하위뷰의 이벤트를 가로챌지 결정한다.
    * 보통 터치다운의 위치에서 20픽셀 이상 이동되면 이벤트를 가로채서 onIterceptTouchEvent 에 리턴값을 true 로 한다.
    https://moka-a.github.io/android/touch-event-transfer/
- 구조 개선 시에 사용한 디자인 패턴
    * 디자인패턴을 많이 사용해보지 못했습니다.
- DB 접근 시 ANR 발생은 어떤 식으로 개선했는가?
    * 쿼리가 복잡하고 데이터가 많은 경우에는 ANR이 발생한다. ANR 방지를 위해 별도의 Thread로 쿼리를 처리해야한다. 별도의 Thead를 쓰기가 번거로움을 방지하기위해 안드로이드에서는 AsyncQueryHandler를 제공해주고 있다.
    http://www.kmshack.kr/2014/01/db-query%EB%A5%BC-%EB%B3%84%EB%8F%84%EC%9D%98-thread%EB%A1%9C-%EC%B2%98%EB%A6%AC%ED%95%98%EA%B8%B0/ 
- Handler, Looper, HandleMessage 의미
    * 안드로이드에서는 UI 처리의 동기화를 위해서 Main Thread에서만 UI작업이 가능하도록 제한 했습니다. 이 동기화를 위한 개념이 Handler와 Looper, HandleMessage 입니다.
    * Hanlder는 Handler를 생성한 Thread에서 이벤트를 처리하기 위해 대기하며, 이 이벤트를 전달하기 위해 내부 Queue를 가지고 있는 Looper가 존재합니다.
    * Looper는 말그대로 Loop를 돌면서 Queue에 쌓인 이벤트들을 Handler에게 전달 합니다. Handler는 HandleMessage를 통해서 전달받는 이벤트를 처리 합니다.
    * Main Thread로 이벤트를 던지고 싶은 다른 Thread들은 Main Thread의 Handler 객체의 sendMessage나 post를 통해서 Main Thread로 이벤트를 던집니다.
    * Looper.prepare( )를 통해 messageQueue를 준비 한 후, Looper.loop( )를 호출함으로서 Message 전달을 기다리는 작업이 시작되게 됩니다. Main Thread는 Looper를 기본적으로 가지고 있습니다.
    * Main Thread외의 Thread에서 핸들러를 사용할때, HandlerThread 클래스는 기본적으로 Looper를 가지고 있고 해당 Thread를 start 시키면 자동으로 Loop도 도므로 상당히 편리하게 쓸 수 있습니다.
    http://itmining.tistory.com/5
- Android MutiThread 환경 설명
    http://openeg.co.kr/247
- View 에 대한 전반적인 질문
- 성능 개선한 사례에 대한 전반적인 질문
- 인터페이스 활용의 장점
    * 개발시간 단축, 표준화 가능, 클래스들에게 관계제공, 각각의 독립적 프로그래밍 가능.
    http://bywords.tistory.com/entry/Java-%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4%EC%9D%98-%EC%9E%A5%EC%A0%90
- 맵 자료구조 설명
    * Key(키)와 Value(값)으로 나누에 데이터 관리. 순서는 없으며, 키에 대한 중복 없음. 
    * 장점: 빠른 속도, 단점: Key의 검색 속도가 검색 속도를 좌우 
    * 구현 클래스 : HashMap, TreeMap
    자료구조(Java Collections) : http://platonic.tistory.com/entry/Java-Collections-자료구조-List-Set-Map-Tree-Stack-Iterator-Enumeration
- HashMap 과 HashTable 의 차이
    * 1) 동기화 : HashTable 제공, HashMap 비제공. But 신규 버전인 HashMap 사용이 권장되고, 동기화 필요시 ConccurentHashMap 권장. HashTable은 패치가 안되고 동기화 때문에 성능저하.
    * 2) null값 허용 : HashTable X, HashMap O
    * HashMap은 보조해시함수(Additional Hash Function)사용으로 collision 적음.
    * Java 8에서 HashMap Separate Chaining의 성능 개선 : 개수가 8개까지는 리스트를 사용하고 그것을 넘은 경우 트리로 전환. (다시 6개 보다 작아지면 리스트로 전환)
    http://greatzzo.tistory.com/58
    http://d2.naver.com/helloworld/831311
- 안드로이드 맵 자료구조 (ArrayMap 등의 사용법 등)
    * ![Java Collection Framework](./images/JavaCollectionFramework.jpg "Java Collection Framework")
    http://hackersstudy.tistory.com/26
    http://programmingsummaries.tistory.com/57
- 전반적인 View, Thread, 성능 개선에 대해 중점적인 추가 질문
    *
    
# N사 (1)
https://opentutorials.org/module/2870/16875
- Activity lifecycle -> onStart onResume 차이
    * 
- 디자인패턴 아는 것을 말해보세요
    * (위쪽 참조)
- AsyncTask 최근 변화
    * 
- ListView, RecyclerView 차이와 ConstraintLayout behavior 적용이 왜 안되는지?
    * 
- 최근 안드로이드 트렌드
    * 
- Interface 와 Abstract 에 대한 설명
    * 
- Set, Map, List 에 대해 설명
    * 
- 동기화 방법에 대해 설명
    * 
- 해시맵을 사용할 때 주의점은 무엇인가?
    * 
- 프로세스와 스레드에 대해서 설명
    * (위쪽 참조)
- GC 과정에 대해서 설명
    * 
- 접근지정자에 대해서 설명
    * 
- 오버로딩과 오버라이딩에 대해서 설명
    * (위쪽 참조)
- 리플렉션에 대해 설명
    * 
- Parcelable 에 대해서 설명
    * 
- Strict Mode 에 대해서 설명
    * 
- 일반 뷰와 Surface View 의 차이
    * 
- Handler, Looper 에 대해서 설명
    * 
- ANR 에 대해서 설명 피하려면 어떻게?
    * 
- 백키로 앱을 종료했을 때 프로세스는 종료되나요, 되지 않나요?
    * 
- 종료되면 왜 종료되나요? 종료되지 않으면 왜 종료되지 않나요?
    * 
- Zygote 에 대해서

# N사 (2)
https://opentutorials.org/module/2870/16969
- 자신의 장점과 단점
    * 
- 요즘 기술 트렌드 학습하는 법
    * 
- 부서나 업무 롤의 분쟁이 일어났을 때 해결한 경험
    * 
- 이직하려는 이유는? (중복)
- 이전 직장에서 맡았던 개발과 역할?
    * 
- 배우고 싶은 기술은 어떤 것이 있나요?
    * 
- wait / notifyall 관련 손코딩
    * 
- quicksort 손코딩
    * 
- quicksort 알고리즘 과정 그림으로 설명 (화이트보드)
    * 
- Circular List 와 일반 Linked List 구분하는 법은?
     * Floyd's Cycle-Finding Algorithm
     * 러너 기법이라고도하며, 속도가 다른 2개의 임시 Node를 가지고 list traversal하면서 Circular일 경우 빠른 Node가 느린 Node를 따라잡도록 만드는 방법.
     * 속도 O(n) 공간 O(1)
     http://egloos.zum.com/minjang/v/1687021
     http://egloos.zum.com/lefoot/v/5226985
- 즐겨쓰는 디자인패턴과 이유 (중복)
- GC 과정을 설명해주세요
- GC 알고리즘을 설명해주세요
- Dalvik 에서 Art 로 바뀌면서 GC 알고리즘이 변경되었는데 어떻게 변경되었나요?
- HashTable 을 구현한다면 어떻게 구현하실래요?
- Hash 를 쓰는 이유는 무엇인가요?
- 아시는 Sort 알고리즘 모두 설명해주세요
- JDK 의 Sort 는 어떻게 되어있나요?
- HashMap 사용 시 hashCode 및 equals 오버라이딩 시의 주의점 및 규약
- 자신이 생각하는 OOP 란 무엇인가?
- 자바의 메모리 구조에 대해서 설명해주세요
- 프로세스 및 스레드에 대해서 설명해주세요 (중복)
- Singleton 패턴을 멀티스레드 환경에서 적용하는 3가지 방법에 대해서 설명해 주세요
    * synchronized를 이용하면 해결되지만 비용이 비싼 측면이 있어 Double check synchronization을 사용하고, Holder 클래스를 통한 지연초기화 방법을 사용할 수 있습니다.
```java
    private static class InstanceHolder {
        private static final YourObject instance = new YourObject();
    }

    public static YourObject getInstance() {
        return InstanceHolder.instance;
    }
```
    https://stackoverflow.com/questions/11165852/java-singleton-and-synchronization
    interface 로컬변수는 무조건 public static final 이고, 생략 가능하기 때문에 아래와 같이 활용 가능하다.
```java
public class SampleModule {
    interface Holder {
        SampleModule instance = new SampleModule();
    }
    static public SampleModule getInstance() {
        return Holder.instance;
    }
}
```
    http://gangzzang.tistory.com/entry/Java-%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4interface

- Merge Sort 와 Quick Sort 의 장단점 및 시간복잡도, 공간복잡도를 알려주세요
- 데드락 발생 조건에 대해서 설명해주세요
- 데드락 회피 방법 및 대응 방법에 대해서 설명해주세요
- Java 멀티스레드 구현을 위해 고려할 수 있는 것을 모두 알려주세요
- interface 와 abstract 의 차이
- 오버로딩과 오버라이딩의 차이 (중복)
- 오버로딩이 제네릭에서 쓰일 때는 어떻게 사용되나요?
- 컴파일 타임 오버라이딩 및 런타임 오버라이딩에 대해 설명해주세요
- Java ITC?
- Java concurrent package 에 대해서 설명해주세요
- 어노테이션에 대해서 설명해주세요
- Android 시스템 구조
- Android APK 구조
- 액티비티나 커스텀뷰로 할 수 있는데 프래그먼트를 쓰는 이유는?
- Handler / Thread / Looper
- 백그라운드로 UI 를 업데이트하는 방법을 모두 알려주세요
- 인텐트와 인텐트 필터의 개념을 알려주세요
- 이미지 안드로이드 라이브러리를 무엇을 사용해보았나요?
    * Picasso, Glide
- 해당 라이브러리를 사용하는 이유는 무엇인가요?
- RxJava 란 무엇인가요
- 안드로이드에서 멀티스레드 구현을 위해 고려할 수 있는 것을 모두 적어주세요
- 벡터 이미지 장점 및 사용 방법
- onPause / onStop 의 차이점
- 프래그먼트 생명주기를 액티비티와 비교해서 설명
- 서비스에서 startService 와 bindService 를 사용하는데, bindService 를 쓰는 경-  언제인가요?
- Kotlin 의 특징에 대해서 알려주세요
- Dalvik 과 Art 의 차이에 대해서 알려주세요
- NDK 의 개념
- Weak Reference / Soft Reference / Strong Reference 자세히 설명 및 GC 과정
- ListView 와 RecyclerView 차이점 및 ViewHolder 를 ListView 에서 구현할 경- RecyclerView 와 성능차이가 있는지 여부
- HTTP 통신 구현 경험

## 그외
- zip / CountDownLatcher / flatMap
- 레트로핏, 글라이드, 피카소, 슈가레코드, Dagger, RxJava, RxAndroid, Fresco, butterKnife, sqlbrite&delight, greendao
- JUnit, mockito, ATSL, stetho, leakcanary
- Android 아키텍트 패턴 (MVP, MVVM 등)
- Android UnitTest
- TDD
- GCM, FCM, Firebase
- Hot Cold Observable (RxJava)
- mearsure&layout, style&theme, appcompat
- eventbus, volley, realm, sqlite
- bitmap 로딩 및 운용방법
