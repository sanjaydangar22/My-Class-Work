package com.example.bharatavars;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.example.bharatavars.databinding.ActivityEmainBinding;


public class EMainActivity extends AppCompatActivity {


ActivityEmainBinding eMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        eMainBinding=ActivityEmainBinding.inflate(getLayoutInflater());
        setContentView(eMainBinding.getRoot());

        id();
        OnClick();
    }

    private void id() {
//
//        cdTemple=findViewById(R.id.cdTemple);
//        cdRiver=findViewById(R.id.cdRiver);
//        cdCave=findViewById(R.id.cdCave);
//        cdStatues=findViewById(R.id.cdStatues);
//        cdBooks=findViewById(R.id.cdBooks);
//        cdGod=findViewById(R.id.cdGod);
//        cdYogi=findViewById(R.id.cdYogi);
//        cdFreedom=findViewById(R.id.cdFreedom);
//
//        layHome=findViewById(R.id.layHome);
    }

    private void OnClick() {
        eMainBinding.cdTemple.setOnClickListener(t->{
            Intent te=new Intent(this, ETempleActivity.class);
            startActivity(te);

        });
        eMainBinding. cdRiver.setOnClickListener(r->{
            Intent ri=new Intent(this, ERiverActivity.class);
            startActivity(ri);

        });
        eMainBinding. cdCave.setOnClickListener(c->{
            Intent ca=new Intent(this, ECaveActivity.class);
            startActivity(ca);

        });
        eMainBinding.  cdStatues.setOnClickListener(s->{
            Intent se=new Intent(this, EStatueActivity.class);
            startActivity(se);

        });
        eMainBinding. cdBooks.setOnClickListener(b->{
            Intent bo=new Intent(this, EBookActivity.class);
            startActivity(bo);

        });
        eMainBinding. cdGod.setOnClickListener(g->{
            Intent go=new Intent(this, EGodActivity.class);
            startActivity(go);

        });
        eMainBinding. cdYogi.setOnClickListener(y->{
            Intent yo=new Intent(this, EYogiActivity.class);
            startActivity(yo);

        });
        eMainBinding. cdFreedom.setOnClickListener(f->{
            Intent fr=new Intent(this, EFreedomActivity.class);
            startActivity(fr);

        });




        eMainBinding. layEHome.setOnClickListener(l -> {
            Intent ly = new Intent(this, GuMainActivity.class);
            startActivity(ly);
            finish();
        });


//        view();
//    }
//
//    private void view() {
//        eMainBinding.lGHome.setOnClickListener(h->{
//            Intent home=new Intent(this,EMainActivity.class);
//            startActivity(home);
//        });
////        eGodBinding.lGSave.setOnClickListener(s->{
////            Intent save=new Intent(this,EMainActivity.class);
////            startActivity(save);
////        });
////        eGodBinding.lGSearch.setOnClickListener(se->{
////            Intent search=new Intent(this,EMainActivity.class);
////            startActivity(search);
////        });
//        eMainBinding.lGManu.setOnClickListener(m->{
//            Intent manu=new Intent(this,EMainActivity.class);
//            startActivity(manu);
//        });
    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(" Exit :-")
                .setMessage("Are you sure want to Exit")
                .setCancelable(false)
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


}
