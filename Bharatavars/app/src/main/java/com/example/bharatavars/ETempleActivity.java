package com.example.bharatavars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.bharatavars.databinding.ActivityEtempleBinding;

public class ETempleActivity extends AppCompatActivity {

    ActivityEtempleBinding eTempleBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        eTempleBinding=ActivityEtempleBinding.inflate(getLayoutInflater());
        setContentView(eTempleBinding.getRoot());
        view();
    }

    private void view() {
        eTempleBinding.lTHome.setOnClickListener(h->{
            Intent home=new Intent(this,EMainActivity.class);
            startActivity(home);
        });
//        eTempleBinding.lTSave.setOnClickListener(s->{
//            Intent save=new Intent(this,EMainActivity.class);
//            startActivity(save);
//        });
//        eTempleBinding.lTSearch.setOnClickListener(se->{
//            Intent search=new Intent(this,EMainActivity.class);
//            startActivity(search);
    //    });
        eTempleBinding.lTManu.setOnClickListener(m->{
            Intent manu=new Intent(this,EMainActivity.class);
            startActivity(manu);
        });
    }
}