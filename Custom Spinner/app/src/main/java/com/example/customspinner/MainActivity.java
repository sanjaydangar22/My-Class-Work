package com.example.customspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    Spinner spinnerCity, spinnerWeek, spinnerColor, spinnerCountry, spinnerLanguage,spinnerId;
    String cityArray[] = {"Surat", "Rajkot", "Amroli", "Morbi"};
    String weekArray[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    String colorArray[] = {"Blue", "Green", "Orange", "Yellow", "Purple", "Brown", "Red"};
    String documentArray[]={"Aaddhar Card","Pan Card","Voter ID"};
    String languageArray[] = {"English", "Gujarati", "Hindi", "Kashmir", "Malayalam", "Manipuri", "Bengali"};

    String countryArray[] = {"India ", "Australia ", "Canada ", "China ", "France", "Indonesia", "Turkey", "Japan", "Vietnam", "United Kingdom"};
    int flagArray[] = {R.drawable.flag_of_india, R.drawable.flag_of_australia, R.drawable.flag_of_canada, R.drawable.flag_of_china, R.drawable.flag_of_france, R.drawable.flag_of_indonesia, R.drawable.flag_of_turkey,R.drawable.flag_of_japan, R.drawable.flag_of_vietnam, R.drawable.flag_of_united_kingdom};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        city();
        week();
        color();
        id();
        language();
        country();

    }




    private void city() {
        spinnerCity = findViewById(R.id.spinnerCity);

        CityAdaptar cityAdaptar = new CityAdaptar(cityArray, this);
        spinnerCity.setAdapter(cityAdaptar);

        spinnerCity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void week() {
        spinnerWeek = findViewById(R.id.spinnerWeek);

        WeekAdaptar weekAdaptar = new WeekAdaptar(weekArray, this);
        spinnerWeek.setAdapter(weekAdaptar);

        spinnerWeek.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void color() {
        spinnerColor = findViewById(R.id.spinnerColor);

        ColorAdapter colorAdapter = new ColorAdapter(colorArray, this);
        spinnerColor.setAdapter(colorAdapter);

        spinnerColor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
    private void id() {
        spinnerId=findViewById(R.id.spinnerId);
        IdAdaptar imageAdaptar=new IdAdaptar(documentArray, this);
        spinnerId.setAdapter(imageAdaptar);

        spinnerId.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void language() {
        spinnerLanguage=findViewById(R.id.spinnerLanguage);
        LanguageAdapter languageAdapter=new LanguageAdapter(languageArray,this);
        spinnerLanguage.setAdapter(languageAdapter);

        spinnerLanguage.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    private void country() {
        spinnerCountry = findViewById(R.id.spinnerCountry);
        CountryAdapter countryAdapter = new CountryAdapter(countryArray, flagArray, this);
        spinnerCountry.setAdapter(countryAdapter);
        spinnerCountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


}