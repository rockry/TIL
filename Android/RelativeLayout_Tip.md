RelativeLayout에서 layout_above를 사용할때, id가 추가되기 전 시점에 id를 호출하면 아래와같이 No resource Error가 발생한다.

> Error:(26, 31) No resource found that matches the given name (at 'layout_above' with value '@id/layout2').


```xml
<RelativeLayout 
    생략 >
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/editText"
        android:layout_above="@id/layout2">
        <ListView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/myListView" />
    </LinearLayout>

    <LinearLayout
        android:id="@+id/layout2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal" >
    </LinearLayout>
    
</RelativeLayout>
```

**id가 선언되기전에 미리 사용할때에는 사용하는 쪽에서도 +를 넣어준다.**
>> *android:layout_above="@+id/layout2">*
