# [GitHub Flavored Markdown](https://help.github.com/articles/basic-writing-and-formatting-syntax/)

github에서 사용하기 편하게 변형한 Markdown 문법

Markdown은 Plain text로 작성된 파일을 HTML로 변경해서 보여주기 위한 문법입니다.

### <줄바꿈>

SM이랑 가장 큰 차이점으로 문장의 줄바꿈을 그대로 반영합니다.(즉, “enter”로 줄바꿈 구분함)

### <헤더>

H1 = 또는 #

H2 – 또는 ##

H3 ### , H4 #### , H5 ##### , H6 ######

(=), (-) 은 연속으로 몇개가 오든 상관없이 동작합니다.
#맨뒤에 띄어쓰기를 해야됩니다.

### \<Blockquotes>

 \> , \>> 등

### <리스트>

\+ 가 -> \<li>가\</li>

\* 가 -> \<li>가\</li>

– 가 -> \<li>가\</li>

(+), (*), (-)는 모두 똑같이 동작하며 (기호 + “공백” + 내용) 입니다.

### <숫자 리스트>

1. 가

2. 나

숫자 + “.” + “공백” + 내용 (“.” 뒤에 공백이 와야 리스트 입니다.)

### <코드>

무조건 빈줄을 하나 넣어줘 준 다음 공백 4개(”    “) 로 시작하면 됩니다.

또는 \`\`\` 로 시작해서 \`\`\` 으로 끝내면 됩니다.

코드 안에서는 자동으로 escap 처리를 해줍니다.(<, > 등등)

리스트안에서 코드는 \`\`\` 로 해줘야 합니다.

### \<Link>

\[링크명](url)

### <강조>
```
*single asterisks*
_single underscores_
**double asterisks**
__double underscores__
++underline++
~~cancelline~~
```
*single asterisks*

_single underscores_

**double asterisks**

__double underscores__

++underline++

~~cancelline~~

### <이미지>
```
![Alt text](/path/to/img.jpg)
![Alt text](/path/to/img.jpg "Optional title")
```

#### 참고
https://teragoon.wordpress.com/2012/04/04/

https://help.github.com/articles/basic-writing-and-formatting-syntax/

https://gist.github.com/ihoneymon/652be052a0727ad59601
