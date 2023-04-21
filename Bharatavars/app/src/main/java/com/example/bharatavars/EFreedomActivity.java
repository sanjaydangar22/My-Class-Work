package com.example.bharatavars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.bharatavars.databinding.ActivityEfreedomBinding;

public class EFreedomActivity extends AppCompatActivity {
    ActivityEfreedomBinding eFreedomBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        eFreedomBinding = ActivityEfreedomBinding.inflate(getLayoutInflater());
        setContentView(eFreedomBinding.getRoot());


        view();
    }

    private void view() {
        eFreedomBinding.lFHome.setOnClickListener(h->{
            Intent home=new Intent(this,EMainActivity.class);
            startActivity(home);
        });
//        eFreedomBinding.lFSave.setOnClickListener(s->{
//            Intent save=new Intent(this,EMainActivity.class);
//            startActivity(save);
//        });
//        eFreedomBinding.lFSearch.setOnClickListener(se->{
//            Intent search=new Intent(this,EMainActivity.class);
//            startActivity(search);
//        });
        eFreedomBinding.lFManu.setOnClickListener(m->{
            Intent manu=new Intent(this,EMainActivity.class);
            startActivity(manu);
        });
    }
}