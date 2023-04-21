package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.meditation.databinding.ActivityMmeditationMudraBinding;

public class MMeditationMudraActivity extends AppCompatActivity {
    ActivityMmeditationMudraBinding mudraBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mudraBinding=ActivityMmeditationMudraBinding .inflate(getLayoutInflater());
        setContentView(mudraBinding.getRoot());

        view();
    }

    private void view() {
        mudraBinding.imgBack.setOnClickListener(b->{
            Intent i=new Intent(this,MeditationActivity.class);
            startActivity(i);
            finish();
        });
    }
}