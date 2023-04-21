package com.example.meditation;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.meditation.databinding.ActivityHomeBinding;

import java.time.Instant;

public class HomeActivity extends AppCompatActivity {
    
    ActivityHomeBinding homeBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeBinding=ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(homeBinding.getRoot());

        view();
    }

    private void view() {
        homeBinding.cdYoga.setOnClickListener(y->{
            Intent yoga=new Intent(this,YogaActivity.class);
            startActivity(yoga);
        });
        homeBinding.cdMeditation.setOnClickListener(me->{
            Intent meditation=new Intent(this,MeditationActivity.class);
            startActivity(meditation);


        });
//        homeBinding.cdMusic.setOnClickListener(mu->{
//            Intent music=new Intent(this,MusicActivity.class);
//            startActivity(music);
//        });
        homeBinding.cdMantra.setOnClickListener(mu->{
            Intent mantra=new Intent(this,MantraActivity.class);
            startActivity(mantra);
        });

    }
}