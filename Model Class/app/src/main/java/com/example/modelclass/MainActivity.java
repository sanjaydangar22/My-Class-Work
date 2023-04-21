package com.example.modelclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.modelclass.StudentsModelClass;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Student Modular
        //Student data1
        StudentsModelClass data1 = new StudentsModelClass();

        data1.setName("Rakesh");
        data1.setId(1);
        data1.setMaths(75.88);
        data1.setEnglish(75.88);
        data1.setScience(75.88);
        data1.setSchool("l.p,savani");

        String name = data1.getName();
        Log.e("TAG", "Name: " + name);
        int id = data1.getId();
        Log.e("TAG", "Id: " + id);

        Double maths = data1.getMaths();
        Log.e("TAG", "Maths: " + maths);
        Double english = data1.getEnglish();
        Log.e("TAG", "English: " + english);
        Double science = data1.getScience();
        Log.e("TAG", "Science: " + science);
        String school = data1.getSchool();
        Log.e("TAG", "School: " + school);


        //Student data2
        StudentsModelClass data2 = new StudentsModelClass();

        data2.setName("Raj");
        data2.setId(2);
        data2.setMaths(65.65);
        data2.setEnglish(78.65);
        data2.setScience(88.32);
        data2.setSchool("L.p.Savani");

        String name2 = data2.getName();
        Log.e("TAG", "Name: " + name2);
        int id2 = data2.getId();
        Log.e("TAG", "Id: " + id2);
        Double maths2 = data2.getMaths();
        Log.e("TAG", "Maths: " + maths2);
        Double english2 = data2.getEnglish();
        Log.e("TAG", "English: " + english2);
        Double science2 = data2.getScience();
        Log.e("TAG", "Science: " + science2);
        String school2 = data2.getSchool();
        Log.e("TAG", "School: " + school2);


        //Student data3
        StudentsModelClass data3 = new StudentsModelClass();

        data3.setName("Vikrant");
        data3.setId(3);
        data3.setMaths(95.65);
        data3.setEnglish(68.65);
        data3.setScience(58.32);
        data3.setSchool("L.p.Savani");

        String name3 = data3.getName();
        Log.e("TAG", "Name: " + name3);
        int id3 = data3.getId();
        Log.e("TAG", "Id: " + id3);
        Double maths3 = data3.getMaths();
        Log.e("TAG", "Maths: " + maths3);
        Double english3 = data3.getEnglish();
        Log.e("TAG", "English: " + english3);
        Double science3 = data3.getScience();
        Log.e("TAG", "Science: " + science3);
        String school3 = data3.getSchool();
        Log.e("TAG", "School: " + school3);


        //Student data4
        StudentsModelClass data4 = new StudentsModelClass();

        data4.setName("Mahesh");
        data4.setId(4);
        data4.setMaths(55.65);
        data4.setEnglish(48.65);
        data4.setScience(68.32);
        data4.setSchool("L.p.Savani");

        String name4 = data4.getName();
        Log.e("TAG", "Name: " + name4);
        int id4 = data4.getId();
        Log.e("TAG", "Id: " + id4);
        Double maths4 = data4.getMaths();
        Log.e("TAG", "Maths: " + maths4);
        Double english4 = data4.getEnglish();
        Log.e("TAG", "English: " + english4);
        Double science4 = data4.getScience();
        Log.e("TAG", "Science: " + science4);
        String school4 = data4.getSchool();
        Log.e("TAG", "School: " + school4);

        //Student data5
        StudentsModelClass data5 = new StudentsModelClass();

        data5.setName("Shiksha");
        data5.setId(5);
        data5.setMaths(95.65);
        data5.setEnglish(78.65);
        data5.setScience(58.32);
        data5.setSchool("L.p.Savani");

        String name5 = data5.getName();
        Log.e("TAG", "Name: " + name5);
        int id5 = data5.getId();
        Log.e("TAG", "Id: " + id5);
        Double maths5 = data5.getMaths();
        Log.e("TAG", "Maths: " + maths5);
        Double english5 = data5.getEnglish();
        Log.e("TAG", "English: " + english5);
        Double science5 = data5.getScience();
        Log.e("TAG", "Science: " + science5);
        String school5 = data5.getSchool();
        Log.e("TAG", "School: " + school5);


        //Course Modular
        //Course info1
        CourseModelClass info1 = new CourseModelClass();

        info1.setCourseName("c");
        info1.setCourseFees(5000);
        info1.setDuration(2);


        String courseName1 = info1.getCourseName();
        Log.e("TAG", "Course Name: " + courseName1);
        int courseFees1 = info1.getCourseFees();
        Log.e("TAG", "Course Fees: " + courseFees1);

        int duration1 = info1.getDuration();
        Log.e("TAG", "Duration: " + duration1 + " " + "Month");

        //Course info2
        CourseModelClass info2 = new CourseModelClass();

        info2.setCourseName("c++");
        info2.setCourseFees(6000);
        info2.setDuration(2);


        String courseName2 = info2.getCourseName();
        Log.e("TAG", "Course Name: " + courseName2);
        int courseFees2 = info2.getCourseFees();
        Log.e("TAG", "Course Fees: " + courseFees2);

        int duration2 = info2.getDuration();
        Log.e("TAG", "Duration: " + duration2 + " " + "Month");

        //Course info3
        CourseModelClass info3 = new CourseModelClass();

        info3.setCourseName("Java");
        info3.setCourseFees(8500);
        info3.setDuration(3);


        String courseName3 = info3.getCourseName();
        Log.e("TAG", "Course Name: " + courseName3);
        int courseFees3 = info3.getCourseFees();
        Log.e("TAG", "Course Fees: " + courseFees3);

        int duration3 = info3.getDuration();
        Log.e("TAG", "Duration: " + duration3 + " " + "Month");


        //Course info4
        CourseModelClass info4 = new CourseModelClass();

        info4.setCourseName("MAster in Android");
        info4.setCourseFees(85000);
        info4.setDuration(12);


        String courseName4 = info4.getCourseName();
        Log.e("TAG", "Course Name: " + courseName4);
        int courseFees4 = info4.getCourseFees();
        Log.e("TAG", "Course Fees: " + courseFees4);

        int duration4 = info4.getDuration();
        Log.e("TAG", "Duration: " + duration4 + " " + "Month\n");


    }
}