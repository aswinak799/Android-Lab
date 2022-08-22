package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText UserName,Passwd;
    Button B1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserName=findViewById(R.id.ET1);
        Passwd=findViewById(R.id.ET2);
        B1=findViewById(R.id.BT1);
        B1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String u=UserName.getText().toString();
                String p=Passwd.getText().toString();
                if(u.equals("Aswinak799") && p.equals("Aswin@123")){
                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}