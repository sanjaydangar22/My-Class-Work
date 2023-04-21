package com.example.meditation;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.meditation.databinding.ActivityMeditationBinding;

public class MeditationActivity extends AppCompatActivity {

    ActivityMeditationBinding meditationBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        meditationBinding=ActivityMeditationBinding.inflate(getLayoutInflater());
        setContentView(meditationBinding.getRoot());


        view();

    }

    private void view() {
        meditationBinding.imgBack.setOnClickListener(b->{
            Intent i=new Intent(this,HomeActivity.class);
            startActivity(i);
            finish();
        });
        meditationBinding.cdBreath.setOnClickListener(b->{
            Intent breath=new Intent(this, MBreathActivity.class);
            startActivity(breath);
        });
        meditationBinding.cdMantraMusic.setOnClickListener(m->{
            Intent mantra=new Intent(this, MMantraMusicActivity.class);
            startActivity(mantra);
        });
        meditationBinding.cdSilentMusic.setOnClickListener(s->{
            Intent silent=new Intent(this, MSilentMusicActivity.class);
            startActivity(silent);
        });
        meditationBinding.cdNature.setOnClickListener(n->{
            Intent Nature=new Intent(this,MNatureMusicActivity.class);
            startActivity(Nature);
        });
        meditationBinding.cdWhMedi.setOnClickListener(w->{
            Intent what_medi=new Intent(this, MWhatisMediActivity.class);
            startActivity(what_medi);
        });
        meditationBinding.cdWhyLMedi.setOnClickListener(wh->{
            Intent why_larn=new Intent(this, MWhyLarnMediActivity.class);
            startActivity(why_larn);
        });
        meditationBinding.cdHowtoMedi.setOnClickListener(h->{
            Intent how_to=new Intent(this, MHowtoMeditateActivity.class);
            startActivity(how_to);
        });
       meditationBinding.cdMudra.setOnClickListener(s->{
           Intent mudra=new Intent(this,MMeditationMudraActivity.class);
           startActivity(mudra);
       });


    }


}