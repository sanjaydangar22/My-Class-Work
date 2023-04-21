package com.example.checkebox;

import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class Activity extends AppCompatActivity {


    EditText edtName,edtEmail, edtNumber, edtPassword, edtCPassword; //Button Variable

    CheckBox chkReading, chkWriting, chkSinging;  //Button Variable

    AppCompatButton btnSubmit, btnClear;   //Button Variable


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);


//        Button Define

         edtName=findViewById(R.id.edtName);
         edtEmail=findViewById(R.id.edtEmail);
         edtNumber=findViewById(R.id.edtNumber);
         edtPassword=findViewById(R.id.edtPassword);
         edtCPassword=findViewById(R.id.edtCPassword);

         chkReading=findViewById(R.id.chkReading);
         chkWriting=findViewById(R.id.chkWriting);
         chkSinging=findViewById(R.id.chkSinging);

         btnSubmit=findViewById(R.id.btnSubmit);
         btnClear=findViewById(R.id.btnClear);

        output();
        Clear();
    }



    private void output() {
        btnSubmit.setOnClickListener(s ->{
            String name=edtName.getText().toString();
            String email=edtEmail.getText().toString();
            String number=edtNumber.getText().toString();
            String password=edtPassword.getText().toString();
            String cpassword=edtCPassword.getText().toString();



            Log.e("TAG", "Name :- "+name );
            Log.e("TAG", "Email :- "+email );
            Log.e("TAG", "Mobile Number :- "+number );
            Log.e("TAG", "Password :- "+password );
            Log.e("TAG", "Confirm Password :- "+cpassword );

            if(chkReading.isChecked()){
                Log.e("TAG", "Hobby :- " + chkReading.getText().toString());
            }
            if(chkWriting.isChecked()){
                Log.e("TAG", "Hobby :- " + chkWriting.getText().toString());
            }
            if(chkSinging.isChecked()){
                Log.e("TAG", "Hobby :- " + chkSinging.getText().toString());
            }


        });
    }
    private void Clear() {
        btnClear.setOnClickListener(c->{
            edtName.setText("");
            edtEmail.setText("");
            edtNumber.setText("");
            edtPassword.setText("");
            edtCPassword.setText("");

            chkReading.setChecked(false);
            chkWriting.setChecked(false);
            chkSinging.setChecked(false);
        });
    }
}