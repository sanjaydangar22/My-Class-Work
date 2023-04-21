package com.example.bharatavars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.bharatavars.databinding.ActivityEcaveBinding;

public class ECaveActivity extends AppCompatActivity {

    ActivityEcaveBinding eCaveBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        eCaveBinding= ActivityEcaveBinding.inflate(getLayoutInflater());
        setContentView(eCaveBinding.getRoot());

        view();
    }

    private void view() {
        eCaveBinding.lCHome.setOnClickListener(h->{
            Intent home=new Intent(this,EMainActivity.class);
            startActivity(home);
        });
//        eCaveBinding.lCSave.setOnClickListener(s->{
//            Intent save=new Intent(this,EMainActivity.class);
//            startActivity(save);
//        });
//        eCaveBinding.lCSearch.setOnClickListener(se->{
//            Intent search=new Intent(this,EMainActivity.class);
//            startActivity(search);
//        });
        eCaveBinding.lCManu.setOnClickListener(m->{
            Intent manu=new Intent(this,EMainActivity.class);
            startActivity(manu);
        });

    }
}