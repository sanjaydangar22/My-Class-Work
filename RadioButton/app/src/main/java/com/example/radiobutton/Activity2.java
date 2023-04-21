package com.example.radiobutton;

import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class Activity2 extends AppCompatActivity {

    ImageView img;
    EditText edtName, edtEmail, edtNumber, edtPassword, edtCPassword; //Button Variable

    CheckBox chkReading, chkWriting, chkSinging;  //Button Variable

    RadioGroup rgGroup;

    AppCompatButton btnSubmit, btnClear;   //Button Variable


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


//        Button Define

        img = findViewById(R.id.imgLogo);

        edtName = findViewById(R.id.edtName);
        edtEmail = findViewById(R.id.edtEmail);
        edtNumber = findViewById(R.id.edtNumber);
        edtPassword = findViewById(R.id.edtPassword);
        edtCPassword = findViewById(R.id.edtCPassword);

        chkReading = findViewById(R.id.chkReading);
        chkWriting = findViewById(R.id.chkWriting);
        chkSinging = findViewById(R.id.chkSinging);

        rgGroup = findViewById(R.id.rgGroup);


        btnSubmit = findViewById(R.id.btnSubmit);
        btnClear = findViewById(R.id.btnClear);

        output();
        Clear();
    }


    public void output() {


        btnSubmit.setOnClickListener(s -> {
            String name = edtName.getText().toString();
            String email = edtEmail.getText().toString();
            String number = edtNumber.getText().toString();
            String password = edtPassword.getText().toString();
            String cpassword = edtCPassword.getText().toString();


            Log.e("TAG", "Name :- " + name);
            Log.e("TAG", "Email :- " + email);
            Log.e("TAG", "Mobile Number :- " + number);
            Log.e("TAG", "Password :- " + password);
            Log.e("TAG", "Confirm Password :- " + cpassword);

            if (chkReading.isChecked()) {
                Log.e("TAG", "Hobby :- " + chkReading.getText().toString());
            }
            if (chkWriting.isChecked()) {
                Log.e("TAG", "Hobby :- " + chkWriting.getText().toString());
            }
            if (chkSinging.isChecked()) {
                Log.e("TAG", "Hobby :- " + chkSinging.getText().toString());
            }

            int selectedId = rgGroup.getCheckedRadioButtonId();
            RadioButton rb = findViewById(selectedId);

            Log.e("TAG", "Gender :- " + rb.getText() );


        });
        img.setImageResource(R.drawable.img);
    }

    private void Clear() {
        btnClear.setOnClickListener(c -> {
            edtName.setText("");
            edtEmail.setText("");
            edtNumber.setText("");
            edtPassword.setText("");
            edtCPassword.setText("");

            chkReading.setChecked(false);
            chkWriting.setChecked(false);
            chkSinging.setChecked(false);

            rgGroup.clearCheck();
        });

    }
}