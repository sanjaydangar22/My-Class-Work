package com.example.listviewusearraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    ArrayList<String>  arrayList =new ArrayList<>();
    ArrayList<Integer>  imageList =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view();
    }

    private void view() {
        listView=findViewById(R.id.listView);

        arrayList.add("Matsya Avtar");
        arrayList.add("Kurma Avtar");
        arrayList.add("Varaha Avtar");
        arrayList.add("Nrsimha Avtar");
        arrayList.add("Vamana Avtar");
        arrayList.add("Parasurama Avtar");
        arrayList.add("Rama Avtar");
        arrayList.add("Krishna Avtar");
        arrayList.add("Buddha Avtar");
        arrayList.add("Kalki Avtar");

        imageList.add(R.drawable.matsya);
        imageList.add(R.drawable.kurma);
        imageList.add(R.drawable.varaha);
        imageList.add(R.drawable.narasimha);
        imageList.add(R.drawable.vaman);
        imageList.add(R.drawable.parashurama);
        imageList.add(R.drawable.rama);
        imageList.add(R.drawable.krishna);
        imageList.add(R.drawable.buddha);
        imageList.add(R.drawable.kalki);

        ArrayListAdapter arrayListAdapter =new ArrayListAdapter(arrayList,imageList,this);
        listView.setAdapter(arrayListAdapter);
    }
}