# $scope 이 뭘까?

Angular에서 View와 controller를 연결하여 two-way binding을 해주는 매개체.
View도 $scope을 바라보고, controller도 $scope을 바라보기 때문에 controller에서 $scope.a = 1와 같이 변경하면 View에서도 동일한 $scope.a가 적용된다.

(this하고는 완전히 다른 개념이지만 쉽게 생각하면 Angular에서 사용하는 개념인 MVW(Model View Whatever) 에서 Model의 객체가 사용하는 this라고 생각하면 되겠다.)

DOM(Document Object Model)의 DOM이 scope이라고 할 수 있음.
$rootScope은 global 변수라고 생각하면 됨.
