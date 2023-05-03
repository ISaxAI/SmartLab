package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


        new Handler().postDelayed(() -> {
            Intent i = new Intent(MainActivity.this, Onboard1.class);
            startActivity(i);
            finish();
        }, 3000);
    }


}