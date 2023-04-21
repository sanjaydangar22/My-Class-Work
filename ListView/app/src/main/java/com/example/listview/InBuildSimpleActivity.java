package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class InBuildSimpleActivity extends AppCompatActivity {

    ListView listView;

    String name[]={"Raj","Vikrant","Mahendr","Vijay","Rakesh","Ravi","Romit","Virendr","Mahesh","Ram","Krishna","Jay","Radhe","Mohit"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_build_simple);

        view();
    }

    private void view() {
        listView=findViewById(R.id.listView);

        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,name);
        listView.setAdapter(arrayAdapter);
    }
}