package com.example.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.R;
import com.example.recyclerview.adapterclass.HorizontalAdapter;
import com.example.recyclerview.modelclass.HorizontalModel;

import java.util.ArrayList;

public class Recycleview_HorizontalActivity extends AppCompatActivity {

    RecyclerView recyclerView ;

    ArrayList<HorizontalModel> modelArrayList=new ArrayList<>();//Array list in add Model class
    ArrayList<Integer> imageList=new ArrayList<>();//Array List define
    ArrayList<String> nameList=new ArrayList<>();//Array List define
    ArrayList<String> cityList=new ArrayList<>();//Array List define
    ArrayList<String> stateList=new ArrayList<>();//Array List define
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview_horizontal);

        view();
    }

    private void view() {
        recyclerView=findViewById(R.id.recyclerView);

        Information();//information set in function

        for (int i=0;i<imageList.size();i++){
            HorizontalModel model=new HorizontalModel(); // create model class object
            model.setImage(imageList.get(i));
            model.setName(nameList.get(i));
            model.setCity(cityList.get(i));
            model.setState(stateList.get(i));

            modelArrayList.add(model); //add model in Array list
        }
        HorizontalAdapter adapter=new HorizontalAdapter(modelArrayList); //set Adapter and Parameter
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void Information() { //information set in function

        //image
        imageList.add(R.drawable.somnath);
        imageList.add(R.drawable.malikarjuna);
        imageList.add(R.drawable.mahakal);
        imageList.add(R.drawable.omkareshwa);
        imageList.add(R.drawable.kedarnath);
        imageList.add(R.drawable.bhimashankar);
        imageList.add(R.drawable.vishwanath);
        imageList.add(R.drawable.trimbakeshwar);
        imageList.add(R.drawable.baidyanathe);
        imageList.add(R.drawable.nageshwar);
        imageList.add(R.drawable.ramanathar);
        imageList.add(R.drawable.grishneshwa);

        //name
        nameList.add("Somnath");
        nameList.add("Malika_Arjuna");
        nameList.add("Mahakaleshwar ");
        nameList.add("Omkareshwar");
        nameList.add("Kedarnath");
        nameList.add("Bhimashankar");
        nameList.add("Vishwanath");
        nameList.add("Trimbakeshwar");
        nameList.add("Baidyanath");
        nameList.add("Nageshwar");
        nameList.add("ameshwaram");
        nameList.add("Grishneshwar");

        //city
        cityList.add("Veraval");
        cityList.add("Srisailam");
        cityList.add("Ujjain");
        cityList.add("Khandwa");
        cityList.add("Kedarnath");
        cityList.add("Khed taluka, Pune");
        cityList.add("Varanasi");
        cityList.add("Trimbak");
        cityList.add("Deoghar");
        cityList.add("Dwarka");
        cityList.add("Rameswaram");
        cityList.add("Aurangabad");

        //state
        stateList.add("Gujarat");
        stateList.add("Andhra Pradesh");
        stateList.add("Madhya Pradesh");
        stateList.add("Madhya Pradesh");
        stateList.add("Uttarakhand");
        stateList.add("Maharashtra");
        stateList.add("Uttar Pradesh");
        stateList.add("Maharashtra");
        stateList.add("Jharkhand");
        stateList.add("Gujarat");
        stateList.add("Tamil Nadu");
        stateList.add("Maharashtra");


    }
}