package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.meditation.databinding.ActivityMmantraMusicBinding;


public class MMantraMusicActivity extends AppCompatActivity {
ActivityMmantraMusicBinding mmantraMusicBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mmantraMusicBinding=ActivityMmantraMusicBinding .inflate(getLayoutInflater());
        setContentView(mmantraMusicBinding.getRoot());

        view();
    }

    private void view() {
        mmantraMusicBinding.imgBack.setOnClickListener(b->{
            Intent i=new Intent(this,MeditationActivity.class);
            startActivity(i);
            finish();
        });
    }

}