# Lambda

```Java
return all.filter { it.getCompany() == company }  
    .sortBy { it.getGrade() }
    .map { it.getName() }
```

> Kotlin의 익명 함수는 일부만 익명 클래스로 컴파일된다. 역컴파일해서 소스를 확인하니 필터링과 변환 로직은 같은 for 루프를 추가하는 방식으로 컴파일되고 sort 로직만 Comparator 인터페이스를 구현한 익명 클래스를 생성했다. 컴파일된 디렉터리에는 다음과 같은 파일이 생성돼 있다.

```Java
KotlinResort.class  
KotlinResort$findGuestNamesByCompany$$inlined$sortBy$1.class  
```
Kotlin 람다식을 사용하면 내부적으로 for문으로 치환하거나, 익명클래스를 자동 생성한다.

> 예제 17에서는 java.util.List로 참조한 객체에 바로 filter(), sortBy(), map() 메서드를 이어서 호출하고, Groovy와 동일하게 -> 기호로 익명 함수를 선언했다.
>> 예제 17 Kotlin을 활용한 ResortService 인터페이스의 구현체(KotlinResort.kt)
```Java
override fun findGuestNamesByCompany(company: String): List<String> {  
    val all = repository.findAll()
    return all.filter { g -> g.getCompany() == company }
            .sortBy { g -> g.getGrade() }
            .map { g -> g.getName() }
}
```
> Groovy처럼 it 키워드로 파라미터가 한 개인 익명 함수를 간결하게 표현할 수 있다.
>> 예제 18 Kotlin의 it 키워드 활용(KotlinAdvancedResort.kt)
```Java
return all.filter { it.getCompany() == company }  
    .sortBy { it.getGrade() }
    .map { it.getName() }
```

>> 예제 22 람다를 활용한 ResortService 인터페이스의 구현체(ModernJavaResort.java)
```java
public List<String> findGuestNamesByCompany(String company) {  
    List<Guest> guests = repository.findAll();
    return guests.stream()
        .filter(g -> company.equals(g.getCompany()))
        .sorted(Comparator.comparing(g -> g.getGrade()))
        .map(g -> g.getName())
        .collect(Collectors.toList());
}
```
-> 기호로 함수를 정의한 부분이 Java 8의 람다 표현식이다. Groovy나 Kotlin과 동일하다. 아직은 it 키워드처럼 파라미터가 한 개일 때 참조할 수 있는 예약어는 없다.

변환의 g -> g.getName()처럼 파라미터를 실행할 메서드만 전달하면 되는 경우에는 :: 기호로 메서드 레퍼런스를 직접 전달할 수 있다. 정렬과 변환에 사용한 방법을 :: 기호로 다시 쓰면 다음과 같다.
>> 예제 23 메서드 레퍼런스를 이용한 구현(ModernJavaAdvancedResort.java)
```java
.filter(g -> company.equals(g.getCompany()))
.sorted(Comparator.comparing(Guest::getGrade))
.map(Guest::getName)
```

http://d2.naver.com/helloworld/4911107#fn:3