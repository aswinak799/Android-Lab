package com.example.exception;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String [] name = {"ANROID","WINDOWS","IOS","MAC","LINUX","UBUNTU"};
    String[] index = {"0","1","2","3","4","5","6","7",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);
        ArrayAdapter<String> arr = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,index);
        list.setAdapter(arr);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                try {
                    Toast.makeText(MainActivity.this, name[(i)], Toast.LENGTH_SHORT).show();
                }catch (ArrayIndexOutOfBoundsException e){
                    Toast.makeText(MainActivity.this, "Array out ofBound \n minimum index5 \n"+e.getMessage(), Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}