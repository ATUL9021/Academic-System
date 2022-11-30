package com.example.academicrecordsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class CoreScreen extends AppCompatActivity {
TextView admin;
ImageView firstImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core_screen);
        getSupportActionBar().hide();
       admin=findViewById(R.id.admin);
       firstImage=findViewById(R.id.firstImage);
       admin.setOnClickListener(v->{
           Intent intent=new Intent(CoreScreen.this,AdminLogin.class);
           startActivity(intent);
       });
        firstImage.setOnClickListener(v->{
            Intent intent=new Intent(CoreScreen.this,AdminLogin.class);
            startActivity(intent);
        });

    }
}