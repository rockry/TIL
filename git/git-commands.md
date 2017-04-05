# 가끔씩 사용하는 유용한 git command 모음

## 수정사항 stack에 넣어놓고 sync 받기
```
git stash // 수정사항을 stack에 저장해 놓고 이전 HEAD로 이동

git pull // 이전 HEAD base로 최신 반영사항을 가져옴

git stash pop // stack에 저장해 놓은 수정사항을 가져옴

git stash list // stash된 list 확인

git stash show stash이름

git stash drop

```

## 반영한 사람(범인) 찾기

```
git blame -L 3080,3090 test.js

*git log -F 파일명

(파일에 대한 git log 보기)+
```

## branch 정보 자세히 보기

```
git branch -alvv
```

##git patch

```
git diff --no-prefix > patchfile # 패치파일 생성

cd path/to/top # 패치하고자 하는 소스 위치

patch -p0 < patchfile # 패치 적용

--no-prefix 옵션 없이 패치파일 생성한 경우 -p1 옵션으로 패치 적용 (패치내용의 a/ b/ path prefix 무시)

git diff > patchfile # 패치파일 생성

cd path/to/top # 패치하고자 하는 소스 위치

patch -p1 < patchfile # 패치 적용
```

## git lg alias

git config --global alias.lg "log --color --graph --pretty=format:'%Cred%h%Creset -%C(yellow)%d%Creset %s %Cgreen(%cr) %C(bold blue)<%an>%Creset' --abbrev-commit"

git config --global --edit으로 들어가서 직접 수정해도 된다.

[https://coderwall.com/p/euwpig/a-better-git-log](https://coderwall.com/p/euwpig/a-better-git-log)
