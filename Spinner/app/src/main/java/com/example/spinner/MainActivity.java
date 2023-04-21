package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    String[] list={"Surat","Rajkot","Mumbai","Morbi"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view();
    }

    private void view() {
        spinner=findViewById(R.id.spinner);


        ArrayAdapter adapter=new ArrayAdapter<>(this,android. R.layout.simple_list_item_1, list);
        spinner.setAdapter(adapter);

    }
}