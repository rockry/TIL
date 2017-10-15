# SK TechX
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

# N사 전화
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
    - https://www.slideshare.net/jinhwason/ss-60227208
    - http://gyrfalcon.tistory.com/entry/%EB%94%94%EC%9E%90%EC%9D%B8%ED%8C%A8%ED%84%B4-%EC%A0%95%EB%A6%AC
    - http://hyeonstorage.tistory.com/99
    - http://supark7.tistory.com/

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
    - https://www.slideshare.net/soomong/pattern-4797069
    - http://huiyu.tistory.com/category/Programming/DesignPatterns
    - http://copynull.tistory.com/category/Gof%20%EB%94%94%EC%9E%90%EC%9D%B8%20%ED%8C%A8%ED%84%B4?page=2
    - https://gist.github.com/dwpark1112/a164d1cdc4d1c771b0972080f616394c
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
    - https://stackoverflow.com/questions/11165852/java-singleton-and-synchronization
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
    - http://gangzzang.tistory.com/entry/Java-%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4interface
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
    - http://dktfrmaster.blogspot.kr/2016/09/blog-post_26.html
- onInterceptTouch 리턴값의 의미를 자세히 설명
    * onInterceptTouchEvent는 ViewGroup의 dispatchTouchEvent의 로직을 대신 담당하여, 자신에게 속한 하위뷰의 이벤트를 가로챌지 결정한다.
    * 보통 터치다운의 위치에서 20픽셀 이상 이동되면 이벤트를 가로채서 onIterceptTouchEvent 에 리턴값을 true 로 한다.
    - https://moka-a.github.io/android/touch-event-transfer/
- 구조 개선 시에 사용한 디자인 패턴
    * 디자인패턴을 많이 사용해보지 못했습니다.
- DB 접근 시 ANR 발생은 어떤 식으로 개선했는가?
    * 쿼리가 복잡하고 데이터가 많은 경우에는 ANR이 발생한다. ANR 방지를 위해 별도의 Thread로 쿼리를 처리해야한다. 별도의 Thead를 쓰기가 번거로움을 방지하기위해 안드로이드에서는 AsyncQueryHandler를 제공해주고 있다.
    - http://www.kmshack.kr/2014/01/db-query%EB%A5%BC-%EB%B3%84%EB%8F%84%EC%9D%98-thread%EB%A1%9C-%EC%B2%98%EB%A6%AC%ED%95%98%EA%B8%B0/ 
- Handler, Looper, HandleMessage 의미
    * 안드로이드에서는 UI 처리의 동기화를 위해서 Main Thread에서만 UI작업이 가능하도록 제한 했습니다. 이 동기화를 위한 개념이 Handler와 Looper, HandleMessage 입니다.
    * Hanlder는 Handler를 생성한 Thread에서 이벤트를 처리하기 위해 대기하며, 이 이벤트를 전달하기 위해 내부 Queue를 가지고 있는 Looper가 존재합니다.
    * Looper는 말그대로 Loop를 돌면서 Queue에 쌓인 이벤트들을 Handler에게 전달 합니다. Handler는 HandleMessage를 통해서 전달받는 이벤트를 처리 합니다.
    * Main Thread로 이벤트를 던지고 싶은 다른 Thread들은 Main Thread의 Handler 객체의 sendMessage나 post를 통해서 Main Thread로 이벤트를 던집니다.
    * Looper.prepare( )를 통해 messageQueue를 준비 한 후, Looper.loop( )를 호출함으로서 Message 전달을 기다리는 작업이 시작되게 됩니다. Main Thread는 Looper를 기본적으로 가지고 있습니다.
    * Main Thread외의 Thread에서 핸들러를 사용할때, HandlerThread 클래스는 기본적으로 Looper를 가지고 있고 해당 Thread를 start 시키면 자동으로 Loop도 도므로 상당히 편리하게 쓸 수 있습니다.
    - http://itmining.tistory.com/5
- Android MutiThread 환경 설명
    - http://openeg.co.kr/247
- View 에 대한 전반적인 질문
- 성능 개선한 사례에 대한 전반적인 질문
- 인터페이스 활용의 장점
    * 개발시간 단축, 표준화 가능, 클래스들에게 관계제공, 각각의 독립적 프로그래밍 가능.
    - http://bywords.tistory.com/entry/Java-%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4%EC%9D%98-%EC%9E%A5%EC%A0%90
- 맵 자료구조 설명
    * Key(키)와 Value(값)으로 나누에 데이터 관리. 순서는 없으며, 키에 대한 중복 없음. 
    * 장점: 빠른 속도, 단점: Key의 검색 속도가 검색 속도를 좌우 
    * 구현 클래스 : HashMap, TreeMap
    - 자료구조(Java Collections) : http://platonic.tistory.com/entry/Java-Collections-자료구조-List-Set-Map-Tree-Stack-Iterator-Enumeration
- HashMap 과 HashTable 의 차이
    * 1) 동기화 : HashTable 제공, HashMap 비제공. But 신규 버전인 HashMap 사용이 권장되고, 동기화 필요시 ConccurentHashMap 권장. HashTable은 패치가 안되고 동기화 때문에 성능저하.
    * 2) null값 허용 : HashTable X, HashMap O
    * HashMap은 보조해시함수(Additional Hash Function)사용으로 collision 적음.
    * Java 8에서 HashMap Separate Chaining의 성능 개선 : 개수가 8개까지는 리스트를 사용하고 그것을 넘은 경우 트리로 전환. (다시 6개 보다 작아지면 리스트로 전환)
    - http://greatzzo.tistory.com/58
    - http://d2.naver.com/helloworld/831311
- 안드로이드 맵 자료구조 (ArrayMap 등의 사용법 등)
    * ![Java Collection Framework](./images/JavaCollectionFramework.jpg "Java Collection Framework")
    - http://hackersstudy.tistory.com/26
    - http://programmingsummaries.tistory.com/57
- 전반적인 View, Thread, 성능 개선에 대해 중점적인 추가 질문
    *
    
# N사 (1)
https://opentutorials.org/module/2870/16875
- Activity lifecycle -> onStart onResume 차이
    * onCreate -> onStart -> onResume -> onPuase -> onStop -> onDestroy
    * onStart는 Activity가 정지된 상태에서 전면으로 돌아올때 혹은 최초 생성 될때 onCreate 이후에 호출(Activity가 비 정상적으로 소멸됬을 경우를 대비해 리소스들을 확인하고 재 할당 등의 작업들을 하는것을 권장, receiver 등록이나 state initial)
    * onResume은 Acitivity가 다른 작업에 의해 잠시 onPuase(focus를 잃음)되었다가 다시 실행될때마다 호출(onResume 이전에 onActivityResult나 onSaveInstanceState가 불리므로 상태값을 가지고 준비과정을 거칠때는 onResume에서 수행이 필요. onStart와는 다르게 focus를 잃은 시점에 동작을 멈추고 다시 실행해야하는 작업들을 수행.)
    - https://stackoverflow.com/questions/9934248/android-when-to-use-onstart-onstop
    - https://stackoverflow.com/questions/21302220/what-does-onstart-really-do-android
- 디자인패턴 아는 것을 말해보세요 (중복)
- AsyncTask 최근 변화
    * 5.1부터 AsyncTask 내부의 Handler가 Singleton으로 변경.
    http://sjava.net/tag/android-asynctask/
    * 3.2부터는 병렬처리를 위해 .executeOnExecutor(AsyncTask .THREAD_POOL_EXECUTOR, ...); 와 같이 사용해야 함.
    https://www.android-tech.io/category/%EA%B0%9C%EB%B0%9C-%EA%B2%BD%ED%97%98%EB%8B%B4/
    * IO 관련 로직을 UI 레이어에서 처리해야 하는 점, 메인 스레드 외에서는 시작을 할 수 없는 것, 메모리 누수가 일어나기 매우 쉬운점 등을 이유로 RxJava를 사용하는 흐름도 보이고 있다.
    - http://kimjihyok.info/2017/06/02/asynctask%EC%99%80-%EB%B9%84%EA%B5%90%ED%95%B4%EC%84%9C-%EB%8B%B9%EC%8B%A0%EC%9D%B4-rxjava%EB%A5%BC-%EB%8B%B9%EC%9E%A5-%EC%8D%A8%EC%95%BC%ED%95%98%EB%8A%94-%EC%9D%B4%EC%9C%A0/
- ListView, RecyclerView 차이와 ConstraintLayout behavior 적용이 왜 안되는지?
    * RecyclerView와 ListView의 가장 큰 차이점은 Layout Manager 추가와, View Holder 패턴의 의무사용, Item에 대한 뷰의 변형이나 애니메이션할 수 있는 개념이 추가된 것 입니다. 
    - http://itmining.tistory.com/12
- 최근 안드로이드 트렌드
    * Kotlin, RxAndroid, Retrofit등의 library, etc??
    - https://medium.com/@joongwon/%EC%89%B4%EC%83%88-%EC%97%86%EC%9D%B4-%EB%B0%94%EB%80%8C%EA%B3%A0-%EC%9E%88%EB%8A%94-%EA%B0%9C%EB%B0%9C-%ED%8A%B8%EB%A0%8C%EB%93%9C-f18ccad7ed69
- Interface 와 Abstract 에 대한 설명
    * Interface는 파생될 클래스들이 구현해야할 공통점들을 모아놓은 객체이고,
    Abstract 클래스는 파생될 클래스들이 variation할 수 있는 abstract method를 가진 클래스

    <공통점>
        
        - 추상클래스와 인터페이스는 선언만 있고 구현 내용이 없다.
        - 그래서 자기 자신이 new를 통해 객체를 생성할 수 없으며, 상속받은 자식만이 객체를 생성할 수 있다.
        - 상속받은 자식이 구현을 반드시 하도록 해야할 때 사용한다.
        - JAVA에서는 type이 지정되있기 때문에 선언된 type과 자식의 type이 같아야만 한다. 

    <차이점>
    | 인터페이스(Interface) | 추상클래스(Abstract Class) |
    | -------------------- | -------------------------
    구현 객체의 같은 동작을 보장하기 위함 | 추상클래스를 상속받아 기능을 이용하고, 확장시키기 위함 
    다중 상속 가능 | 다중 상속 불가능 
    추상메서드만 가능 | 일반메서드+추상메서드 가능
    상수+추상메서드 형태 | 일반변수(가능)+일반메서드(가능)+추상메서드 형태
    생성자와 일반변수를 가질 수 없음 | 생성자와 일반변수 모두 가질 수 있음
    implments | extends
    메서드 선언만 가능 | 메서드의 부분적인 구현이 가능

    - http://private.tistory.com/20
    - http://silentcargo.tistory.com/76
- Set, Map, List 에 대해 설명
    * 
    | 인터페이스 | 구현 클래스 | 특징 | 
    | --------- | ---------- | ---- |
    List | LinkedList / Stack / Vector /ArrayList | 순서가 있는 데이터의 집합, 데이터의 중복을 허용한다.
    Set | HashSet / TreeSet | 순서가 없는 데이터의 집합, 데이터의 중복을 허용하지 않는다. 
    Map | HashMap / TreeMap / HashTable / Properties | 키(key)와 값(value)의 쌍으로 이루어진 데이터의 집합, 순서는 유지되지 않고, 키는 중복을 허용하지 않으며 값의 중복을 허용한다.
http://hackersstudy.tistory.com/26
http://platonic.tistory.com/entry/Java-Collections-%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-List-Set-Map-Tree-Stack-Iterator-Enumeration
- 동기화 방법에 대해 설명
    * 블록 synchronized, 메소드 synchronized, volatile, ConcurrentUtils
    - https://okky.kr/article/279692
    - http://ooz.co.kr/71
- HashMap을 사용할 때 주의점은 무엇인가?
    * 속도를 위해 동기화 지원안함. synchronizedMap 이나 ConcurrentHashMap 사용.
- 프로세스와 스레드에 대해서 설명 (중복)
- GC 과정에 대해서 설명
    * 
- 접근지정자에 대해서 설명
    * 

| 접근 지정자 | 접근 범위 | 동일 클래스 | 동일 패키지 | 다른 패키지의 자식 클래스 | 다른 패키지 |
| -- | -- | -- | -- | -- | -- |
| public | 접근 제한 업음 | O | O | O | O |
| protected | 동일 패키지와 상속 받은 클래스 내부 | O | O | O |  |
| default | 동일 패지키 내에서만 | O | O |  | |
| private | 동일 클래스 내에서만 | O |  |  |  |

- 오버로딩과 오버라이딩에 대해서 설명 (중복)
- 리플렉션에 대해 설명
    * 구체적인 클래스 타입을 알지 못해도, 컴파일된 바이트 코드를 통해 역으로 클래스 정보를 알아내어 클래스를 사용할 수 있는 기법.
    - http://hiddenviewer.tistory.com/114
    - http://hiddenviewer.tistory.com/115
- Parcelable 에 대해서 설명
    * Parcelable이나 Serializable 인터페이스를 구현한 객체는 intent에 putExtra()로 객체를 넘길 수 있다.
    * serialization 은 reflection 방법을 사용하여 serialization 을 하는데, parcelable 은 프로그래머가 직접 바로 setting 을 해주기 때문에 빠르다.
    - http://isntyet.tistory.com/113
    - http://developer88.tistory.com/64
- Strict Mode 에 대해서 설명
    * 메인 스레드에서 디스크 접근, 네트워크 접근등의 비효율적인 작업을 하려는 것을 감지하여 사용자에게 알려줌.
    - http://noota.tistory.com/entry/StrictMode-%EA%B0%84%EB%8B%A8-%EC%A0%95%EB%A6%AC
    - http://www.kmshack.kr/2013/04/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EC%95%B1-%EC%84%B1%EB%8A%A5-%EC%B5%9C%EC%A0%81%ED%99%94-1-%EC%A6%89%EA%B0%81%EC%A0%81%EC%9D%B8-%EB%B0%98%EC%9D%91%EC%9D%84-%EC%9C%84%ED%95%9C-strictmode/
- 일반 뷰와 Surface View 의 차이
    * 
- Handler, Looper 에 대해서 설명(중복)
- ANR 에 대해서 설명 피하려면 어떻게?
    * Main Thread(UI Thread)가 일정 시간 어떤 Task에 잡혀 있어 응답이 없는 상태를 경고.
    * Input 이벤트(키를 누르거나 화면을 터치하는 등)에 5초안에 반응을 하지 않을 때
    * BroadcatReceiver 가 10초내로 실행을 끝내지 않을 때 (UI가 없는 브로드캐스트 리시버, 서비스도 실행 주체가 메인스레드이므로 긴 시간을 소모하는 작업인 경우 ANR을 발생시킨다.)
    * <예방>
        - 시간 소모가 많은 작업은 스레드를 통해 처리하라.
        - onProgressUpdate()를 통해 사용자에게 프로그레스바 등을 이용해 작업의 진행 과정을 안내해 기다리도록 한다.
    - http://itmining.tistory.com/3

- 백키로 앱을 종료했을 때 프로세스는 종료되나요, 되지 않나요?
    * 종료 됨.
- 종료되면 왜 종료되나요? 종료되지 않으면 왜 종료되지 않나요?
    * Back키는 사용자의 종료 의도가 있는 직접적인 행동이므로 Activity가 onPause -> onStop -> onDestroy 과정이 정상적으로 동작된다.
    * 작업을 종료하고 싶지 않다면 Service로 작업을 돌려야한다.
    - https://m.blog.naver.com/PostView.nhn?blogId=highkrs&logNo=220488213481&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F
- Zygote 에 대해서
    * Zygote 프로세스는 애플리케이션이 실행되기 전에 실행된 **가상 머신의 코드 및 메모리 정보를 공유**함으로써 애플리케이션이 실행되는 시간을 단축, 여기에 더해 안드로이드 프레임워크에서 동작하는 **애플리케이션이 사용할 클래스와 자원을 미리 메모리에 로딩**해 두고 이러한 자원에 대한 연결 정보를 구성한다. 새로 실행되는 안드로이드 애플리케이션은 필요한 자원들에 대한 연결정보를 매번 새롭게 구성하지 않고 그대로 사용하기 때문에 빠르게 실행된다.
    - http://dev-ahn.tistory.com/87

# N사 (2)
https://opentutorials.org/module/2870/16969
- 자신의 장점과 단점
    * 
- 요즘 기술 트렌드 학습하는 법
    * 온오프믹스 세미나, 밋업 모임, Facebook/google group, 고수들 블로그나 github
- 부서나 업무 롤의 분쟁이 일어났을 때 해결한 경험
    * 분쟁이 일어났다는 이야기는 R&R이 불분명한 경우가 많다. R&R 관계를 잠시 제쳐두고, 업무자체의 목적과 지금 해결해야되는 사항에 대해서 고민한다. 그리고 서로서로 적절히 업무배분을 한다.
- 이직하려는 이유는? (중복)
- 이전 직장에서 맡았던 개발과 역할?
    * 안드로이드 Wi-Fi Framework/Library 기능을 담당하면서 모델 출시를 위한 탑재 및 최적화, 이슈해결, 사업자 신규기능 구현, 홈로봇 서비스 제공 안드로이드 어플리케이션 개발, Angularjs를 이용한 IoT 제품 연동 관리 하이브리드 앱.
- 배우고 싶은 기술은 어떤 것이 있나요?
    * 서비스 구조 설계(디자인), 어플리케이션 최적화, 대량 Data 처리, RxJava등의 신규 기술 등
- wait / notifyall 관련 손코딩
    * 
    - http://everysw.tistory.com/entry/notifyAll-%EA%B3%BC-wait-%EC%82%AC%EC%9A%A9%EC%8B%9C-%EC%A3%BC%EC%9D%98%EC%A0%90

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
- GC 과정을 설명해주세요 (중복)
- GC 알고리즘을 설명해주세요
    *
- Dalvik 에서 Art 로 바뀌면서 GC 알고리즘이 변경되었는데 어떻게 변경되었나요?
    *
- HashTable 을 구현한다면 어떻게 구현하실래요?
    * key, value, hash function, add, remove, 충돌처리방식, resizing
    - http://bcho.tistory.com/1072
    - http://hyeonstorage.tistory.com/265
- Hash 를 쓰는 이유는 무엇인가요?
    * access time이 상수시간(검색이 빠름), 삽입/삭제 쉬움
- 아시는 Sort 알고리즘 모두 설명해주세요
    * Bubble, Selection, Insertion, Quick, Radix, Merge, Heap
    * Bubble : 0~n까지 두수를 비교하여 위치를 교환하는 방식으로 가장 큰 수를 고른 후, n번 반복하여 정렬하는 방식. O(n2)
    * Selection : 0~n까지 탐색하여 가장 큰 수(또는 작은수)를 n번 선택하는 방식.  O(n2)
    * Insertion : 정렬된 배열을 만들어가며, 원소를 하나씩 추가하여 적절한 위치에 삽입하는 방식. O(n2). 이미 정렬되어있을 경우 최고!
    * Quick : 연속적인 분할에 의한 정렬. pivot을 중심으로 pivot보다 작은수와 큰수를 나누어가며 logn번 반복하는 방식. O(nlogn). 피벗선택을 잘못할 경우 O(n2) 됨.
    * Radix : 정수 자리수의 숫자를 기준으로 큐에 넣어서 순서대로 꺼내는 방식으로 정렬을 기준이 되는 자리수를 바꿔가면서 정렬을 하는 알고리즘. O(kn)
    * Merge : 원소 개수가 1 또는 0이 될 때까지 두 부분으로 자른 뒤 앞의원소부터 크기를 비교해 병합해 나가며 정렬하는 알고리즘. O(nlogn). 일반적으로 퀵정렬보다 느리고 메모리도 필요하지만, stable하다.
    * Heap : 원소들을 전부 Heap(부모의 값이 항상 최소 or 최대 값인 완전 이진 트리)에 삽입 후, 루트를 출력하고 힙에서 제거하는 동작을 반복. 항상 O(nlogn).
    - https://namu.wiki/w/%EC%A0%95%EB%A0%AC%20%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98
- JDK 의 Sort 는 어떻게 되어있나요?
    * JDK 1.8 Arrays.sort() 에서는 내부적으로 Dual-Pivot QuickSort 을 사용
    - http://iloveulhj.github.io/posts/java/java-collection-sort.html
- Merge Sort 와 Quick Sort 의 장단점 및 시간복잡도, 공간복잡도를 알려주세요
    * merge는 stable but 추가 메모리 사용. quick은 pivot을 어떻게 잡느냐에 따라 더 빠를 수 있고, 최악 O(n2). 동일하게 분할정복을 사용하지만 퀵정렬은 분할과 동시에 pivot을 기준으로 정렬하기 때문에 분할이 끝난시점에 정렬이 끝나 있다. 분할한 공간을 참조할 때 cpu 캐시의 히트율이 높아 일반적으로 Merge보다 빠름.
    https://dodo4513.github.io/2017/04/09/sort_2/
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
    - https://stackoverflow.com/questions/11165852/java-singleton-and-synchronization
    * interface 로컬변수는 무조건 public static final 이고, 생략 가능하기 때문에 아래와 같이 활용 가능하다.
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
    - http://gangzzang.tistory.com/entry/Java-%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4interface

- 데드락 발생 조건에 대해서 설명해주세요
- 데드락 회피 방법 및 대응 방법에 대해서 설명해주세요
- Java 멀티스레드 구현을 위해 고려할 수 있는 것을 모두 알려주세요
- interface 와 abstract 의 차이 (중복)
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
- 레트로핏, 글라이드, 피카소, Fresco, Dagger, RxJava, RxAndroid, butterKnife, sqlbrite&delight, greendao, 슈가레코드
- JUnit, mockito, ATSL, stetho, leakcanary
- Android 아키텍트 패턴 (MVP, MVVM 등)
    * https://academy.realm.io/kr/posts/eric-maxwell-mvc-mvp-and-mvvm-on-android/
- Android UnitTest
- TDD
- GCM, FCM, Firebase
- Hot Cold Observable (RxJava)
- mearsure&layout, style&theme, appcompat
- eventbus, volley, realm, sqlite
- bitmap 로딩 및 운용방법

