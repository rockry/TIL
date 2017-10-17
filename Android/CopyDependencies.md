gradle에서 dependency를 걸어서 잘 쓰고 있던 library 들을 android system에 넣고 빌드하려고하니, library를 mk파일에 하나하나 추가해줘야 한다.
gradle에서 쓰는 dependencies를 다운로드 받는 방법은 아래와 같다.

app.gradle에 작성
```
task copyDependencies(type: Copy) {
    from configurations.compile
    into "$buildDir/outputs/libs"
}
```

실행
```
.\gradlew copyDependencies
:copyDependencies
```

http://blog.leocat.kr/notes/2017/10/10/gradle-copy-dependencies