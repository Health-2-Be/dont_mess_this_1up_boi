package com.example.nicholas.poundslasherfinal;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Startpage extends AppCompatActivity {

    ConstraintLayout myLayoutstart;
    AnimationDrawable animationDrawable;

    private Button buttonssu;
    private Button buttonsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startpage);

        myLayoutstart = (ConstraintLayout) findViewById(R.id.myLayoutstart);
        animationDrawable = (AnimationDrawable) myLayoutstart.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(2500);
        animationDrawable.start();

        buttonssu = (Button) findViewById(R.id.buttonssu);
        buttonssu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUp();
            }
        });
        buttonsl = (Button) findViewById(R.id.buttonsl);
        buttonsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogin();
            }
        });
    }
    public void openSignUp(){
        Intent intent = new Intent(this,signup.class);
        startActivity(intent);
    }
    public void openLogin(){
        Intent intent = new Intent(this,login.class);
        startActivity(intent);
    }
}
