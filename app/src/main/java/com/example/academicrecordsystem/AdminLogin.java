
package com.example.academicrecordsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLogin extends AppCompatActivity {
EditText adminid,password;
Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        getSupportActionBar().hide();
        String [][]userAndPassword={{"umapatelthakur@jit","UMA@JIT"},
                {"imran@jit","IMRAN@JIT"}};
        adminid=findViewById(R.id.adminid);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);
        login.setOnClickListener(v->{
            if(adminid.getText().toString().isEmpty()){
                Toast.makeText(this,"Please Enter UserId",Toast.LENGTH_SHORT).show();
            }
            if(password.getText().toString().isEmpty()){
                Toast.makeText(this,"Please Enter Password",Toast.LENGTH_SHORT).show();
            }
            if(!adminid.getText().toString().isEmpty() &&  !password.getText().toString().isEmpty()){
               if(adminid.getText().toString().equals(userAndPassword[0][0]) && password.getText().toString().equals(userAndPassword[0][1])){
                   Intent intent=new Intent(AdminLogin.this,MainActivity.class);
                    intent.putExtra("name","Uma Patel Thakur");
                   startActivity(intent);
               }
               else if(adminid.getText().toString().equals(userAndPassword[1][0]) && password.getText().toString().equals(userAndPassword[1][1])){
                   Intent intent=new Intent(AdminLogin.this,MainActivity.class);
                    intent.putExtra("name","Imran Khan");
                   startActivity(intent);
                }
               else{
                   Toast.makeText(this,"Please Enter Correct Information",Toast.LENGTH_SHORT).show();
               }
            }
        });
    }
}