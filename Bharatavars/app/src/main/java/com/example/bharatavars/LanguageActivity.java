package com.example.bharatavars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class LanguageActivity extends AppCompatActivity {
    RadioButton rbEnglish, rbGujarati;
    Spinner spiLanguage;
    String language[] = {"English", "Gujarati"};
    AppCompatButton btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        id();

    }

    private void id() {
        rbEnglish = findViewById(R.id.rbEnglish);
        rbGujarati = findViewById(R.id.rbGujarati);

        btnClick = findViewById(R.id.btnClick);


        btnClick.setOnClickListener(b->{
            if (rbEnglish.isChecked()){
                Intent t=new Intent(this,EMainActivity.class);
                startActivity(t);
                finish();
            } else if (rbGujarati.isChecked()) {
                Intent r=new Intent(this, GuMainActivity.class);
                startActivity(r);
                finish();

            }
        });

//        spiLanguage = findViewById(R.id.spiLanguage);
//
//        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, language);
//        spiLanguage.setAdapter(arrayAdapter);
//
//        spiLanguage.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//                btnClick.setOnClickListener(b -> {
//                    if (position == 0) {
//
//                        Intent eng = new Intent(LanguageActivity.this, EMainActivity.class);
//                        startActivity(eng);
//
//                    } else if (position == 1) {
//
//                        Intent guj = new Intent(LanguageActivity.this, GuMainActivity.class);
//                        startActivity(guj);
//
//                    }
//                });
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });

    }
}

