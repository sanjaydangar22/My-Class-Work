package com.example.bharatavars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.bharatavars.databinding.ActivityEstatueBinding;

public class EStatueActivity extends AppCompatActivity {

    ActivityEstatueBinding eStatueBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        eStatueBinding=ActivityEstatueBinding.inflate(getLayoutInflater());
        setContentView(eStatueBinding.getRoot());

        view();
    }

    private void view() {
        eStatueBinding.lSHome.setOnClickListener(h->{
            Intent home=new Intent(this,EMainActivity.class);
            startActivity(home);
        });
//        eStatueBinding.lSSave.setOnClickListener(s->{
//            Intent save=new Intent(this,EMainActivity.class);
//            startActivity(save);
//        });
//        eStatueBinding.lSSearch.setOnClickListener(se->{
//            Intent search=new Intent(this,EMainActivity.class);
//            startActivity(search);
//        });
        eStatueBinding.lSManu.setOnClickListener(m->{
            Intent manu=new Intent(this,EMainActivity.class);
            startActivity(manu);
        });
    }
}