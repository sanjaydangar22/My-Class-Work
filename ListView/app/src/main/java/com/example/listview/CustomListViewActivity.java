package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class CustomListViewActivity extends AppCompatActivity {

    ListView listCity;

    String cityArray[]={"Kach","Banaskath","Patan","Surat","Rajkot","Morbi","SurendNagar","Junagadh","Dwarka","Amroli","Bharuch","Mahesana","GirSomnath","Vadodra","Vlasad","Porbadhan"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        view();
    }

    private void view() {
        listCity=findViewById(R.id.listCity);

        CityAdapter cityAdapter=new CityAdapter(cityArray,this);
        listCity.setAdapter(cityAdapter);

    }
}