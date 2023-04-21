package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.meditation.databinding.ActivityMwhyLarnMediBinding;

public class MWhyLarnMediActivity extends AppCompatActivity {

 ActivityMwhyLarnMediBinding mwhyLarnMediBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mwhyLarnMediBinding= ActivityMwhyLarnMediBinding.inflate(getLayoutInflater());
        setContentView(mwhyLarnMediBinding.getRoot());

        view();
    }

    private void view() {
        mwhyLarnMediBinding.imgBack.setOnClickListener(b->{
            Intent i =new Intent(this,MeditationActivity.class);
            startActivity(i);
        });
    }
}