package com.example.a_wi.uitestdemo;

import android.content.Context;
import android.os.SystemClock;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.example.a_wi.uitestdemo.R.id.editText;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest
{
    private int n = 0;
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void Keyin() {
        while (n<=10) {
            onView(withId(editText)).perform(typeText(String.valueOf(n)),closeSoftKeyboard());
            SystemClock.sleep(1000);
            onView(withText("Enter")).perform(click());
            SystemClock.sleep(1000);
            onView(withId(R.id.textViewResult)).check(matches(withText(String.valueOf(n))));
            SystemClock.sleep(1000);
            n++;
            onView(withId(editText)).perform(clearText());
        }
    }
}
