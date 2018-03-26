package com.example.nicholas.poundslasherfinal;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    private Button buttonsignup2;
    private Button btnlogin;
    private Button buttonfp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        buttonsignup2 = (Button) findViewById(R.id.buttonsignup2);
        buttonsignup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUp();
            }
        });
        btnlogin = (Button) findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAfterLogin();
            }
        });
        buttonfp = (Button) findViewById(R.id.buttonfp);
        buttonfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openForgetPass();
            }
        });

    }
    public void openSignUp(){
        Intent intent = new Intent(this,signup.class);
        startActivity(intent);
    }
    public void openAfterLogin(){
        Intent intent = new Intent(this,afterlogin.class);
        startActivity(intent);
    }
    public void openForgetPass(){
        Intent intent = new Intent(this,forgotpass.class);
        startActivity(intent);
    }
}
