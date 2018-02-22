package com.example.thanakritjinjai.cartoononline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main3Activity extends AppCompatActivity {
    WebView ourBrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ourBrow=(WebView)findViewById(R.id.webView);
        ourBrow.getSettings().setJavaScriptEnabled(true);
        ourBrow.loadUrl("http://tv.trueid.net/live/cartoonclub");
    }
}
