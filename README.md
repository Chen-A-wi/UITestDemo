# UITestDemo

首先要加入Activity活動，目前用MainActivity做測試。

```java
@Rule
public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
```

系統暫停，單位毫秒。

```java
SystemClock.sleep(1000);
```

點擊畫面中Enter按鈕。

```java
onView(withText("Enter")).perform(click());
```

在EditText內輸入數字 "1" 。

```java
onView(withId(R.id.editText)).perform(typeText(String.valueOf(1)),closeSoftKeyboard());
```

清除EditText內文字內容。

```java
onView(withId(editText)).perform(clearText());
```

比對TextView內所產生的結果是否符合 “登入成功”。

```java
onView(withId(R.id.textView)).check(matches(withText("登入成功")));
```
更多內容可以參考我的[GitBook](https://www.gitbook.com/book/taiwan-a-wi/-sofware-engineer-survival-guide/details)
