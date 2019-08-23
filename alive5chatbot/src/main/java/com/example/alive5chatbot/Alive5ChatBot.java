package com.example.alive5chatbot;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Alive5ChatBot {
    public static void show(Context c,String id){

        Intent intent = new Intent(c,WebViewBot.class);
        intent.putExtra("id",id);
        c.startActivity(intent);

    }
}
