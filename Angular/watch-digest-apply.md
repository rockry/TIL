# $watch(), $digest() and $apply()

A watch means that AngularJS watches changes in the variable on the $scope object. The framework is "watching" the variable.
the$digest() function is what triggers the data binding to update.
 This function iterates through all watches and checks if any of the watched variables have changed.
The $scope.$apply() function takes a function as parameter which is executed, and after that$scope.$digest() is called internally. That makes it easier for you to make sure that all watches are checked, and thus all data bindings refreshed. 

=> 그러나 그렇기 때문에 apply는 성능적으로 좋지 않은 선택.

프로젝트가 커지면, 관리하는 모든 watch들을 계속 refresh 해야 함.

$apply는 $rootScope.$digest()를 호출 함.

그러므로 $scope.digest()를 호출해서 해당 scope의 것들만 갱신해주는 것이 효율적임.

출처: <http://tutorials.jenkov.com/angularjs/watch-digest-apply.html> 

$rootScope.$digest를 호출시키는 것들을 알아보면 아래와 같습니다.

- ng-click, ng-keydown 디렉티브에서 해당 이벤트가 트리거될 때
- AJAX통신이 이루어질 때
- $rootScope.$digest, $apply, $applyAsync, $evalAsync 등이 호출될 때

출처: <http://kbs0327.github.io/blog/technology/angularjs-improve-performance3/> 
