
3가지 방식이 있는데, toggleSoftInput는 ime를 toggle해주는 방식이라 두번 부를경우 다시 생성될 수 있다.
hideSoftInputFromInputMethod는 전달해줄 View가 명확하지 않으면 없어지지 않는 경우가 있다.
그래서 hideSoftInputFromWindow를 사용했다.

```java
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
        imm.hideSoftInputFromInputMethod(getView().getRootView().getWindowToken(), 0);
        imm.hideSoftInputFromWindow(getView().getWindowToken(), 0);
```

다른 곳을 touch시 ime를 없애는 방법은 아래와 같이 적용했다.

```java
        password.setOnFocusChangeListener(new ReleaseFocus());
    private class ReleaseFocus implements View.OnFocusChangeListener {
        @Override
        public void onFocusChange(View view, boolean focus) {
            if(!focus) {
                releaseImeFocus();
            }
        }
    }
    private void releaseImeFocus() {
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(getView().getWindowToken(), 0);
    }
```
다만 최상위 View(Layout)에 아래와 같이 fucusable을 주어야 한다.
```xml
        android:focusable="true"
        android:focusableInTouchMode="true"
```

https://developer.android.com/reference/android/view/inputmethod/InputMethodManager.html#hideSoftInputFromWindow(android.os.IBinder,%20int)