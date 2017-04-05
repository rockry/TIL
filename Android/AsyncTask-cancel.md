# AsyncTask cancel

AsyncTask를 사용하다가 작업을 취소하고 싶은 경우가 있다.

그런데 AsyncTask.cancel() 메소드를 호출했는데도 작업이 멈추질 않고 끝까지 동작한다...멈춰...제발...

---

AsyncTask 의 경우 doInBackground() 콜백 함수가 Thread에서 동작하는 부분이며, doInBackground() 가 동작 중에 AsyncTask cancel을 하는 경우  doInBackground() 함수 로직이 완료 된 뒤에 onCancelled() 콜백이 호출이 되도록 되어 있다.

AsyncTask cancel 을 호출 하지 않은 경우에는 doInBackground() 함수 로직 완료 후 onPostExecure() 콜백이 호출된다. 

(onPreExecute() 함수는 Thread로 동작하지 않고, Main Thread에서 동작)


```java
@Override
protected Void doInBackground(Void... params) {
    int count = 0;
    while( !isCancelled() && count < 10 ) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ++count; 
    }
    return null;
}
```

위와 같이 doInBackground 에 isCancelled() 함수를 체크하게 해놓으면 수행중이면 background 업무가 중지되고, onCancelled 콜백이 호출될 수 있다.
