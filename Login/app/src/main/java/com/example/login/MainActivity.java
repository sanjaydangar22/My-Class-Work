package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LoginPage();   //define veribal
        NewUser();      //define veribal

    }
    void LoginPage() {  //veribal use

        Button btnLogin = findViewById(R.id.btnLogin);  //define button
        EditText edtEmail = findViewById(R.id.edtEmail);
        EditText edtPassword = findViewById(R.id.edtPassword);



        btnLogin.setOnClickListener(View -> {  //buttton click method use

            Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();

            String email = edtEmail.getText().toString();
            String password = edtPassword.getText().toString();

            Log.e("Loginpage :", " Login Succeeded");  //output  for devloper
            Log.e("Loginpage :", " Email :- " + email);
            Log.e("Loginpage :", " Password :- " + password);
        });

    }

    void NewUser() {  //this veribal use other  Activity open

        Button btnNewUser = findViewById(R.id.btnNewUser);

        btnNewUser.setOnClickListener(View -> {
            openActivity2();   //define Activity varibal
        });
    }

    public void openActivity2() {
        Intent intent=new Intent(this ,Activity2.class);  //create intent object
        startActivity(intent);
    }


}