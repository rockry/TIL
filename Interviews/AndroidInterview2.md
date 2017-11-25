# N Labs
https://opentutorials.org/module/2870/16724
## RecyclerView Holder
* 기존 ListView에서 View의 재사용을 위해서 ViewHolder 개념을 사용하였으나 RecyclerView는 Holder를 강제화 함으로써 성능의 향상을 꾀했다.
## 안드로이드 성능 개선 툴
* Systrace, LeakCanary, stetho 등. 직접 사용해보진 못했다..
> http://programmingfbf7290.tistory.com/entry/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EA%B8%B0%EC%B4%88%EC%A0%81%EC%9D%B8-%EC%84%B1%EB%8A%A5-%EA%B0%9C%EC%84%A0

> https://academy.realm.io/kr/posts/tools-and-libraries-for-common-android-problems/
## onTouchEvent 리턴값의 의미 등을 자세히 설명
* 가장 상위 레이어부터 dispatchTouchEvent가 호출되며, dispatchTouchEvent는 하위레이어 dispatchTouchEvent를 호출하고 하위레이어의 터치이벤트 처리결과에 따라 true일 경우 결과를 리턴 false일 경우 자기자신의 이벤트 처리 메소드(onTouch / onTouchEvent)로 이벤트를 보내고 결과를 리턴한다.
* 모든 메서드는 리턴값이 boolean형인데 true일 경우 이벤트를 처리했음을 의미하고, false일 경우이벤트가 처리되지 않았음을 의미한다.
> http://dktfrmaster.blogspot.kr/2016/09/blog-post_26.html
## onInterceptTouch 리턴값의 의미를 자세히 설명
* onInterceptTouchEvent는 ViewGroup의 dispatchTouchEvent의 로직을 대신 담당하여, 자신에게속한 하위뷰의 이벤트를 가로챌지 결정한다.
* 보통 터치다운의 위치에서 20픽셀 이상 이동되면 이벤트를 가로채서 onIterceptTouchEvent 에 리턴값을 true 로 한다.
> https://moka-a.github.io/android/touch-event-transfer/
## 구조 개선 시에 사용한 디자인 패턴
* 가장 많이 사용하는 Singleton. 불필요하게 객체를 생성 삭제를 반복하는 동작을 줄이기 위해서. 전체 시스템에서 동일한 데이터를 공유하고 싶어서. state 패턴.
## DB 접근 시 ANR 발생은 어떤 식으로 개선했는가?
* 쿼리가 복잡하고 데이터가 많은 경우에는 ANR이 발생한다. ANR 방지를 위해 별도의 Thread로 쿼리를 처리해야한다. 별도의 Thead를 쓰기가 번거로움을 방지하기위해 안드로이드에서는 AsyncQueryHandler를 제공해주고 있다.
> http://www.kmshack.kr/2014/01/db-query%EB%A5%BC-%EB%B3%84%EB%8F%84%EC%9D%98-thread%EB%A1%9C-%EC%B2%98%EB%A6%AC%ED%95%98%EA%B8%B0/ 
## Handler, Looper, HandleMessage 의미
* 안드로이드에서는 UI 처리의 동기화를 위해서 Main Thread에서만 UI작업이 가능하도록 제한했습니다. 이 동기화를 위한 개념이 Handler와 Looper, HandleMessage 입니다.
* Hanlder는 Handler를 생성한 Thread에서 이벤트를 처리하기 위해 대기하며, 이 이벤트를 전달하기위해 내부 Queue를 가지고 있는 Looper가 존재합니다.
* Looper는 말그대로 Loop를 돌면서 Queue에 쌓인 이벤트들을 Handler에게 전달 합니다. Handler는HandleMessage를 통해서 전달받는 이벤트를 처리 합니다.
* Main Thread로 이벤트를 던지고 싶은 다른 Thread들은 Main Thread의 Handler 객체의sendMessage나 post를 통해서 Main Thread로 이벤트를 던집니다.
* Looper.prepare( )를 통해 messageQueue를 준비 한 후, Looper.loop( )를 호출함으로서Message 전달을 기다리는 작업이 시작되게 됩니다. Main Thread는 Looper를 기본적으로 가지고있습니다.
* Main Thread외의 Thread에서 핸들러를 사용할때, HandlerThread 클래스는 기본적으로 Looper를가지고 있고 해당 Thread를 start 시키면 자동으로 Loop도 도므로 상당히 편리하게 쓸 수 있습니다.
> http://itmining.tistory.com/5
## Android MutiThread 환경 설명
> http://openeg.co.kr/247
## View 에 대한 전반적인 질문
## 성능 개선한 사례에 대한 전반적인 질문
## 인터페이스 활용의 장점
* 개발시간 단축, 표준화 가능, 클래스들에게 관계제공, 각각의 독립적 프로그래밍 가능.
> http://bywords.tistory.com/entry/Java-%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4%EC%9D%98-%EC%9E%A5%EC%A0%90
## 맵 자료구조 설명
* Key(키)와 Value(값)으로 나누에 데이터 관리. 순서는 없으며, 키에 대한 중복 없음. 
* 장점: 빠른 속도, 단점: 순서 보장X(LinkedHashMap사용), 리소스 비용 높음.
* 구현 클래스 : HashMap, TreeMap
> 자료구조(Java Collections) : http://platonic.tistory.com/entry/Java-Collections-자료구조-List-Set-Map-Tree-Stack-Itertor-Enumeration
## HashMap 과 HashTable 의 차이
* 1) 동기화 : HashTable 제공, HashMap 비제공. But 신규 버전인 HashMap 사용이 권장되고,동기화 필요시 ConccurentHashMap 권장. HashTable은 패치가 안되고 동기화 때문에 성능저하.
* 2) null값 허용 : HashTable X, HashMap O
* HashMap은 보조해시함수(Additional Hash Function)사용으로 collision 적음.
* Java 8에서 HashMap Separate Chaining의 성능 개선 : 개수가 8개까지는 리스트를 사용하고그것을 넘은 경우 트리로 전환. (다시 6개 보다 작아지면 리스트로 전환)
> http://greatzzo.tistory.com/58

> http://d2.naver.com/helloworld/831311

## 안드로이드 맵 자료구조 (ArrayMap 등의 사용법 등)
* ![Java Collection Framework](./images/JavaCollectionFramework.jpg "Java CollectionFramework")
> http://hackersstudy.tistory.com/26

> http://programmingsummaries.tistory.com/57

## 전반적인 View, Thread, 성능 개선에 대해 중점적인 추가 질문
*
