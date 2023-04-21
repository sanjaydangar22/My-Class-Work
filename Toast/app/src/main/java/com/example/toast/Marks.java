package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class Marks extends AppCompatActivity {

    EditText edtNumber;  //variable Define
    AppCompatButton btnSubmit;  //variable Define
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks);


        button();  //Function Define
    }

    private void button() {
        edtNumber=findViewById(R.id.edtNumber);
        btnSubmit=findViewById(R.id.btnSubmit);

        Output();  //Function Define
    }

    private void Output() {
        btnSubmit.setOnClickListener(view -> {
            int marks=Integer.parseInt(edtNumber.getText().toString());

            if (marks <35) {
                Toast.makeText(this, "Fail", Toast.LENGTH_SHORT).show();
            }
            else if (marks >= 35 && marks <50) {
                Toast.makeText(this, "C grade", Toast.LENGTH_SHORT).show();
            }
            else if (marks >= 50 && marks <70) {
                Toast.makeText(this, "B grade", Toast.LENGTH_SHORT).show();
            }
            else if (marks >= 70 && marks <=90) {
                Toast.makeText(this, "A grade", Toast.LENGTH_SHORT).show();
            }
            else  {
                Toast.makeText(this, "A+ grade", Toast.LENGTH_SHORT).show();
            }
        });
    }
}