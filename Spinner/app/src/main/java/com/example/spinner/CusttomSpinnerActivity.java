package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class CusttomSpinnerActivity extends AppCompatActivity {
    Spinner spinner;
    String[] list={"Surat","Rajkot","Mumbai","Morbi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custtom_spinner);
        view();
    }

    private void view() {
        spinner=findViewById(R.id.spinner);


        ArrayAdapter adapter=new ArrayAdapter<>(this, R.layout.spinnerlist,R.id.txtCityList, list);
        spinner.setAdapter(adapter);
    }
}