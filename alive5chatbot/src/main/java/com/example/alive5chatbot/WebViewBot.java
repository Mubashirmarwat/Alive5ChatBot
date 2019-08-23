package com.example.alive5chatbot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

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
            Toast.makeText(this,id,Toast.LENGTH_LONG).show();
            String url = "http://s3.amazonaws.com/alive5cdn/stage_chat_window.html?wid="+id;
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(url);
        }
    }
}
