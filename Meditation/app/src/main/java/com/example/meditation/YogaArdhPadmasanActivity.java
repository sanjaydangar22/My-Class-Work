package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.meditation.databinding.ActivityYogaArdhPadmasanBinding;

public class YogaArdhPadmasanActivity extends AppCompatActivity {

    ActivityYogaArdhPadmasanBinding padmasanBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        padmasanBinding=ActivityYogaArdhPadmasanBinding.inflate(getLayoutInflater());
        setContentView(padmasanBinding.getRoot());

        padmasanBinding.imgBack.setOnClickListener(b->{
            Intent i=new Intent(this,YogaActivity.class);
            startActivity(i);
            finish();
        });
    }
}