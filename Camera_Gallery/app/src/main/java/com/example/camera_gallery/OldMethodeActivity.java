package com.example.camera_gallery;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;


import com.example.camera_gallery.databinding.ActivityOldMethodeBinding;

public class OldMethodeActivity extends AppCompatActivity {

    ActivityOldMethodeBinding oldMethodeBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        oldMethodeBinding = ActivityOldMethodeBinding.inflate(getLayoutInflater());
        setContentView(oldMethodeBinding.getRoot());

        old_View();

    }





    private void old_View() {

        oldMethodeBinding.btnGallery.setOnClickListener(v->{
            Intent gallery=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
            startActivityForResult(gallery,1);

        });
        oldMethodeBinding.btnClick.setOnClickListener(v->{

            Intent gallery=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(gallery,2);

        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1  && resultCode== RESULT_OK){
            Uri uri = data.getData();
            oldMethodeBinding.image.setImageURI(uri);
        }
        else if(requestCode == 2  && resultCode== RESULT_OK){
            Bitmap b=(Bitmap)data.getExtras().get("data") ;
            oldMethodeBinding.image.setImageBitmap(b);
        }
    }
}