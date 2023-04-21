package com.example.bharatavars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.bharatavars.databinding.ActivityEmanuBinding;

public class EManuActivity extends AppCompatActivity {


    ActivityEmanuBinding eManuBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        eManuBinding = ActivityEmanuBinding.inflate(getLayoutInflater());
        setContentView(eManuBinding.getRoot());

        view();
    }

    private void view() {
        eManuBinding.lEMHome.setOnClickListener(h->{
            Intent home=new Intent(this,EMainActivity.class);
            startActivity(home);
        });
//        eManuBinding.lEMSave.setOnClickListener(s->{
//            Intent save=new Intent(this,EMainActivity.class);
//            startActivity(save);
//        });
//        eManuBinding.lEMSearch.setOnClickListener(se->{
//            Intent search=new Intent(this,EMainActivity.class);
//            startActivity(search);
//        });
        eManuBinding.lEMManu.setOnClickListener(m->{
            Intent manu=new Intent(this,EMainActivity.class);
            startActivity(manu);
        });
    }
}