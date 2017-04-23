# Javascript 소수점 제거

JavaScript에는 Java와 같은 비트연산자 들이 있습니다. 

Java에서 비트 연산자는 정수에 대해서 동작합니다. 

그런데 JavaScript에는 정수형은 없고 단지 부동 소수점 숫자형 만이 존재합니다. 

그래서 JavaScript의 비트 연산자는 대상이 되는 숫자를 일단 정수형으로 변환한 다음 비트 연산을 수행하고 다시 원래의 타입으로 되돌립니다. 

대부분의 언어에서 비트 연산자는 하드웨어에 친근하고 속도도 매우 빠르지만, JavaScript의 비트 연산자는 하드웨어와 전혀 친근하지 않고 속도가 느립니다.

http://www.nextree.co.kr/p6362/

-----

정수 변환에는 value >> 0 나 ~~value 이 제일 빠른 해결책인듯 싶다.

만일 부호없는 정수가 필요하다면 value >>> 0.

단점이 있다면 가독성 문제인 듯 싶다. 코드만 봐서는 뭘 하는지 알아먹기 힘드니…

http://blog.javarouka.me/2013/05/javascript-bitwise-for-cast-integer.html

--------

아래 stackoverflow를 보면 integer check를 하는 현실적인 많은 방법들에 대한 논의가 있다.
http://stackoverflow.com/questions/14636536/how-to-check-if-a-variable-is-an-integer-in-javascript
