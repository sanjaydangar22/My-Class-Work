package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.meditation.databinding.ActivityYogaAgnistmbhasanBinding;
import com.example.meditation.databinding.ActivityYogaArdhPadmasanBinding;

public class YogaAgnistmbhasanActivity extends AppCompatActivity {
    ActivityYogaAgnistmbhasanBinding agnistmbhasanBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        agnistmbhasanBinding=ActivityYogaAgnistmbhasanBinding.inflate(getLayoutInflater());
        setContentView(agnistmbhasanBinding.getRoot());

        agnistmbhasanBinding.imgBack.setOnClickListener(b->{
            Intent i=new Intent(this,YogaActivity.class);
            startActivity(i);
            finish();
        });
    }
}