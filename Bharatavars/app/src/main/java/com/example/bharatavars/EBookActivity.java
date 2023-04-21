package com.example.bharatavars;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bharatavars.databinding.ActivityEbookBinding;



public class EBookActivity extends AppCompatActivity {

    ActivityEbookBinding ebookBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ebookBinding=ActivityEbookBinding.inflate(getLayoutInflater());
        setContentView(ebookBinding.getRoot());

        View();
    }

    private void View() {
        ebookBinding.lEHome.setOnClickListener(h->{
            Intent home=new Intent(this,EMainActivity.class);
            startActivity(home);
        });
//        ebookBinding.lESave.setOnClickListener(s->{
//            Intent save=new Intent(this,EMainActivity.class);
//            startActivity(save);
//        });
//        ebookBinding.lESearch.setOnClickListener(se->{
//            Intent search=new Intent(this,EMainActivity.class);
//            startActivity(search);
//        });
        ebookBinding.lEManu.setOnClickListener(m->{
            Intent manu=new Intent(this,EMainActivity.class);
            startActivity(manu);
        });

    }
}