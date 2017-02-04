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
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int inc = 0;
    int dec = 0;
    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increase(View view) {

        inc = inc++;
        displayForTeamA(inc);
    }

    public void decrease(View view) {
        dec = dec--;
        displayForTeamA(dec);
    }

    public void resetButton(View view) {
        total = 0;
        displayForTeamA(total);
    }

    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.increase);
        scoreView.setText("" + score);
    }

    public void onSaveInstanceState( Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putBoolean("My boolean", true);
        savedInstanceState.putDouble("My double", 1.9);
        savedInstanceState.putInt("My integer", 1);
        savedInstanceState.putString("My String", "welcome back to android!");
    }

    @Override
    public void onRestoreInstanceState( Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        boolean myBoolean = savedInstanceState.getBoolean("My boolean");
        double myDouble = savedInstanceState.getDouble("my double");
        int myInt = savedInstanceState.getInt("my int");
        String myString = savedInstanceState.getString("my string");
    }

}