# R사 전화
https://opentutorials.org/module/2870/16572
## 정렬 알고리즘을 알고 있는대로 말해주세요
* Insertion, Selection, Bubble, Merge, Quick, Radix
> https://medium.com/@fiv3star/%EC%A0%95%EB%A0%AC%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-sorting-algorithm-%EC%A0%95%EB%A6%AC-8ca307269dc7

> https://opentutorials.org/course/543/5364
## 퀵소트를 말했는데, 해당 정렬 알고리즘을 상세히 설명해주세요.
* 피벗을 중심으로 피벗보다 작은 수와 큰 수를 양쪽으로 나누는 연산을 반복하는 분할정복을 사용하여 정렬하는 방식입니다.
* 1/2로 나누는 방식을 n번씩 비교를 하기때문에(비교할 대상이 1/2씩 감소) O(nlogn) 시간복잡도(time complexity)를 가집니다.
## 프로세스와 스레드의 차이는 무엇입니까?
* 프로세스는 프로그램의 실행단위이고 스레드는 그 프로그램의 Task당 실행단위 입니다.
* 하나의 프로세스에서 여러개의 스레드가 수행될 수 있습니다.
## 프로세스는 어떠한 영역을 공유하고 스레드는 어떤 영역을 공유하나요.
* 프로세스는 프로세스마다 고유의 코드, 데이터, 스택, 힙 영역을 가지고 있으며, 스레드는 고유의 스택영역을 가지고 있고, 나머지 영역을 공유 합니다.
* 프로세스에서 데이터를 공유하려면 shared memory 등을 씁니다.
## 디자인패턴을 알고 있는대로 알려주세요
> https://www.slideshare.net/jinhwason/ss-60227208

> https://blog.seotory.com/categories/dev/java/
* singleton, factory, adapter, facade, decorator, proxy, strategy, iterator, observer
> http://gyrfalcon.tistory.com/category/Language/Design%20Pattern

> http://hyeonstorage.tistory.com/99

> http://supark7.tistory.com/

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

## 말씀하신 디자인패턴을 각각 예를 들어 설명해주세요.

* singleton : 프로그램 전체에서 하나의 객체를 공유하기를 원할때. 로거, 프로그램 전체 매니저, 뮤직플레이어 등
* factory : 버튼과 스크롤을 가진 객체를 버튼과 스크롤 종류에 따라 객체의 종류를 나눌때. 예) 객체(원형버튼, 원형스크롤), 객체(사각버튼, 사각스크롤)
* facade : 가입 신청 시, 회원가입 + 기관 생성 + 기관 소속 + 승인까지의 API통합
* adapter : 다양한 인터페이스에서 원하는 데이터를 얻을수 있게 해줌. ArrayAdapter CursorAdapter 등 다양한 Dataset에 대해, 모두 getView(), getCount(), getItem()등 통일된 데이터를 얻을 수 있게 함. (http://sunphiz.me/wp/archives/1292)
* decorator : 원래 객체를 포함하고 그 객체를 이용하여 추가적인 동작을 구현. 커피(에스프레소/드립/디카페인) + 데코(우유/두유/휘핑) => 데코 객체는 커피를 포함하고 있음.
* proxy : 캐싱, 방화벽, 동기화 등
* strategy : 동작을 위한 인터페이스를 다양한 동작에 맞게 구현. Shooter interface를 SoccerShooter / BasketballShooter 에서 각각의 동작 구현.
* iterator : 리스트 iterator
* observer : 방송을하는 주체가 있고 각 observer는 방송을 listen한다. A.register, B.register 후 방송국.update 하면 A와 B 각각의 update가 호출되어 방송국의 update를 들을 수 있다.
> https://www.slideshare.net/soomong/pattern-4797069 (이미지로 Pattern 연상법)

> http://huiyu.tistory.com/category/Programming/DesignPatterns

> http://copynull.tistory.com/category/Gof%20%EB%94%94%EC%9E%90%EC%9D%B8%20%ED%8C%A8%ED%84%B4?page=2

> https://gist.github.com/dwpark1112/a164d1cdc4d1c771b0972080f616394c

## 언급하신 Singleton 은 논란이 있는 부분이 있습니다. 어떤 부분인지 아시나요?
* Singleton은 멀티스레드 환경에서 동기화 문제가 있습니다. synchronized를 이용하면 해결되지만 비용이 비싼 측면이 있어 Holder 클래스를 통한 지연초기화 방법을 사용할 수 있습니다.
```java
public class YourObject {
    private static class Holder {
        private static final YourObject instance = new YourObject();
    }

    public static YourObject getInstance() {
        return Holder.instance;
    }
}
```
* enum을 이용한 singleton 구현도 가능 합니다.
```java
public enum Singleton {
    INSTANCE;
    public void myMethod(){  
    }
}

Singleton.INSTANCE.myMethod();
```
> https://stackoverflow.com/questions/11165852/java-singleton-and-synchronization

* interface 로컬변수는 무조건 public static final 이고 생략 가능하기 때문에, interface Holder를 이용해 아래와 같이 활용 가능하다.
```java
public class YourObject {
    interface Holder {
        YourObject instance = new YourObject();
    }
    public static YourObject getInstance() {
        return Holder.instance;
    }
}
```
> http://gangzzang.tistory.com/entry/Java-%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4interface
## 자신이 UI Driven 인지 Data Driven 인지 어느 쪽에 가깝다고 생각하시나요?
* UI Driven / 상상하는 것을 현실화 시키는게 좋고, 시각화된 것이 좋다.
## 객체지향의 4대 특징이 무엇인가요?
* 추상화, 캡슐화, 다형성, 상속성
## 각각에 대해서 예를 들어 자세히 설명해주세요
* 추상화는 복잡한 현실의 문제를 공통적인 특징을 뽑아서 그룹화 하는 것을 의미합니다.(추상클래스,인터페이스)
* 캡슐화는 내부구조를 감춘 상태로 외부에 사용방법만을 노출하여 내부 데이터를 보호하는 것을의미합니다.(private)
* 다형성은 하나의 메소드나 클래스가 사용하는 주체에 따라서 다양한 방법으로 동작하도록 하는 것을의미합니다.(Override, Overload)
* 상속성은 부모의 기능을 자식이 물려받는 것을 의미합니다.
## 인텐트 등의 프로세스 간의 통신이 아닌 앱 내부적으로 이벤트를 받았을때, 업데이트 하는 방법에는 무엇이 있나요?
* Handler를 이용하여 앱 내부 스레드간의 통신이 가능 합니다.
## 백그라운드 작업을 할 때, 안드로이드에서는 어떤 방법을 이용할 수 있나요?
* 컴포넌트 관점에서의 백그라운드 개념으로 서비스를 이용할 수 있고, Task관점에서는 Thread나 AsyncTask 등을 이용할 수 있습니다.
## 백그라운드 스레드에서 바로 Activity Class를 이용할 수 있는 방법?
* Activity의 runOnUIThread, View클래스 post메소드, Handler의 post.
> http://openeg.co.kr/m/247
## 다이나믹 프로그래밍이란 무엇인가요?
* 분할정복방법과 접근법은 같지만 memoization이라고 지칭하는 cache를 통해서 중복된 연산을 제거한 방법 입니다.
* ex) 피보나치 수열은 f(x) = f(x-1) + f(x-2) 인데, 각각의 f(x)는 중복된 연산을 반복할 수 있기 때문에 cache를 이용하여 기존 계산된 값을 가져와서 계산한다.
## 오버로딩(Overloading)과 오버라이딩(Overriding)의 차이점은 무엇인가요?
* 오버로딩은 동일한 이름의 메소드를 매개변수에 차이를 두어서 여러 함수를 구현하고 매개변수에 따라 다르게 동작시키는 방식을 말하고,
* 오버라이딩은 부모를 상속받은 자식이 부모의 메소드를 재정의해서 다른 동작을 하거나 기존동작에 추가작업을 하는 방식을 말합니다.
## 자바와 자바스크립트 외에 어떤 언어를 할 줄 아나요?
* python, c
## 요즘 관심있는 언어나 분야는 무엇인가요?
* Rx, 함수형 프로그래밍, kotlin 등
## Github 사용하시나요, 사용하시면 어떤 프로젝트를 진행했나요?
* 개인 프로젝트나 지식 정리 용도
## 현재 진행하는 프로젝트 중에 Kotlin 을 이용하거나 진행할 예정이 있나요?
* 개인적으로 일부분에 사용해보려고 생각 중.

# 전화2
## RxJava나 EventBus 등에는 능숙한지?
## Activity View Fragment 설명
* Activity는 View를 배치할 수 있는 그릇, View는 실제 화면을 표시하는 Component 단위, Fragment는 Activity와 View의 중간 개념으로 View들의 그룹이라고 볼 수 있으며, Activity안에 여러개 위치할 수 있으며, 여러 Activity에서 사용가능하기 때문에 실제 Component 용도로 사용 가능하다.
## View와 Fragment의 차이점
* 주요 차이점은 Fragment가 Activity처럼 LifeCycle을 가지고 있다는 점이다.
* Fragment는 여러 Activity에서 사용가능하도록 한 View 집합이다.
## apk 구성요소
* res, raw, native lib, AndroidManifest, classes.dex 등
> https://academy.realm.io/kr/posts/jon-reeve-reverse-engineering-is-not-just-for-hackers-android/
