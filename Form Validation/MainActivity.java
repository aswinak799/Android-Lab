package com.example.formvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Fname,Lname,passwd;
    RadioButton Male,Fmale;
    Button Submit;
    Switch NewMembr;
    CheckBox Agree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UiInit();

    }

    public void UiInit(){
        Fname=findViewById(R.id.Fname);
        Lname=findViewById(R.id.Lname);
        passwd=findViewById(R.id.Passwd);
        Male=findViewById(R.id.Male);
        Fmale=findViewById(R.id.Female);
        Submit=findViewById(R.id.SubmitButton);
        NewMembr=findViewById(R.id.NewMbr);
        Agree=findViewById(R.id.Agree);


    }
    public Boolean validate(){
        Boolean status=false;
        String Fn=Fname.getText().toString();
        String Ln=Lname.getText().toString();
        String Password=passwd.getText().toString();
        if(Fn.equals("")){
            Toast.makeText(this, "Enter FirstName", Toast.LENGTH_SHORT).show();
        }
        else if (Ln.equals("")){
            Toast.makeText(this, "Enter LastName", Toast.LENGTH_SHORT).show();
        }else if (Password.length()<3){
            Toast.makeText(this, "Enter Valid Password", Toast.LENGTH_SHORT).show();

        }else if (!Male.isChecked() && !Fmale.isChecked()){
            Toast.makeText(this, "Please select Gender", Toast.LENGTH_SHORT).show();
        }else if(!NewMembr.isChecked()){
            Toast.makeText(this, "Plese On the Switch", Toast.LENGTH_SHORT).show();
        }else if(!Agree.isChecked()){
            Toast.makeText(this, "Accept the Terms & Conditions", Toast.LENGTH_SHORT).show();
        }else
        {
            return status=true;
        }
     return status;
    }

    public void OnclickSbmit(View view) {

        if(validate()){
            Toast.makeText(this, "Successful Registrartion", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Registration Faild", Toast.LENGTH_SHORT).show();
        }
    }
}