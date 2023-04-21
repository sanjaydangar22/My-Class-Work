package com.example.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.recyclerview.R;
import com.example.recyclerview.adapterclass.JyotirAdapter;
import com.example.recyclerview.interfac.JyotirClickListener;
import com.example.recyclerview.modelclass.JyotirModel;

import java.util.ArrayList;

public class JyotirlingaActivity extends AppCompatActivity {


    RecyclerView recyclerView;

    ArrayList<JyotirModel> modelArrayList = new ArrayList<>();

    ArrayList<Integer> imageList = new ArrayList<>();
    ArrayList<String> nameList = new ArrayList<>();
    ArrayList<String> cityList = new ArrayList<>();
    ArrayList<String> stateList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jyotirlinga);

        View();
    }

    private void View() {
        recyclerView = findViewById(R.id.recyclerView);

        Information(); //information function define

        for (int i = 0; i < 12; i++) {
            JyotirModel model = new JyotirModel();
            model.setJyotirImage(imageList.get(i));
            model.setJyotirName(nameList.get(i));
            model.setJyotirCity(cityList.get(i));
            model.setJyotirState(stateList.get(i));

            modelArrayList.add(model);
        }
        JyotirClickListener clickListener = new JyotirClickListener() {
            @Override
            public void onClick(int image, String name, String city, String state) {


                Dialog dialog = new Dialog(JyotirlingaActivity.this);
                dialog.setContentView(R.layout.jyotirlinga_dialoge);

                ImageView imageView = dialog.findViewById(R.id.image);
                imageView.setImageResource(image);

                TextView textView1 = dialog.findViewById(R.id.txtName);
                textView1.setText(name);

                TextView textView2 = dialog.findViewById(R.id.txtCity);
                textView2.setText(city);

                TextView textView3 = dialog.findViewById(R.id.txtState);
                textView3.setText(state);

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                dialog.show();
            }
        };
        JyotirAdapter adapter = new JyotirAdapter(modelArrayList, clickListener);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void Information() {

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