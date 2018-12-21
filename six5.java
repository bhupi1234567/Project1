package com.example.ashutosh.demoproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class six5 extends AppCompatActivity {
    WebView w1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six5);
        w1=(WebView)findViewById(R.id.webView);

        w1.loadUrl(six4.s);
    }
}
