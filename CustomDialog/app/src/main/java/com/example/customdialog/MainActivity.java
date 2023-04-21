package com.example.customdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.customdialog.databinding.ActivityMainBinding;
import com.example.customdialog.databinding.DialogAlertBinding;

import com.example.customdialog.databinding.DialogLoginBinding;
import com.example.customdialog.databinding.DialogUpdateBinding;
import com.example.customdialog.databinding.SimpleDialogCustomeBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        view();
    }

    private void view() {

        mainBinding.btnSimple.setOnClickListener(b -> {
            Dialog dialogsimple = new Dialog(this);
            SimpleDialogCustomeBinding dialogCustomeBinding = SimpleDialogCustomeBinding.inflate(getLayoutInflater());
            dialogsimple.setContentView(dialogCustomeBinding.getRoot());


            dialogCustomeBinding.btnUpdate.setOnClickListener(u -> {
                Toast.makeText(this, "Update Success", Toast.LENGTH_SHORT).show();
                dialogsimple.dismiss();
            });
            dialogsimple.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialogsimple.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            dialogsimple.show();
        });


        mainBinding.btnLogin.setOnClickListener(b -> {
            Dialog dialogLogin = new Dialog(this);
            DialogLoginBinding dialogLoginBinding = DialogLoginBinding.inflate(getLayoutInflater());
            dialogLogin.setContentView(dialogLoginBinding.getRoot());


            dialogLoginBinding.btnLogin.setOnClickListener(u -> {
                String email = dialogLoginBinding.edtLogEmail.getText().toString();
                String pass = dialogLoginBinding.edtLogPass.getText().toString();

                if (email.isEmpty()) {
                    Toast.makeText(this, "Email is Require", Toast.LENGTH_SHORT).show();
                } else if (pass.isEmpty()) {
                    Toast.makeText(this, "Password is Require", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
                    dialogLogin.dismiss();

                    MediaPlayer music=MediaPlayer.create(this,R.raw.s5);
                    music.start();
                }
            });
            dialogLogin.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialogLogin.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            dialogLogin.setCancelable(false);
            dialogLogin.show();
        });
        mainBinding.btnUpdate.setOnClickListener(u -> {
            Dialog update = new Dialog(this);
            DialogUpdateBinding updateBinding = DialogUpdateBinding.inflate(getLayoutInflater());
            update.setContentView(updateBinding.getRoot());

            updateBinding.btnUpdate.setOnClickListener(k -> {
                update.dismiss();
            });

            update.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            update.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            update.setCancelable(false);
            update.show();
        });
        mainBinding.btnAlert.setOnClickListener(n-> {
                Dialog alert=new Dialog(this);
            DialogAlertBinding alertBinding= DialogAlertBinding.inflate(getLayoutInflater());
            alert.setContentView(alertBinding.getRoot());

            MediaPlayer music=MediaPlayer.create(this,R.raw.s3);
            music.start();
            alertBinding.btnAlert.setOnClickListener(a->{
                Toast.makeText(this, "Thanks ", Toast.LENGTH_SHORT).show();
                alert.dismiss();
            });

            alert.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            alert.getWindow().setLayout(LinearLayout .LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            alert.setCancelable(false);
            alert.show();




        });
    }
}