package com.example.alive5chatbot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewBot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_bot);

        WebView webView = (WebView) findViewById(R.id.view_chat_bot);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        if(b!=null){
            String id = (String) b.get("id");
            webView.loadUrl(id);
        }
    }
}
