package com.moehandi.androidsingletonexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by moehandi on 12/10/15.
 */
public class ActivityTwo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Show the string value of the singleton
        Toast.makeText(getApplicationContext(),Singleton.getInstance().getString(), Toast.LENGTH_LONG).show();
    }
}
