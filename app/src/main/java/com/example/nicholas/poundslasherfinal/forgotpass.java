package com.example.nicholas.poundslasherfinal;

import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class forgotpass extends AppCompatActivity {

    ConstraintLayout myLayoutforgotpass;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpass);

        myLayoutforgotpass = (ConstraintLayout) findViewById(R.id.myLayoutforgotpass);
        animationDrawable = (AnimationDrawable) myLayoutforgotpass.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(2500);
        animationDrawable.start();

    }
}
