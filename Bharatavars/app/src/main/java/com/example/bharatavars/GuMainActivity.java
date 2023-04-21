package com.example.bharatavars;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.example.bharatavars.databinding.ActivityGuMainBinding;

public class GuMainActivity extends AppCompatActivity {


    ActivityGuMainBinding guMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        guMainBinding = ActivityGuMainBinding.inflate(getLayoutInflater());
        setContentView(guMainBinding.getRoot());

        id();
        OnClick();

    }


    private void id() {


    }

    private void OnClick() {

        guMainBinding.cdGTemple.setOnClickListener(t -> {

            Intent te = new Intent(this, GuTempleActivity.class);
            startActivity(te);
            finish();



        });
        guMainBinding.cdGRiver.setOnClickListener(r -> {
            Intent ri = new Intent(this, GuRiverActivity.class);
            startActivity(ri);

        });
        guMainBinding.cdGCave.setOnClickListener(c -> {
            Intent ca = new Intent(this, GuCaveActivity.class);
            startActivity(ca);

        });
        guMainBinding.cdGStatues.setOnClickListener(s -> {
            Intent se = new Intent(this, GuStatueActivity.class);
            startActivity(se);

        });
        guMainBinding.cdGBooks.setOnClickListener(b -> {
            Intent bo = new Intent(this, GuBookActivity.class);
            startActivity(bo);

        });
        guMainBinding.cdGGod.setOnClickListener(g -> {
            Intent go = new Intent(this, GuGodActivity.class);
            startActivity(go);

        });
        guMainBinding.cdGYogi.setOnClickListener(y -> {
            Intent yo = new Intent(this, GuYogiActivity.class);
            startActivity(yo);

        });
//          guMainBinding.cdGFreedom.setOnClickListener(f->{
//            Intent fr=new Intent(this, GuFreedomActivity.class);
//            startActivity(fr);
        //       finish();
//        });
//
//

//Home
        guMainBinding.layGuHome.setOnClickListener(l -> {
            Intent home = new Intent(this, GuMainActivity.class);
            startActivity(home);
            finish();
        });

        //Manu

        guMainBinding.layGuManu.setOnClickListener(l -> {
            Intent manu = new Intent(this, GUManuActivity.class);
            startActivity(manu);
            finish();
        });

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(" Exit :-")
                .setMessage("શુ તમે બહાર નીકડવા માંગો છો ?")
                .setCancelable(false)
                .setPositiveButton("હા", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("ના", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}