package com.example.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.R;
import com.example.recyclerview.adapterclass.AdapterClass;
import com.example.recyclerview.modelclass.ModelClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ModelClass> arrayList = new ArrayList<>();

    ArrayList<Integer> idList=new ArrayList<>();
    ArrayList<String> nameList=new ArrayList<>();
    ArrayList<String> companyNameList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view();
    }

    private void view() {
        recyclerView=findViewById(R.id.recyclerView);

        idList.add(1);
        idList.add(2);
        idList.add(3);
        idList.add(4);
        idList.add(5);

        nameList.add("Sanjay");
        nameList.add("raj");
        nameList.add("vijay");
        nameList.add("jay");
        nameList.add("jiva");

        companyNameList.add("google");
        companyNameList.add("filpkart");
        companyNameList.add("amezon");
        companyNameList.add("hp");
        companyNameList.add("dell");

        for(int i=0;i<4;i++) {
            ModelClass modelClass = new ModelClass();
            modelClass.setId(idList.get(i));
            modelClass.setName(nameList.get(i));
            modelClass.setCompanyName(companyNameList.get(i));

            arrayList.add(modelClass);
        }


        AdapterClass adapterClass =new AdapterClass(arrayList);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterClass);
    }
}