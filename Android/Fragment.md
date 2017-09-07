# Fragment

Fragment는 Activity와 View의 개념을 합쳐놓은 것.

Activity는 일종의 판이나 무대, 기반 같은 것입니다. 뷰들이 놀 수 있는 장소를 제공해줍니다.
기존에는 Activity에 뷰들을 나열하고, 다른 화면이 필요하면 Activity를 전환하여 사용했습니다.

```
ImageView   TextView                        ListView         Button
-           -                               -                - 
----------------------- Acitivity1    <->   ---------------------------Acitivity2 

```

Fragment는 Activity위에 여러화면들을 올려놓고 Activity 전환 없이 화면을 전환하기 위해 사용됩니다.
물론 여러 Fragment를 동시에 보여주는 것도 가능 합니다.

```
ImageView   TextView                        ListView         Button
-           -                               -                - 
------------------------- Fragment1   <->   ------------------------- Fragment2
------------------------------------------------------------------------ Activity1
```

그리고 만들어 놓은 Fragment를 다른 Activity에서 재사용하는 것도 가능합니다.(마치 Module과 같음.)

```
EditText    Button                          ImageView        TextView
-           -                               -                - 
------------------------- Fragment3   <->   ------------------------- Fragment1(아까 그거)
------------------------------------------------------------------------ Activity2
```

구글에서의 Fragment 정의

> 프래그먼트는 자체 수명 주기를 가지고, 자체 입력 이벤트를 받으며, 액티비티 실행 중에 추가 및 제거가 가능한 액티비티의 모듈식 섹션이라고 생각하면 됩니다(다른 액티비티에 재사용할 수 있는 "하위 액티비티"와 같은 개념).

![그림1](http://cfile4.uf.tistory.com/image/26705C4157188D9E0B4C6F)


출처 및 예제 : http://recipes4dev.tistory.com/58