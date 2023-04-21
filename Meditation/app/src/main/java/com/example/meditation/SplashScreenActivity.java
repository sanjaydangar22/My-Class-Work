package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.meditation.databinding.ActivitySplashScreenBinding;

public class SplashScreenActivity extends AppCompatActivity {

    ActivitySplashScreenBinding SplashScreenBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SplashScreenBinding=ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(SplashScreenBinding.getRoot());

        view();
    }

    private void view() {
        Intent intent=new Intent(this, HomeActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(intent);
                finish();
            }
        },3000);
    }
}