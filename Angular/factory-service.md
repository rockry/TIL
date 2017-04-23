# Factory와 Service

Factory : 여러 개의 controller에서 사용될 수 있는 기능적인 부분들을 factory로 객체화하여 공통 사용할 수 있다.
Factory는 singleton개념으로 특정 값이나 함수를 return해주므로 controller에서 직접적인 접근은 안되며, 공통된 객체를 공유해서 사용하게 된다.

Service : factory와 다르게 선언한 var들을 return하지 않는다. 대신 사용하고 싶은 var들을 this로 연결시킨다.
이를 봤을때는 factory나 Service 둘 다 선언 밑에 있는 var들은 특정 메모리영역에 계속 상주하고 있는 것이고, Factory는 var들의 주소값을 return해서(객체의 주소를 가지고 있는 factory의 복사본 개념) controller가 사용할 수 있도록 한 것, Service는 this(Service객체)에 연결해서 controller가 Service객체에 직접 접근(Service 객체를 직접 사용)해서 사용할 수 있도록 한 것이다.

http://rockrysh.blogspot.kr/2017/03/angularjs-factory-service.html
