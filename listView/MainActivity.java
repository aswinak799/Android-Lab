package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        String subs[]
                = { "PYTHON", "Data Structures",
                "C#", "JAVA",
                "DART", "KOTLIN"};
        ArrayAdapter<String> arr;
        arr =  new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,subs);
        listView.setAdapter(arr);
    }
}