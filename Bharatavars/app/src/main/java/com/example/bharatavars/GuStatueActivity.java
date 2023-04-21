package com.example.bharatavars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class GuStatueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gu_statue);

        onClick();

    }

    private void onClick() {
        LinearLayout layHome = findViewById(R.id.layHome);
        layHome.setOnClickListener(l -> {
            Intent ly = new Intent(this, GuMainActivity.class);
            startActivity(ly);
            finish();
        });
    }
}