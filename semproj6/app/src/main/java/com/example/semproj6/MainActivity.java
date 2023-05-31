package com.example.semproj6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent inti = new Intent(MainActivity.this, signUp_Activity.class);
                startActivity(inti);
                finish();
            }
        }, 2000);

getSupportActionBar().hide();
    }
}