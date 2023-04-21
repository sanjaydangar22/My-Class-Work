package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.DialogInterface;
import android.os.Bundle;

public class MultipleChoiceActivity extends AppCompatActivity {

    AppCompatButton btnMultiple;
    String[] listArray={"C","c++","Java","Python","C#","Jqury"};
    boolean[] listBoolean={true,true,true,false,false,false};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_choice);

        view();
    }

    private void view() {
        btnMultiple=findViewById(R.id.btnMultiple);

        btnMultiple.setOnClickListener(m->{
            AlertDialog.Builder multiple=new AlertDialog.Builder(MultipleChoiceActivity.this);
            multiple.setTitle("Choose item");
            multiple.setMultiChoiceItems(listArray, listBoolean, new DialogInterface.OnMultiChoiceClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which, boolean isChecked) {
               String selectedId=listArray[which];
                }
            });
            multiple.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            multiple.setCancelable(false);
            multiple.show();
        });
    }
}