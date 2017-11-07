package com.example.shuva.kcms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import android.widget.RadioButton;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onClickLoginCheck(View view){
        Intent loginInntent=new Intent(this,loginFunction.class);
        startActivity(loginInntent);
        Toast.makeText(getApplicationContext(), "Please make sure that you are already Registered",
                Toast.LENGTH_SHORT).show();
    }
    public void onClickRegisterCheck(View view){
        RadioButton rdbGuardian=(RadioButton)findViewById(R.id.rdbGuardian);
        RadioButton rdbFaculty=(RadioButton)findViewById(R.id.rdbFaculty);
        if(rdbGuardian.isChecked()==true)
        {
            Intent RegisterGuardian = new Intent(this,RegisterGuardian.class);
            startActivity(RegisterGuardian);
        }
        else if(rdbFaculty.isChecked()==true)
        {
            Intent RegisterFaculty = new Intent(this,RegisterFaculty.class);
            startActivity(RegisterFaculty);
        }
        else if(rdbFaculty.isChecked()==false && rdbGuardian.isChecked()==false)
        {
            Toast.makeText(getApplicationContext(), "Please choose your option before proceed",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
