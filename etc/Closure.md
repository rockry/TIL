# Closure

Closure의 뜻 : 폐쇄, 종지부
Closure는 내부함수가 외부함수의 변수에 접근하고 있어서, 외부함수 전체의 객체를 들고 있는 내부 함수를 의미 한다.
외부함수가 제거되면 내부함수는 참조할 변수가 없어져 아무 의미가 없게 된다.
내부함수가 사용이 완료되어 제거되면, 그제서야 외부함수까지 모든 내용이 제거 된다.
즉, 해당 객체 Life Cycle의 종지부 역할을 하는 것이다.

```javascript
function outter(){
    var title = 'coding everybody';  
    return function(){        
        alert(title);
    }
}
inner = outter();
inner();
```

inner = 클로저 객체
outter는 inner때문에 살아있는 외부 함수 객체
inner가 제거되지 않는 한 title변수를 유지하기위해 outter는 살아있다.

https://opentutorials.org/course/743/6544