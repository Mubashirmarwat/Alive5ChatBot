package com.example.alive5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Alive5ChatBot.s(MainActivity.this,"Test Message");
        setContentView(R.layout.activity_main);
    }
}
