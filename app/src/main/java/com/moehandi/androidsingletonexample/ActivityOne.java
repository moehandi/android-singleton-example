package com.moehandi.androidsingletonexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by moehandi on 12/10/15.
 */
public class ActivityOne extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        //show the string value defined by the private contstructor
        Toast.makeText(getApplicationContext(),Singleton.getInstance().getString(), Toast.LENGTH_LONG).show();

        //Change the string value and launch intent to activityTwo
        Singleton.getInstance().setString("New Singleton Value");
        Intent intent = new Intent(getApplicationContext(), ActivityTwo.class);
        this.startActivity(intent);
    }
}
