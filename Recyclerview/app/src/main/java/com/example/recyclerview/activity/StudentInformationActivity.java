package com.example.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recyclerview.R;
import com.example.recyclerview.adapterclass.StudentAdapter;
import com.example.recyclerview.modelclass.StudentModel;

import java.util.ArrayList;

public class StudentInformationActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    ArrayList<StudentModel>studentList =new ArrayList<>(); //Array list in add Model class
    ArrayList<String> nameList = new ArrayList<>(); //Array List define
    ArrayList<Integer> gridList = new ArrayList<>();//Array List define
    ArrayList<String> courseList = new ArrayList<>();//Array List define
    ArrayList<Integer> durationList = new ArrayList<>();//Array List define

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_information);

        view();
    }

    private void view() {
        recyclerView = findViewById(R.id.recyclerView);

        setInformation(); //information set in function

        for(int i=0;i<nameList.size();i++){
            StudentModel model=new StudentModel(); // create model class object
            model.setName(nameList.get(i));
            model.setGrid(gridList.get(i));
            model.setCourse(courseList.get(i));
            model.setDuration(durationList.get(i));

            studentList.add(model); //add model in Array list

        }

        StudentAdapter adapter=new StudentAdapter(studentList); //set Adapter and Parameter
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void setInformation() { //information set in function
        //name
        nameList.add("Vijay");
        nameList.add("Jay");
        nameList.add("Virat");
        nameList.add("Vinay");
        nameList.add("Rakesh");

        //Grid
        gridList.add(2201);
        gridList.add(2202);
        gridList.add(2203);
        gridList.add(2204);
        gridList.add(2205);

        //Course
        courseList.add("Master in Android");
        courseList.add("Master in Web Development");
        courseList.add("Master in Flutter");
        courseList.add("Figma");
        courseList.add("Cyber Security");

        //Duration
        durationList.add(12);
        durationList.add(24);
        durationList.add(12);
        durationList.add(2);
        durationList.add(36);
    }
}