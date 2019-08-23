package com.example.alive5chatbot;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Alive5ChatBot {
    public static void show(Context c,String message){

        Intent intent = new Intent(c,WebView.class);
        c.startActivity(intent);

    }
}
