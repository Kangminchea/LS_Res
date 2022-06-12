package com.Please.test;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Handler timer = new Handler();

        timer.postDelayed(new Runnable(){
            public void run(){
                Intent intent = new Intent(FirstActivity.this, LoginActivity.class);

                startActivity(intent);

                finish();

            }

        }, 2000);

    }
}