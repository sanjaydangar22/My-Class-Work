package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class CountryListViewActivity extends AppCompatActivity {

    ListView listCountry;

    String countryArray[] = {"India ", "Australia ", "Canada ", "China ", "France", "Indonesia", "Turkey", "Japan", "Vietnam", "United Kingdom"};
    int flagArray[] = {R.drawable.flag_of_india, R.drawable.flag_of_australia, R.drawable.flag_of_canada, R.drawable.flag_of_china, R.drawable.flag_of_france, R.drawable.flag_of_indonesia, R.drawable.flag_of_turkey, R.drawable.flag_of_japan, R.drawable.flag_of_vietnam, R.drawable.flag_of_united_kingdom};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list_view);

        view();
    }

    private void view() {
        listCountry=findViewById(R.id.listCountry);
      CountryAdapter countryAdapter=new CountryAdapter(countryArray,flagArray,this);
      listCountry.setAdapter(countryAdapter);
    }
}