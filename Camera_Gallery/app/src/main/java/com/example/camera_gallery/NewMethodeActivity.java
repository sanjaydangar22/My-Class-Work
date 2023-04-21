package com.example.camera_gallery;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;

import com.example.camera_gallery.databinding.ActivityNewMethodeBinding;

public class NewMethodeActivity extends AppCompatActivity {

    ActivityNewMethodeBinding newMethodeBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        newMethodeBinding=ActivityNewMethodeBinding.inflate(getLayoutInflater());
        setContentView(newMethodeBinding.getRoot());

        //camera
        newMethodeBinding.btnClick.setOnClickListener(v -> {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            camera_Launcher.launch(intent);
        });
        //gallery
        newMethodeBinding.btnGallery.setOnClickListener(g -> {
            Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
            gallery_Launcher.launch(intent);
        });
    }
    //camera
    ActivityResultLauncher<Intent> camera_Launcher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        Bitmap b = (Bitmap) data.getExtras().get("data");
                        newMethodeBinding.image.setImageBitmap(b);
                    }

                }
            });

    //gallery
    ActivityResultLauncher<Intent> gallery_Launcher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        Uri uri = data.getData();
                        newMethodeBinding.image.setImageURI(uri);
                    }

                }
            });



}