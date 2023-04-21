package com.example.aninterface.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aninterface.R;

public class SecondActivity extends AppCompatActivity {
ImageView imageView ;
TextView  txtName,txtQty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        view();
    }

    private void view() {
        imageView=findViewById(R.id.img);
        txtName=findViewById(R.id.txtTitle);
        txtQty=findViewById(R.id.txtQty);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int img = bundle.getInt("image");
           imageView.setImageResource(img);
        }
        String name=getIntent().getStringExtra("name");
        String quantity=getIntent().getStringExtra("quantity");

        txtName.setText(name);
        txtQty.setText(quantity);
    }
}