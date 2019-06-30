package coffeecode.co.learnespresso

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityEspressoTest{

    @get:Rule
    var mActivityRule = ActivityTestRule(MainActivity::class.java)


    @Test
    fun ensureTextChangeWork(){
        onView(withId(R.id.edtText)).perform(typeText("HELLO"), closeSoftKeyboard())
        onView(withId(R.id.btnChangeText)).perform(click())
        onView(withId(R.id.tvPrinted_text)).check(matches(withText("LaLaLa")))
    }

    @Test
    fun ensureMoveActivityWithData(){
        onView(withId(R.id.edtText)).perform(typeText("DicodingMenjadiAndroidDeveloperExpert"), closeSoftKeyboard())
        onView(withId(R.id.btnSwicthActivity)).perform(click())
        onView(withId(R.id.tvResultView)).check(matches(withText("DicodingMenjadiAndroidDeveloperExpert")))
    }
}