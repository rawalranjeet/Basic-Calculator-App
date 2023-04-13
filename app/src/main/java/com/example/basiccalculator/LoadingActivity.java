package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class LoadingActivity extends AppCompatActivity {
TextView text_big,text_small;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        text_big = findViewById(R.id.text_big);
        text_small = findViewById(R.id.text_small);
        Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);


        text_small.startAnimation(alpha);
        text_big.startAnimation(alpha);
        getSupportActionBar().hide();

        Intent intent = new Intent(LoadingActivity.this,MainActivity.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
            }
        },3000);


    }
}