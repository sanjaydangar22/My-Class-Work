package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.meditation.databinding.ActivityMsilentMusicBinding;

public class MSilentMusicActivity extends AppCompatActivity {

    ActivityMsilentMusicBinding msilentMusicBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        msilentMusicBinding=ActivityMsilentMusicBinding.inflate(getLayoutInflater());
        setContentView(msilentMusicBinding.getRoot());

        view();
    }

    private void view() {
        msilentMusicBinding.imgBack.setOnClickListener(b->{
            Intent i =new Intent(MSilentMusicActivity.this,MeditationActivity.class);
                startActivity(i);
        });

    }
}