package com.example.aninterface.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.aninterface.R;
import com.example.aninterface.adapterclass.AdapterClass;
import com.example.aninterface.interfac.ClickListener;
import com.example.aninterface.modelclass.ModelClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ModelClass> foodList = new ArrayList<>();//add model class add in Array List
    ArrayList<Integer> imageList = new ArrayList<>();
    ArrayList<String> itemNameList = new ArrayList<>();
    ArrayList<Integer> quantityList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view();
    }

    private void view() {
        recyclerView = findViewById(R.id.recyclerView);

        itemInfo();
        ClickListener listener=new ClickListener() {
            @Override
            public void onClick(int img,String nameItem,int quantity ) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("image",img);
                intent.putExtra("name",nameItem);
                intent.putExtra("quantity",quantity);
                startActivity(intent);
            }
        };
        for (int i = 0; i < 5; i++) {//model class

            ModelClass model = new ModelClass();
            model.setImgItem(imageList.get(i));
            model.setItemName(itemNameList.get(i));
            model.setQuantity(quantityList.get(i));

            foodList.add(model);//add model class in array list
        }

        AdapterClass adapter=new AdapterClass(foodList,listener);//pass parameter using constructor
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void itemInfo() {

        //image
        imageList.add(R.drawable.pizza);
        imageList.add(R.drawable.salads);
        imageList.add(R.drawable.beverages);
        imageList.add(R.drawable.pasta);
        imageList.add(R.drawable.dessert);
//name
        itemNameList.add("Pizza");
        itemNameList.add("Salads");
        itemNameList.add("Beverages");
        itemNameList.add("Pasta");
        itemNameList.add("Dessert");
//quantity
        quantityList.add(30);
        quantityList.add(25);
        quantityList.add(20);
        quantityList.add(25);
        quantityList.add(15);
    }
}