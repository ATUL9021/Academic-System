package com.example.academicrecordsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class StartingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_screen);
        getSupportActionBar().hide();
        Thread t=new Thread(){
            public void run(){
                try{Thread.sleep(5000);}catch(InterruptedException e){e.printStackTrace();}finally{
                    Intent intent=new Intent(StartingScreen.this,CoreScreen.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        t.start();

    }
}