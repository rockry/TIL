
android:enabled="true" 이 부분은 시스템이 알아서 BootReceiver를 실행한다는 뜻입니다.
android:exported="false" 이 부분은 외부 어플리케이션에서는 사용할 수 없으며 같은 앱 또는 같은 UserId를 가진 놈만 호출할 수 있다는 뜻입니다.

출처: http://ccdev.tistory.com/27 [초보코딩왕의 Power Dev.]
http://dwfox.tistory.com/10

---

안드로이드에는 BroadcastReceiver 라는 Callback 이벤트를 처리해주는 컴포넌트가 제공됩니다.


아래와 같은 2가지 방법의 구현이 있습니다.

1. BroadcastReceiver 클래스를 상속

   onReceive() 를 Override해서 기능 정의

   androidManifest.xml에 등록되어 있어야 함.

  > androidManifest 이용해서 등록하면, 명시적으로 해제해줄 수는 없다. (unRegisterReceiver 불가능)

```xml
ex) <receiver android:name=".favorite.MissedCallWidget" >
        <intent-filter>
            <action android:name="android.appwidget.action.APPWIDGET_UPDATE" />
            <action android:name="lge.intent.action.MISSED_CALLS" />
        </intent-filter>

        <meta-data
            android:name="android.appwidget.provider"
            android:resource="@xml/missed_call_widget_info" />
```

2. Actvity, Service, ContentProvider에 registerReceiver() 내에서 등록한다. 

   > onDestory() 에서 this.registerReceiver() 해줬던것을 해제가능 (메모리 누수 방지)

```java
//ex) 이미 있는 action이 아니라, 새로 만든 custom action을 이용한 예시

public static final String ACTION_KEY_CODE = "com.ironmask.home.KEYCODE_ALERT";
private BroadcastReceiver mKeyCodeReceiver = null;

onCreate() 
{ .........
MyregisterReceiver();
  .........
}

onDestory()
{ ...........
    this.unRegisterReceiver(mKeyCodeReceiver);

MyregisterReceiver() {
	if (mKeyCodeReceiver != null)
	    return;

    IntentFilter filter = new IntentFilter();
    filter.addAction(ACTION_KEY_CODE);
    this.mKeyCodeReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent keyintent) {
            String action = keyintent.getAction();
            if (ACTION_KEY_CODE.equals(action)) {
            ...
    };
    this.registerReceiver(this.mKeyCodeReceiver, filter);
}
```

미리 Broadcast를 제공하는 App에서 아래와 같이 수행해 놓으면, 위 Receiver가 동작!! 
```java
	Intent intent = new Intent("com.ironmask.home.KEYCODE_ALERT"); 
	intent.putExtra("key_code", keyCode);
	mContext.sendBroadcast(intent);
```
출처: http://ironmask.net/259 [철가면의 세상사는 법]