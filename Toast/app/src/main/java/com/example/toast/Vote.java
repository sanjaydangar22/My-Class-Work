package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class Vote extends AppCompatActivity {

    EditText edtNumber;         // variable  Define
    AppCompatButton btnSubmit;   // variable  Define

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);

        button();  // Function  Define
    }

    private void button() {
        edtNumber=findViewById(R.id.edtNumber);
        btnSubmit=findViewById(R.id.btnSubmit);

        Output();  // Function  Define
    }

    private void Output() {
        btnSubmit.setOnClickListener(view -> {
            int Age=Integer.parseInt(edtNumber.getText().toString());

            if (Age <18) {
                Toast.makeText(this, "You are not eligble for Vote", Toast.LENGTH_SHORT).show();
            }

            else  {
                Toast.makeText(this, "You are  eligble for Vote", Toast.LENGTH_SHORT).show();
            }
        });
    }
}