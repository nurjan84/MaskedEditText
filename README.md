# MasketEditText

Simple masked edit text

Add it in your root build.gradle at the end of repositories:

```
allprojects {
  repositories {
      maven { url 'https://jitpack.io' }
   }
}
```

Add the dependency:

```
dependencies {
    compile 'com.github.nurjan84:MasketEditText:1.0.0'
}
```

```
<kz.nurzhan.maskededittext.MaskedEditText
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:hint="@string/add_new_phone_hint"
            android:text=""
            android:inputType="phone"
            app:mask="+7(999)999-99-99"
            app:placeholder="_"
            />
```

![2017-12-01 14 03 10](https://user-images.githubusercontent.com/6967566/33473370-67985248-d6a0-11e7-8451-5435d17582f3.png)

