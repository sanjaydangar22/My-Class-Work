package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.meditation.databinding.ActivityMhowtoMeditateBinding;

public class MHowtoMeditateActivity extends AppCompatActivity {
ActivityMhowtoMeditateBinding mhowtoMeditateBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mhowtoMeditateBinding=ActivityMhowtoMeditateBinding.inflate(getLayoutInflater());
        setContentView(mhowtoMeditateBinding.getRoot());

        view();
    }

    private void view() {
        mhowtoMeditateBinding.imgBack.setOnClickListener(b->{
            Intent i=new Intent(this,MeditationActivity.class);
            startActivity(i);
            finish();
        });
    }
}