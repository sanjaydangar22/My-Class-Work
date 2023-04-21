package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edtNumber;
AppCompatButton btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button();
    }

    private void button() {
        edtNumber=findViewById(R.id.edtNumber);
        btnSubmit=findViewById(R.id.btnSubmit);

        Output();
    }

    private void Output() {
        btnSubmit.setOnClickListener(view -> {

            String v1=edtNumber.getText().toString();

            Toast.makeText(MainActivity.this, ""+v1, Toast.LENGTH_SHORT).show();
          
        });
    }
}