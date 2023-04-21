package com.example.id_biding;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.example.id_biding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        view();
    }

    private void view() {


       binding.btnSubmit.setOnClickListener(v->{
           String name= binding.edtName.getText().toString();
           binding.txtAns.setText("Name:-  "+name);
       });
       binding.btnClear.setOnClickListener(c->{
           binding.edtName.setText("");
           binding.txtAns.setText("");
       });
    }
}