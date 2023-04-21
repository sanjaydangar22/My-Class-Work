package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;
import com.example.meditation.databinding.ActivityMbreathBinding;

public class MBreathActivity extends AppCompatActivity {


    ActivityMbreathBinding mbreathBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mbreathBinding = ActivityMbreathBinding.inflate(getLayoutInflater());
        setContentView(mbreathBinding.getRoot());

        view();
    }

    private void view() {
        mbreathBinding.imgBack.setOnClickListener(b->{
            Intent i=new Intent(this,MeditationActivity.class);
            startActivity(i);
            finish();
        });
        MediaPlayer music = MediaPlayer.create(this, R.raw.m);

        mbreathBinding.imgPlay.setOnClickListener(b -> {
//            Intent i=new Intent(this,MBreathMusicintoActivity.class);
//            startActivity(i);
//            finish();




            if (music.isPlaying()) {

                music.stop();
            }
          else {
                music.start();
            }

        });


    }
}