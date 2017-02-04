/**
 * Create an app that has three buttons,
 * one for incrementing a counter,
 * one for decrementing the counter,
 * and one for resetting the counter to 0.
 * The counter must be displayed as a TextView
 * and must retain its state when the phone is rotated between portrait and landscape modes.
 * There should be no values, such as strings, dimensions, etc. hardcoded in the .java files.
 * They should be maintained and accessed from the appropriate resource files.
 */

package com.wordpress.myulaflaga.button_counter_martinez;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * This app calculates the value of experience in Android programming on the market
 */
public class MainActivity extends ActionBarActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //increment
    public void increment(View view) {
        quantity = quantity + 1;

    }
   //decrement
    public void decrement(View view) {
        quantity = quantity - 1;
    }


    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putBoolean("My boolean", true);
        savedInstanceState.putDouble("My double", 1.9);
        savedInstanceState.putInt("My integer", 1);
        savedInstanceState.putString("My String", "welcome back to android!");
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        boolean myBoolean = savedInstanceState.getBoolean("My boolean");
        double myDouble = savedInstanceState.getDouble("my double");
        int myInt = savedInstanceState.getInt("my int");
        String myString = savedInstanceState.getString("my string");
    }

}