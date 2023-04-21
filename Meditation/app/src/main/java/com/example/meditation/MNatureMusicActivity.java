package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.meditation.databinding.ActivityMnatureMusicBinding;

public class MNatureMusicActivity extends AppCompatActivity {
    ActivityMnatureMusicBinding mnatureMusicBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mnatureMusicBinding = ActivityMnatureMusicBinding.inflate(getLayoutInflater());
        setContentView(mnatureMusicBinding.getRoot());

        view();
    }

    private void view() {
        mnatureMusicBinding.imgBack.setOnClickListener(b -> {
            Intent i = new Intent(this, MeditationActivity.class);
            startActivity(i);
        });
    }
}