<<<<<<<< HEAD:Interface/app/src/androidTest/java/com/example/aninterface/ExampleInstrumentedTest.java
package com.example.aninterface;
========
package com.example.sdtube;
>>>>>>>> parent of 253a331 (update):SdTube/app/src/androidTest/java/com/example/sdtube/ExampleInstrumentedTest.java

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
<<<<<<<< HEAD:Interface/app/src/androidTest/java/com/example/aninterface/ExampleInstrumentedTest.java
        assertEquals("com.example.aninterface", appContext.getPackageName());
========
        assertEquals("com.example.sdtube", appContext.getPackageName());
>>>>>>>> parent of 253a331 (update):SdTube/app/src/androidTest/java/com/example/sdtube/ExampleInstrumentedTest.java
    }
}