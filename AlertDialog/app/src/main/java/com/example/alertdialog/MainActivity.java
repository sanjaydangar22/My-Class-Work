package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    AppCompatButton btnSimple,btnSingle,btnMultiple;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view();

    }

    private void view() {
        btnSimple=findViewById(R.id.btnSimple);
        btnSingle=findViewById(R.id.btnSingle);
        btnMultiple=findViewById(R.id.btnMultiple);

        btnSimple.setOnClickListener(si->{
            Intent simple=new Intent(this,SimpleDialogActivity.class);
            startActivity(simple);
        });
        btnSingle.setOnClickListener(si->{
            Intent single=new Intent(this,SingleChoiceActivity.class);
            startActivity(single);
        });
        btnMultiple.setOnClickListener(si->{
            Intent multiple=new Intent(this,MultipleChoiceActivity.class);
            startActivity(multiple);
        });

    }
}