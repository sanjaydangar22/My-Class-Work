package com.example.optionmanu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.optionmanu.databinding.ActivityMainBinding;

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


        setSupportActionBar(mainBinding.toolbar);
        mainBinding.toolbar.setTitleTextColor(Color.WHITE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.optionitem, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int i = item.getItemId();
        switch (i) {
            case R.id.home:
                Toast.makeText(this, "Home ", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.setting:
                Toast.makeText(this, "Setting ", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.search:
                Toast.makeText(this, "Search ", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.payment:
                Toast.makeText(this, "Payment ", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

}