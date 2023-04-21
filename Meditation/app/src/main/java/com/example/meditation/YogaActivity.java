package com.example.meditation;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.meditation.databinding.ActivityYogaBinding;

public class YogaActivity extends AppCompatActivity {

    ActivityYogaBinding yogaBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        yogaBinding=ActivityYogaBinding.inflate(getLayoutInflater());
        setContentView(yogaBinding.getRoot());

        view();
    }

    private void view() {

        yogaBinding.imgBack.setOnClickListener(b->{
            Intent i=new Intent(this,HomeActivity.class);
            startActivity(i);
            finish();
        });
        yogaBinding.cdPadmasan.setOnClickListener(p->{
            Intent padmasn=new Intent(this,YogaArdhPadmasanActivity.class);
            startActivity(padmasn);
            finish();
        });

        yogaBinding.cdAgnistmbh.setOnClickListener(p->{
            Intent agnismbh=new Intent(this,YogaAgnistmbhasanActivity.class);
            startActivity(agnismbh);
            finish();
        });

    }
}