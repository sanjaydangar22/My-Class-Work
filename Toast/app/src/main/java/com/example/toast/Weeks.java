package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class Weeks extends AppCompatActivity {
    EditText edtNumber;  // Variable Define
    AppCompatButton btnSubmit;  // Variable Define

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weeks);

        button();  // Function Define
    }

    private void button() {
        edtNumber=findViewById(R.id.edtNumber);
        btnSubmit=findViewById(R.id.btnSubmit);

        Output(); // Function Define
    }

    private void Output() {
        btnSubmit.setOnClickListener(view -> {
            int Week=Integer.parseInt(edtNumber.getText().toString());

            switch(Week){
                case 1:
                    Toast.makeText(this, "Monday", Toast.LENGTH_SHORT).show();
                    break;

                case 2:
                    Toast.makeText(this, "Tuesday", Toast.LENGTH_SHORT).show();
                    break;

                case 3:
                    Toast.makeText(this, "Wednesday", Toast.LENGTH_SHORT).show();
                    break;
                case 4:
                    Toast.makeText(this, "Thursday", Toast.LENGTH_SHORT).show();
                    break;
                case 5:
                    Toast.makeText(this, "Friday", Toast.LENGTH_SHORT).show();
                    break;
                case 6:
                    Toast.makeText(this, "Saturday", Toast.LENGTH_SHORT).show();
                    break;
                case 7:
                    Toast.makeText(this, "Sunday", Toast.LENGTH_SHORT).show();
                    break;
                default :
                    Toast.makeText(this, "Invalid Number", Toast.LENGTH_SHORT).show();

            }

        });
    }
}