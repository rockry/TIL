# Zen Coding & Emmet

----
생활코딩님 강의를  듣다가 알게된 툴.

- HTML/CSS의 작업생산성을 높여준다.
- Atom / Eclipse / JSFiddle / CodePen / WebStorm / Notepad++ 등 엄청 많은 툴에서 지원하고 있다. [Download](https://emmet.io/download/)


## 예제

- ID, CLASS 속성

>>div#page.section.main

>><div id="page" class="section main"></div>

- 커스텀 속성

>>a[title="hello world"]

>><a title="hello world"></a>

- 엘리먼트 복제

>> li*3

>> \<li>\</li>\<li>\</li>\<li>\</li>

- 넘버링 - $ 위치에 값이 1부터 1씩 증가 (1,2,3,4...)

>> li.item$*3

>> \<li class="item1"></li>

>> \<li class="item2"></li>

>> \<li class="item3"></li>
 
>> li.item$$$*2

>> \<li class="item001"></li>

>> \<li class="item002"></li>

- 그룹핑

>>div#page>(div#header>ul#nav>li*4>a)+(div#page>(h1>span)+p*2)+div#footer

- ID, CLASS 앞에 태그명을 생략하면 DIV로 간주

>>\#content>.section

>><div id="content"><div class="section"></div></div>

- 텍스트

>>p>{click}

>><p>click</p>

## notepad++ 에서 사용 방법

1. 플러그인 > Plugin Manager > Show Plugin Manager 메뉴

2. "Emmet”플러그인 설치.

3. 설정 > 단축키 설정 > Plugin commands

4. 'Expand Abbreviation' 항목을 'Tab' 으로 변경

5. 겹치는 단축키가 있으면 제거

이제 tab으로 사용하면 된다!


## 참고

* 에밋을 다운 받는 곳 : http://emmet.io/download/
* 에밋에 대한 동영상과 기본 정보들이 있는 곳 : 
http://docs.emmet.io/
https://opentutorials.org/course/128/1395
http://www.smashingmagazine.com/2009/11/21/zen-coding-a-new-way-to-write-html-code/

* 에밋 Cheet Sheet : http://docs.emmet.io/cheat-sheet/
* 에밋 HTML Selectors : https://code.google.com/p/zen-coding/wiki/ZenHTMLSelectorsEn

[출처 - 하얀향기 블로그](http://blog.naver.com/PostView.nhn?blogId=jenycrous&logNo=220379549582&parentCategoryNo=&categoryNo=59&viewDate=&isShowPopularPosts=true&from=search)

[출처 - 오픈튜토리얼](https://opentutorials.org/course/128/1395)

