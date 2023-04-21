package com.example.progresbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar prSimple;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View();
    }

    private void View() {
        prSimple=findViewById(R.id.prSimple);
        prSimple.setMax(100);
    }
}