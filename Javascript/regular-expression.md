# 정규표현식

## javascript - split
" "   splits the array at one single space character.
/\s/ splits the array at every kind of whitespace character
+      Matches between one and unlimitted times

출처: <http://stackoverflow.com/questions/28127794/difference-between-split-s-and-split> 

===

https://developer.mozilla.org/ko/docs/Web/JavaScript/Guide/%EC%A0%95%EA%B7%9C%EC%8B%9D
를 참고해보면 comp.trim().split(/\s+/) 는 
	1. trim => whitespace 제거
	2. split 정규식 => //사이에 정규식을 작성한다. \s는 모든 space, +는 1회이상 반복

http://egloos.zum.com/xxwony/v/74767
