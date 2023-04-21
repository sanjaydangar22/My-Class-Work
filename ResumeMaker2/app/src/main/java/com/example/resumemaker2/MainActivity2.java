package com.example.resumemaker2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView txtName, txtEmail, txtNumber,txtBirthDD,txtBirthMM,txtBirthYY, txtHobby, txtGender, txtMarital;
    TextView txtMarks10, txtMarks12, txtMarksBCA, txtYear10, txtYear12, txtYearBCA;
    TextView txtjobName, txtjobYear;
    TextView txtskill;
    ImageView imgBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        id();
    }

    private void id() {

        txtName = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        txtNumber = findViewById(R.id.txtNumber);
        txtBirthDD = findViewById(R.id.txtBirthDD);
        txtBirthMM = findViewById(R.id.txtBirthMM);
        txtBirthYY = findViewById(R.id.txtBirthYY);


        txtHobby = findViewById(R.id.txtHobby);
        txtGender = findViewById(R.id.txtGender);
        txtMarital = findViewById(R.id.txtMarital);

        txtMarks10 = findViewById(R.id.txtMarks10);
        txtYear10 = findViewById(R.id.txtYear10);

        txtMarks12 = findViewById(R.id.txtMarks12);
        txtYear12 = findViewById(R.id.txtYear12);

        txtMarksBCA = findViewById(R.id.txtMarksBCA);
        txtYearBCA = findViewById(R.id.txtYearBCA);

        txtjobName = findViewById(R.id.txtjobName);
        txtjobYear = findViewById(R.id.txtjobYear);

        txtskill = findViewById(R.id.txtskill);



        view();
    }

    private void view() {
        String FName = getIntent().getStringExtra("FName");

        String email = getIntent().getStringExtra("email");
//        String number = getIntent().getStringExtra("m_number");
//        String BirthDD = getIntent().getStringExtra("BirthDD");
//        String BirthMM = getIntent().getStringExtra("BirthMM");
//        String BirthYY = getIntent().getStringExtra("BirthYY");

        String gender = getIntent().getStringExtra("gender");

        String hobby = getIntent().getStringExtra("hobby");


        String Marital = getIntent().getStringExtra("Marital");

        String marks10 = getIntent().getStringExtra("marks10");
        String Year10 = getIntent().getStringExtra("year10");

        String marks12 = getIntent().getStringExtra("marks12");
        String Year12 = getIntent().getStringExtra("year12");

        String marksBCA = getIntent().getStringExtra("marksBCA");
        String YearBCA = getIntent().getStringExtra("yearBCA");
        //Experience
        String jobName = getIntent().getStringExtra("jobName");
        String jobYear = getIntent().getStringExtra("jobYear");
        //Your Skill
        String skill = getIntent().getStringExtra("skill");


        txtName.setText(FName);

        txtEmail.setText(email);
//        txtNumber.setText(number);
//        txtBirthDD.setText(BirthDD);
//        txtBirthMM.setText(BirthMM);
//        txtBirthYY.setText(BirthYY);

        txtGender.setText(gender);


        txtHobby.setText(hobby);

        txtMarital.setText(Marital);

        txtMarks10.setText(marks10);
        txtYear10.setText(Year10);

        txtMarks12.setText(marks12);
        txtYear12.setText(Year12);

        txtMarksBCA.setText(marksBCA);
        txtYearBCA.setText(YearBCA);

        txtjobName.setText(jobName);
        txtjobYear.setText(jobYear);

        txtskill.setText(skill);

        clear();

    }

    private void clear() {
//        imgBack.setOnClickListener(i -> {
//            txtGender.setText("");
//            txtHobby.setText("");
//            txtskill.setText("");
//            txtMarital.setText("");
//            Intent intent = new Intent(this, MainActivity.class);
//            startActivity(intent);
//            finish();


  //      });
    }


}