package com.example.camera_gallery;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.LinearLayout;

import com.example.camera_gallery.databinding.ActivityCusttomeDialogBinding;
import com.example.camera_gallery.databinding.ActivityUseDilogeBoxBinding;
import com.google.android.material.imageview.ShapeableImageView;

public class UseDilogeBoxActivity extends AppCompatActivity {


    ActivityUseDilogeBoxBinding dilogeBoxBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dilogeBoxBinding = ActivityUseDilogeBoxBinding.inflate(getLayoutInflater());
        setContentView(dilogeBoxBinding.getRoot());

        view();
    }

    private void view() {
        dilogeBoxBinding.btnSelect.setOnClickListener(u -> {
            Dialog update = new Dialog(this);
            ActivityCusttomeDialogBinding custtomeDialogBinding = ActivityCusttomeDialogBinding.inflate(getLayoutInflater());
            update.setContentView(custtomeDialogBinding.getRoot());

            //camera
            custtomeDialogBinding.layCamera.setOnClickListener(v -> {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                camera_Launcher.launch(intent);
                update.dismiss();

            });
            //gallery
            custtomeDialogBinding.layGallery.setOnClickListener(g -> {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                gallery_Launcher.launch(intent);
                update.dismiss();
            });
            //cancel
            custtomeDialogBinding.txtCancel.setOnClickListener(g -> {

                update.dismiss();
            });

            update.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            update.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            update.setCancelable(false);
            update.show();
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
                        dilogeBoxBinding.image.setImageBitmap(b);
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
                        dilogeBoxBinding.image.setImageURI(uri);
                    }

                }
            });
}