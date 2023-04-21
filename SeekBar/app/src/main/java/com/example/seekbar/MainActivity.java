package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtAge;
    SeekBar  seekBar1, seekBar2, seekBar3, seekBar4,seekBar5;
    TextView txtAns1,txtAns2,txtAns3,txtAns4,txtAns5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button();
    }

    private void button() {

        seekBar1=findViewById(R.id.seekBar1);
        txtAns1=findViewById(R.id.txtAns1);

        seekBar2=findViewById(R.id.seekBar2);
        txtAns2=findViewById(R.id.txtAns2);

        seekBar3=findViewById(R.id.seekBar3);
        txtAns3=findViewById(R.id.txtAns3);

        seekBar4=findViewById(R.id.seekBar4);
        txtAns4=findViewById(R.id.txtAns4);

        seekBar5=findViewById(R.id.seekBar5);
        txtAns5=findViewById(R.id.txtAns5);


        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int age, boolean fromUser) {
                txtAns1.setText("Age:-"+age);
            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int age, boolean fromUser) {
                txtAns2.setText("Age:-"+age);
            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int age, boolean fromUser) {
                txtAns3.setText("Age:-"+age);
            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int age, boolean fromUser) {
                txtAns4.setText("Age:-"+age);
            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int age, boolean fromUser) {
                txtAns5.setText("Age:-"+age);
            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}