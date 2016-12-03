package com.a.a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class HelloActivity extends Activity {
    public HelloActivity() {
    }

    /**
     * Called with the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the layout for this activity.  You can find it
        // in res/layout/hello_activity.xml
        setContentView(R.layout.main);
        Intent i=new Intent(this,DbOperation.class);
        startActivity(i);

    }
}
