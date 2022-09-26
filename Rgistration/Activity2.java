package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView T;
    Button dataButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        T= findViewById(R.id.TV);
        dataButton= findViewById(R.id.GetData);
        dataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", Context.MODE_PRIVATE);
                T.setText("FName: "+sharedPreferences.getString("FName","")+"\nLName: "+sharedPreferences.getString("LName","")+"\nGender: "+sharedPreferences.getString("Gender",""));
            }
        });
    }
}