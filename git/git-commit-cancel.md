# git commit cancel

원리를 모르면, 커밋을 되돌리는 것이 겁날 수 있습니다. 하지만, 원리를 이해하면, 어렵지 않습니다.

다음과 같은 상황에 있다고 해봅시다. C 는HEAD 이고 (F) 는 로컬 파일들의 상태입니다.

```
   (F)
A-B-C
    ↑
  master
```

commit C 를 날려버리고 로컬에 있는 수정 사항도 날려버리고 싶다면 이렇게 합니다:

```
git reset --hard HEAD~1
```

결과는:

```
 (F)
A-B
  ↑
master
```

이제 B 가 HEAD 입니다. --hard를 이용했기 때문에, 로컬 파일들은 commit B 의 상태가 되었습니다

아, 하지만 C 의 커밋 내용을 로컬에는 남겨두고 싶을 수도 있습니다. commit 을 취소하고 싶지만, 수정한 사항들은 간직하고 싶어요.더 작업을 해서 다시 커밋을 할 수도 있으니까요 . 
C 가 HEAD 인 상태에서 어떻게 해야 할지 살펴보죠:

```
   (F)
A-B-C
    ↑
  master
```

--hard 옵션없이 다음과 같이 합니다:

```
git reset HEAD~1
```

결과는:

```
   (F)
A-B-C
  ↑
master
```

HEAD 는 단지 최신 commit 을 가르키는 포인터입니다. git reset HEAD~1 을 하면, Git 에게 HEAD 를 한 커밋 전으로 옮기라고 말하는 것입니다. 하지만(--hard 를 사용하지 않는다면) 파일은 마지막 수정 상태 그대로 있습니다. (역주: git add 와 git commit 을 하기 전 상태로 되돌아감)

더 나아가서, 커밋을 취소하고, 당신의 파일들과 index 영역도 그대로 간직할 수 있습니다.(역주: git add 하였지만, git commit 하기 전으로 되돌아감):

```
git reset --soft HEAD~1
```

git status를 하면, 이전과 같은 파일들이 index 에 있는 것을 볼 겁니다. 이 명령어 뒤에 git commit 을 한다면, 당신은 아까 했던 커밋을 그대로 다시 하게 됩니다.

한가지더: 처음 보기 처럼, --hard 로 커밋을 지웠다고 합시다. 그런데 후에 그 커밋이 필요하다고 해봅시다. 어떻게 할까요? 방법이 있을까요?

여전히 되돌아갈 방법이 있습니다. git reflog 를 입력하면, (부분적인) 커밋의 sha 들을 보게 될 겁니다. 없앤 커밋을 찾아서 이렇게 하세요:

```
git checkout -b someNewBranchName shaYouDestroyed
```

이제 그 커밋이 되살아 났습니다. GIT 은 대략 90일 정도 커밋을 보관합니다. 이 방법을 알고 있으면, 실수로 지운 것들을 어지간하면 되찾을 수 있을 겁니다.



출처: http://jinnydown.tistory.com/entry/git-commit [내 블로그다]
