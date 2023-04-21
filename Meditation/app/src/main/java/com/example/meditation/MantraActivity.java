package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.meditation.databinding.ActivityMantraBinding;

public class MantraActivity extends AppCompatActivity {
    ActivityMantraBinding mantraBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mantraBinding=ActivityMantraBinding.inflate(getLayoutInflater());
        setContentView(mantraBinding.getRoot());

        view();
    }

    private void view() {
        mantraBinding.imgBack.setOnClickListener(b->{
            Intent i=new Intent(this,HomeActivity.class);
            startActivity(i);
            finish();
        });
        mantraBinding.txtSiva.setOnClickListener(s->{
            Intent siva=new Intent(this,MantraActivity.class);
            startActivity(siva);
            finish();
        });
        mantraBinding.txtParvati.setOnClickListener(p->{
            Intent parvati=new Intent(this,Mantra2Activity.class);
            startActivity(parvati);
            finish();
        });
        mantraBinding.txtVishnu.setOnClickListener(v->{
            Intent vishnu=new Intent(this,Mantra3Activity.class);
            startActivity(vishnu);
            finish();
        });
//        mantraBinding.txtLaxmi.setOnClickListener(l->{
//            Intent laxmi=new Intent(this,Mantra4Activity.class);
//            startActivity(laxmi);
//        });
//        mantraBinding.txtBrahmdev.setOnClickListener(b->{
//            Intent brahmdev=new Intent(this,Mantra5Activity.class);
//            startActivity(brahmdev);
//        });
//        mantraBinding.txtsaraswati.setOnClickListener(sa->{
//            Intent saraswati=new Intent(this,Mantra6Activity.class);
//            startActivity(saraswati);
//        });
    }
}