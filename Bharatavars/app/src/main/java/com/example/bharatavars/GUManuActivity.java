package com.example.bharatavars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import com.example.bharatavars.databinding.ActivityGuManuBinding;


public class GUManuActivity extends AppCompatActivity {

    ActivityGuManuBinding guManuBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        guManuBinding=ActivityGuManuBinding.inflate(getLayoutInflater());
        setContentView(guManuBinding.getRoot());
    }
}