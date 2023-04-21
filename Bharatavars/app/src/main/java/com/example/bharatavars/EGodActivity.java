package com.example.bharatavars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.bharatavars.databinding.ActivityEgodBinding;

public class EGodActivity extends AppCompatActivity {


    ActivityEgodBinding eGodBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        eGodBinding = ActivityEgodBinding.inflate(getLayoutInflater());
        setContentView(eGodBinding.getRoot());

        view();
    }

    private void view() {
        eGodBinding.lGHome.setOnClickListener(h->{
            Intent home=new Intent(this,EMainActivity.class);
            startActivity(home);
        });
//        eGodBinding.lGSave.setOnClickListener(s->{
//            Intent save=new Intent(this,EMainActivity.class);
//            startActivity(save);
//        });
//        eGodBinding.lGSearch.setOnClickListener(se->{
//            Intent search=new Intent(this,EMainActivity.class);
//            startActivity(search);
//        });
        eGodBinding.lGManu.setOnClickListener(m->{
            Intent manu=new Intent(this,EMainActivity.class);
            startActivity(manu);
        });
    }
}