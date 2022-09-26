package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText FName,LName;
    RadioButton Male,Female;
    RadioGroup radGrp;
    Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDataAndNavigate();



            }
        });
    }

    public void initUI(){
        FName= findViewById(R.id.Fname);
        LName= findViewById(R.id.Lname);
        Male= findViewById(R.id.Male);
        Female= findViewById(R.id.Fmale);
        Register= findViewById(R.id.Submit);
        radGrp= findViewById(R.id.RadioGrp);
    }
    public void setDataAndNavigate(){
        String radioValue="";
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", Context.MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putString("FName", FName.getText().toString());
        myEdit.putString("LName", LName.getText().toString());

        switch(radGrp.getCheckedRadioButtonId()){
            case R.id.Male:radioValue="Male";
                break;
            case R.id.Fmale:radioValue="Female";
                break;
        }
        myEdit.putString("Gender", radioValue);
        myEdit.apply();

        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }

}
