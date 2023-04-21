package com.example.wabview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
view();

    }

    private void view() {

        // Find the WebView by its unique ID
        WebView webView = findViewById(R.id.webView);

        // loading http://www.google.com url in the WebView.
        webView.loadUrl("https://www.geeksforgeeks.org");

        // this will enable the javascript.
        webView.getSettings().setJavaScriptEnabled(true);

        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        webView.setWebViewClient(new WebViewClient());


    }
}