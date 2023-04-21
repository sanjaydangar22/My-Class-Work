package com.example.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registionfrom();
    }

    void registionfrom(){

        Button btnSubmit=findViewById(R.id.btnSubmit);
        EditText edtName=findViewById(R.id.edtName);
        EditText edtEmail=findViewById(R.id.edtEmail);
        EditText edtPassword=findViewById(R.id.edtPassword);
        EditText edtCPassword=findViewById(R.id.edtCPassword);
        CheckBox chkRidding =findViewById(R.id.chkRidding);
        CheckBox chkWriting =findViewById(R.id.chkWriting);
        CheckBox chkSinging =findViewById(R.id.chkSinging);


        btnSubmit.setOnClickListener(View ->{

            String name =edtName.getText().toString();
            String email=edtEmail.getText().toString();
            String password=edtPassword.getText().toString();
            String cpassword=edtCPassword.getText().toString();

            boolean a=chkRidding.isChecked();
            boolean b=chkWriting.isChecked();
            boolean c=chkSinging.isChecked();


            Toast.makeText(this, "Submit", Toast.LENGTH_SHORT).show();


            Log.e("registionfrom: "," Submit button is Click"  );
            Log.e("registionfrom: "," Name :- " +name );
            Log.e("registionfrom: "," Email :-" +email );
            Log.e("registionfrom: "," Password :- " +password );
            Log.e("registionfrom: "," Confirm Password :- " +cpassword );
            Log.e("registionfrom", "Ridding "+a );
            Log.e("registionfrom", "Writing "+b );
            Log.e("registionfrom", "Singing "+c );


        });



    }
}