## 2의 보수를 이용한 양의 정수 최대값

양의 정수 최대값 = -1>>>1 (Java : Integer.MAX_VALUE)

-1은 111111111111111111111111 이고 >>> 하면 011111111111111111111111 이됨.

http://namsieon.com/229


## Other Languages

\>>>는 Zero-fill right shift로 Java에서만 특별히 제공하는 함수임.


다른 언어에서는 (1<<31)-1 하면 됨.
```
>>> bin((1<<31))
'0b10000000000000000000000000000000'
>>> bin((1<<31)-1)
'0b1111111111111111111111111111111'
```

최소값
~((1<<31)-1)
https://stackoverflow.com/questions/9402386/get-int-max-with-bit-operations
