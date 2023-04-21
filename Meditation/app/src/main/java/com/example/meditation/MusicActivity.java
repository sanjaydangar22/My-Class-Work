package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.meditation.databinding.ActivityMusicBinding;

public class MusicActivity extends AppCompatActivity {

    ActivityMusicBinding musicBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        musicBinding=ActivityMusicBinding.inflate(getLayoutInflater());
        setContentView(musicBinding.getRoot());
    }
}