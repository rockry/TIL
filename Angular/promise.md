# Promise

약속을 표현하는 객체.

## Promise 객체

- $http, $timeout, $resource, $route등이 promise 객체를 반환

- Promise.then( success callback, fail callback, progress callback )
  : 약속을 지키면 success 실행, 약속을 안지키면 fail 실행

- Promise.catch( fail callback )

- Promise.then( null, fail callback )의 단축표현

- Promise.finally( callback )
  : 약속을 지켜지든 지켜지지 않든 호출

## Deferred 객체

<$q 서비스가 제공하는 defer를 이용한 Promise>

```javascript
    var deferred = $q.defer();
```

와 같이 deffered를 선언하고 

```javascript
    deferred.resolve(...);

    deferred.reject(...);

    return deferred.promise;
```

Deffered.promise를 return 함으로써, 해당 함수를 Promise 함수와 같이 사용할 수 있다.

<$q.all을 이용한 여러 Promise 묶어주기>

```javascript
      $q.all(httpPromise1, httpPromise2)
        .then(
          function(results) {
```

(여러 promise가 return하는 값의 형식이 다르면 results가 어떻게 구성될까? 그냥 객체 배열로?)

원래는 httpPromise1의 성공 콜백에서 httpPromise2를 수행하는 방식으로 순차적 동작을 해야되는데, $q.all 을 사용해서 한번더 비동기 처리를 하여 httpPromise1와 httpPromise2가 병렬적으로 수행되도록 한다.


- Promise는 거절 혹은 취소 같은 미래의 일을 정의.
- Deferred는 반드시 약속을 지키거나 거절을 누군가 해야함.
- Deferred.resolve( 값 )
: 만든 약속을 지킨다.
- Deferred.promise에 then 메서드에 주어질 성공 콜백 함수에 주어진 값을 전달
- Deferred.reject( 값 )
: 만든 약속을 거절/취소한다.
- Deferred.notify( 값 )
: 만든 약속에 경과를 알려줌
- Deferred.promise
: 만들어진 약속 객체

출처: <http://blim.co.kr/archives/category/programming/javscript> 
```javascript
remotedb.allDocs({
  include_docs: true,
  attachments: true
}).then(function (result) {
  var docs = result.rows;
  docs.forEach(function(element) {
    localdb.put(element.doc).then(function(response) {
      alert("Pulled doc with id " + element.doc._id + " and added to local db.");
    }).catch(function (err) {
      if (err.status == 409) {
        localdb.get(element.doc._id).then(function (resp) {
          localdb.remove(resp._id, resp._rev).then(function (resp) {
// et cetera...
```

이러한 구조는 promise를 단지 콜백의 수단으로만 사용한 예

아래와 같은 방식이 좀 더 나은 방식

//이거 각각의 fail는 ,로 추가하는 방법밖에 없나? 각각 Catch로 만들 수는 없는 건가? 

-> 그냥 throw로 던지면 될듯..

```javascript

remotedb.allDocs(...).then(function (resultOfAllDocs) {
  return localdb.put(...);
}).then(function (resultOfPut) {
  return localdb.get(...);
}).then(function (resultOfGet) {
  return localdb.put(...);
}).catch(function (err) {
  console.log(err);
});

```

```javascript
somePromise().then(function () {
  // I'm inside a then() function!
});
```

이 Promise 구문에서 우리는 세가지 동작을 할 수 있음.

1. return 다른 promise

2. return 발생한 값 이나 undefined

3, throw 에러

1. Return another promise

이는 위에서 살펴본 composing promise의 일반적인 패턴입니다.
```javascript
getUserByName('nolan').then(function (user) {
  return getUserAccountById(user.id);
}).then(function (userAccount) {
  // I got a user account!
});
```
여기서 return을 하는 것이 매우 중요한데 만약에 return을 하지 않는다면 다음 함수는 아마 undefined를 받게 될 것입니다. 우리는 userAccount가 필요한데 말입니다.(값을 리턴하지 않는 함수의 경우에는 자바스크립트는 undefined로 값을 처리)

2. Return a synchronous value (or undefined)
```javascript
getUserByName('nolan').then(function (user) {
  if (inMemoryCache[user.id]) {
    return inMemoryCache[user.id];    // returning a synchronous value!
  }
  return getUserAccountById(user.id); // returning a promise!
}).then(function (userAccount) {
  // I got a user account!
});
```

3. Throw a synchronous error

throw는 promise를 더욱 굉장하게 만들어 주는 역할을 합니다. 동기적으로 에러가 발생하면 throw를 통해 에러를 전달합니다. 사용자가 로그아웃이 되었다면 에러를 발생시키는 코드입니다. 

```javascript
getUserByName('nolan').then(function (user) {
  if (user.isLoggedOut()) {
    throw new Error('user logged out!'); // throwing a synchronous error!
  }
  if (inMemoryCache[user.id]) {
    return inMemoryCache[user.id];       // returning a synchronous value!
  }
  return getUserAccountById(user.id);    // returning a promise!
}).then(function (userAccount) {
  // I got a user account!
}).catch(function (err) {
  // Boo, I got an error!
});
```

출처: <http://yubylab.tistory.com/entry/%EC%9E%90%EB%B0%94%EC%8A%A4%ED%81%AC%EB%A6%BD%ED%8A%B8-Promise-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0> 


Then은 항상 함수를 인자로 받는다. Promise 객체 등을 인자로 받으면, then(null)로 인식 된다.
