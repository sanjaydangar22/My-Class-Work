package com.example.listviewusearraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CityListViewActivity extends AppCompatActivity {

    ListView listCity;

    ArrayList<String>cityArray=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_list_view);

        view();
    }

    private void view() {
        listCity=findViewById(R.id.listCity);

        cityArray.add("Surat");
        cityArray.add("Morbi");
        cityArray.add("Rajkot");
        cityArray.add("Mahesana");
        cityArray.add("Amreli");
        cityArray.add("SurendrNagar");
        cityArray.add("Junagadh");
        cityArray.add("Gir Somnath");
        cityArray.add("Botad");
        cityArray.add("Kheda");
        cityArray.add("Patan");
        cityArray.add("GandhiNagar");
        cityArray.add("Porbadhan");
        cityArray.add("Kach");

        CityAdapter cityAdapter =new CityAdapter(cityArray,this);
        listCity.setAdapter(cityAdapter);
    }
}