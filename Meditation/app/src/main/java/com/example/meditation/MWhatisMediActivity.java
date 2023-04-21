package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.meditation.databinding.ActivityMwhatisMediBinding;

public class MWhatisMediActivity extends AppCompatActivity {

    ActivityMwhatisMediBinding mwhatisMediBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mwhatisMediBinding=ActivityMwhatisMediBinding.inflate(getLayoutInflater());
        setContentView(mwhatisMediBinding.getRoot());

        view();
    }

    private void view() {
        mwhatisMediBinding.imgBack.setOnClickListener(b->{
            Intent i =new Intent(this,MeditationActivity.class);
            startActivity(i);
        });
    }
}