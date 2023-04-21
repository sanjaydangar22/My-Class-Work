package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class SimpleDialogActivity extends AppCompatActivity {

    AppCompatButton btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_dialog);

        view();
    }

    private void view() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

//Alert
        btn1.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Alert Dialog");
            builder.setMessage("Are you sure Exit?");
            builder.setPositiveButton("Yas", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(SimpleDialogActivity.this, "Yas Button Click", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(SimpleDialogActivity.this, "No Button Click", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNeutralButton("Dismiss", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(SimpleDialogActivity.this, "Dismiss Button click", Toast.LENGTH_SHORT).show();
                }
            });
            builder.show();
        });

//        Save
        btn2.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Save");
            builder.setMessage("Are you sure Edit Data Save?");
            builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(SimpleDialogActivity.this, "Your Data is Save", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(SimpleDialogActivity.this, "Your Data is Not Save", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNeutralButton("Dismiss", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(SimpleDialogActivity.this, "Dismiss Button click", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setCancelable(false);
            builder.show();
        });

//        Update
        btn3.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Update");
            builder.setMessage("Are you sure Update?");
            builder.setPositiveButton("Update", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(SimpleDialogActivity.this, "Your Data is Update", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNegativeButton("Cansel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(SimpleDialogActivity.this, "Your Data is not Update", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNeutralButton("Remind Later", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(SimpleDialogActivity.this, "Update Later", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setCancelable(false);
            builder.show();
        });

//        Progress
        btn4.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Progress Button");
            builder.setMessage("Your Data is progress");
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(SimpleDialogActivity.this, "Your Data is Progress", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setCancelable(false);
            builder.show();
        });

//        Select
        btn5.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Select Button");
            builder.setMessage("Select Any one");
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(SimpleDialogActivity.this, "select any one Button", Toast.LENGTH_SHORT).show();
                }
            });
            builder.show();
        });
    }
}