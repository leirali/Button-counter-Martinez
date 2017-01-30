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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
