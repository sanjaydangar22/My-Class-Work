package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        CreatAccount();  //define veribal
        CLogin();        //define veribal
    }
    void CreatAccount() { //veribal use

        Button btnCreatAccount = findViewById(R.id.btnCreatAccount);  //define button
        EditText edtCName = findViewById(R.id.edtCName);
        EditText edtCEmail = findViewById(R.id.edtCEmail);
        EditText edtCPassword = findViewById(R.id.edtCPassword);



        btnCreatAccount.setOnClickListener(View -> {   //buttton click method use

            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();

            String name = edtCName.getText().toString();
            String email = edtCEmail.getText().toString();
            String password = edtCPassword.getText().toString();

            Log.e("CreatAccount :", " CreatAccount Succeeded");  //output  for devloper
            Log.e("CreatAccount :", " NAME :- "+name);
            Log.e("CreatAccount :", " Email :- " + email);
            Log.e("CreatAccount :", " Password :- " + password);
        });

    }

    void CLogin() {  //this veribal use other  Activity open

        Button btnNewUser = findViewById(R.id.btnCLogin);

        btnNewUser.setOnClickListener(View -> {
            openMainActivity(); //define Activity varibal
        });
    }

    public void openMainActivity() { //use Avtivity varible
        Intent intent = new Intent(this, MainActivity.class); //create intent object
        startActivity(intent);

    }


}