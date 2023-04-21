package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.meditation.databinding.ActivityMantra2Binding;

public class Mantra2Activity extends AppCompatActivity {

    ActivityMantra2Binding mantra2Binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mantra2Binding=ActivityMantra2Binding.inflate(getLayoutInflater());
        setContentView(mantra2Binding.getRoot());

        view();
    }

    private void view() {
        mantra2Binding.imgBack.setOnClickListener(b->{
            Intent i=new Intent(this,HomeActivity.class);
            startActivity(i);
            finish();
        });
        mantra2Binding.txtSiva.setOnClickListener(s->{
            Intent siva=new Intent(this,MantraActivity.class);
            startActivity(siva);
            finish();
        });
        mantra2Binding.txtParvati.setOnClickListener(p->{
            Intent parvati=new Intent(this,Mantra2Activity.class);
            startActivity(parvati);
            finish();
        });
        mantra2Binding.txtVishnu.setOnClickListener(v->{
            Intent vishnu=new Intent(this,Mantra3Activity.class);
            startActivity(vishnu);
            finish();
        });
//        mantra2Binding.txtLaxmi.setOnClickListener(l->{
//            Intent laxmi=new Intent(this,Mantra4Activity.class);
//            startActivity(laxmi);
//        });
//        mantra2Binding.txtBrahmdev.setOnClickListener(b->{
//            Intent brahmdev=new Intent(this,Mantra5Activity.class);
//            startActivity(brahmdev);
//        });
//        mantra2Binding.txtsaraswati.setOnClickListener(sa->{
//            Intent saraswati=new Intent(this,Mantra6Activity.class);
//            startActivity(saraswati);
//        });
    }
}