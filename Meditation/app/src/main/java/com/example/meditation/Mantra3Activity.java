package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.meditation.databinding.ActivityMantra3Binding;

public class Mantra3Activity extends AppCompatActivity {

    ActivityMantra3Binding mantra3Binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mantra3Binding=ActivityMantra3Binding.inflate(getLayoutInflater());
        setContentView(mantra3Binding.getRoot());

        view();
    }

    private void view() {
        mantra3Binding.imgBack.setOnClickListener(b->{
            Intent i=new Intent(this,HomeActivity.class);
            startActivity(i);
            finish();
        });
        mantra3Binding.txtSiva.setOnClickListener(s->{
            Intent siva=new Intent(this,MantraActivity.class);
            startActivity(siva);
            finish();
        });
        mantra3Binding.txtParvati.setOnClickListener(p->{
            Intent parvati=new Intent(this,Mantra2Activity.class);
            startActivity(parvati);
            finish();
        });
        mantra3Binding.txtVishnu.setOnClickListener(v->{
            Intent vishnu=new Intent(this,Mantra3Activity.class);
            startActivity(vishnu);
            finish();
        });
//        mantra3Binding.txtLaxmi.setOnClickListener(l->{
//            Intent laxmi=new Intent(this,Mantra4Activity.class);
//            startActivity(laxmi);
//        });
//        mantra3Binding.txtBrahmdev.setOnClickListener(b->{
//            Intent brahmdev=new Intent(this,Mantra5Activity.class);
//            startActivity(brahmdev);
//        });
//        mantra3Binding.txtsaraswati.setOnClickListener(sa->{
//            Intent saraswati=new Intent(this,Mantra6Activity.class);
//            startActivity(saraswati);
//        });
    }
}