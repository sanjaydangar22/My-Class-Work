package com.example.glide;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view();
    }

    private void view() {
        img=findViewById(R.id.img);
        Glide.with(this).load("https://picsum.photos/200/300").placeholder(R.drawable.logo).into(img);
        //Picasso.get().load("https://i.imgur.com/DvpvklR.png").into(img);

    }
}