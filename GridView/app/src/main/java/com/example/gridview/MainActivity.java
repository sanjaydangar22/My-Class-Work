package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    ArrayList<Integer> imageArray = new ArrayList<>();
    ArrayList<String> nameArray = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view();
    }

    private void view() {
        gridView = findViewById(R.id.gridView);

        imageArray.add(R.drawable.tiger);
        imageArray.add(R.drawable.lion);
        imageArray.add(R.drawable.leopard);
        imageArray.add(R.drawable.bear);
        imageArray.add(R.drawable.zibra);
        imageArray.add(R.drawable.panda);
        imageArray.add(R.drawable.elephant);
        imageArray.add(R.drawable.crocodile);
        imageArray.add(R.drawable.gorilla);
        imageArray.add(R.drawable.hippopotamus);
        imageArray.add(R.drawable.koala);
        imageArray.add(R.drawable.rhinoceros);
        imageArray.add(R.drawable.wolf);


        nameArray.add("Tiger");
        nameArray.add("Lion");
        nameArray.add("Leopard");
        nameArray.add("Bear");
        nameArray.add("Zibra");
        nameArray.add("Panda");
        nameArray.add("Elephant");
        nameArray.add("Crocodile");
        nameArray.add("Gorilla");
        nameArray.add("Hippopotamus");
        nameArray.add("Koala");
        nameArray.add("Rhinoceros");
        nameArray.add("Wolf");


        AnimalAdapter animalAdapter = new AnimalAdapter(imageArray, nameArray, this);
        gridView.setAdapter(animalAdapter);
    }
}