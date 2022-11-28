package com.example.lifecycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Static work: creating the views, binding data ...
        Toast.makeText(MainActivity.this, "onCreate() is called", Toast.LENGTH_SHORT).show();
    }

    // Following method after onCreate() method
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "onStart() is called", Toast.LENGTH_SHORT).show();
    }

    // Following method after onStart() method
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "onResume() is called", Toast.LENGTH_SHORT).show();
    }

    // Following method after onResume() method
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this, "onRestart() is called", Toast.LENGTH_SHORT).show();
    }

    // Following method after onResume() method
    // Called when an activity is going into the background but has not yet killed, is the counterpart to onResume
    // Heavy process not here
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "onPause() is called", Toast.LENGTH_SHORT).show();
    }

    // Invoke when the activity is not visible to the user, it's followed by onRestart() when the activity it's revoke from the background otherwise it would be onDestroy() method and then the activity is close or finished
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "onStop() is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "onDestroy() is called", Toast.LENGTH_SHORT).show();
    }







}