package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class UseArryListSpinnerActivity extends AppCompatActivity {

    Spinner spinner;
//    String[] list={"Surat","Rajkot","Mumbai","Morbi"};
    ArrayList<String> arrayList=new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_arry_list_spinner);
        view();
    }

    private void view() {
        spinner=findViewById(R.id.spinner);

        arrayList.add("Adhar Card ");
        arrayList.add("Pan Card ");
        arrayList.add("Voter id Card ");
        arrayList.add("Rasan Card ");
        arrayList.add("Drving Licen Card ");

        ArrayAdapter adapter=new ArrayAdapter<>(this, R.layout.spinnerlist,R.id.txtCityList, arrayList);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectName = arrayList.get(position);
                Log.e("TAG", "onItemSelected: "+selectName );
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}