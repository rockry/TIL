# Javascript Array 응용 방법

## < Stack >

push 메소드를 이용해서 새로운 데이터를 삽입해 array 의 크기값을 반환하고, pop 메소드를 이용해서 가장 최근에 삽입된 데이터를 빼내온다.
```javascript
var arrayStackDemo = new Array();

var size = arrayStackDemo.push("Demo1", "Demo2");

console.log(size);// 2

size = arrayStackDemo.push("Demo3");

console.log(size);// 3

var topStack = arrayStackDemo.pop();

console.log(topStack); // Demo3

console.log(arrayStackDemo.length); // 2
```

## < Queue >

Stack과 같이 push 메소드를 이용해 배열의 끝에 새 데이터를 삽입한다.
원래 Queue의 값을 얻어오는 메소드도 이름이 "pop"이나 이미 Stack을 구현하는데 사용되버렸기 때문에 "shift"메소드를 이용해 배열에 값을 삽입힌다.
또한, "unshift" 메소드를 이용해 배열의 처음에 새 데이터를 삽입할 수도 있다
```javascript
var arrayQueueDemo = new Array("Demo0");

var size = arrayQueueDemo.push("Demo1", "Demo2");

console.log(size);// 3

size = arrayQueueDemo.push("Demo3");

console.log(size);// 4

var firstQueue = arrayQueueDemo.shift();

console.log(firstQueue); // Demo0

console.log(arrayQueueDemo.length); // 3

size = arrayQueueDemo.unshift("newValue");

console.log(size);// 4

firstQueue = arrayQueueDemo.shift();

console.log(firstQueue); // newValue
```

## < Splice >

Array 개체에서 주어진 index의 데이터들을 가져와 새로운 Array를 생성한다. 새로운 Array를 생성하며 추가적으로 원래 Array에 새로운에에 데이터를 삽입할 수도 있다. 즉 원래 Array에서는 데이터를 삭제하며, 새로운 삭제된 데이터들로 새로운 Array를 생성한다.
```JavaScript
/* array.splice(start, deletecount, items)
start에 삭제할 범위의 첫번째 index
deletecount에는 첫번째 index인 start를 포함해 삭제할 엘리맨트의 갯수
items에는 삭제후 삭제된 index에 삽입할 데이터 어레이, 또는 데이터.
*/
var a = [ "a", "b", "c" ];
var b = [ "d", "e", "f" ];

var c = a.splice(0, 2);
b.splice(0, 2)

console.log(a);// [ 'c' ]
console.log(b);// [ 'f' ]
console.log(c);// [ 'a', 'b' ]

c.splice(0, 0, "new VAL");

console.log(c);// [ 'new VAL', 'a', 'b' ]
```

등등

출처 : https://muckycode.blogspot.kr/2015/03/array.html