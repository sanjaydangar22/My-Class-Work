package com.example.bharatavars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.bharatavars.databinding.ActivityEyogiBinding;

public class EYogiActivity extends AppCompatActivity {

    ActivityEyogiBinding eYogiBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        eYogiBinding=ActivityEyogiBinding.inflate(getLayoutInflater());
        setContentView(eYogiBinding.getRoot());

        view();
    }

    private void view() {
        eYogiBinding.lYHome.setOnClickListener(h->{
            Intent home=new Intent(this,EMainActivity.class);
            startActivity(home);
        });
//        eYogiBinding.lYSave.setOnClickListener(s->{
//            Intent save=new Intent(this,EMainActivity.class);
//            startActivity(save);
//        });
//        eYogiBinding.lYSearch.setOnClickListener(se->{
//            Intent search=new Intent(this,EMainActivity.class);
//            startActivity(search);
        //    });
        eYogiBinding.lYManu.setOnClickListener(m->{
            Intent manu=new Intent(this,EMainActivity.class);
            startActivity(manu);
        });
    }
}