package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SingleChoiceActivity extends AppCompatActivity {

    AppCompatButton btnSingle;
    TextView txtAns;
    String[] listarr = {"BBA", "B.Come", "BCA", "BSC", "B.TECH"};

    String selecteditem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_choice);

        view();
    }

    private void view() {
        btnSingle = findViewById(R.id.btnSingle);
        txtAns = findViewById(R.id.txtAns);


        btnSingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder single = new AlertDialog.Builder(SingleChoiceActivity.this);
                single.setTitle("Choose item");
                single.setSingleChoiceItems(listarr, 1, (dialog, which) -> {
                    selecteditem = listarr[which];


                    Toast.makeText(SingleChoiceActivity.this, "" + selecteditem, Toast.LENGTH_SHORT).show();

                });
                single.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        txtAns.setText(selecteditem);

                    }
                });
                single.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                single.setCancelable(false);
                single.show();
            }
        });
    }
}