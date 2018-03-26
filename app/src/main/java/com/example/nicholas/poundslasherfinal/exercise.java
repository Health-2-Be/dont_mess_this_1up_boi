package com.example.nicholas.poundslasherfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class exercise extends AppCompatActivity {

    private Button buttonstretches;
    private Button buttonspeed;
    private Button buttonstrength;
    private Button buttonflexibility;
    private Button buttonendurance;
    private Button buttonstamina;
    private Button buttoncoree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        buttonstretches = (Button) findViewById(R.id.buttonstretches);
        buttonstretches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openExercisesStretches();
            }
        });
        buttonspeed = (Button) findViewById(R.id.buttonspeed);
        buttonspeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openExercisesSpeed();
            }
        });
        buttonstrength = (Button) findViewById(R.id.buttonstrength);
        buttonstrength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openExercisesStrength();
            }
        });
        buttonflexibility = (Button) findViewById(R.id.buttonmflexibility);
        buttonflexibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openExercisesFlexibility();
            }
        });
        buttonendurance = (Button) findViewById(R.id.buttonendurance);
        buttonendurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openExercisesEndurance();
            }
        });
        buttonstamina = (Button) findViewById(R.id.buttonstamina);
        buttonstamina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openExercisesStamina();
            }
        });
        buttoncoree = (Button) findViewById(R.id.buttoncoree);
        buttoncoree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openExercisesCore();
            }
        });

    }
    public void openExercisesStretches(){
        Intent intent = new Intent(this,exercisestretches.class);
        startActivity(intent);
    }
    public void openExercisesSpeed(){
        Intent intent = new Intent(this,exercisespeed.class);
        startActivity(intent);
    }
    public void openExercisesStrength(){
        Intent intent = new Intent(this,exercisestrength.class);
        startActivity(intent);
    }
    public void openExercisesFlexibility(){
        Intent intent = new Intent(this,exerciseflexibility.class);
        startActivity(intent);
    }
    public void openExercisesEndurance(){
        Intent intent = new Intent(this,exerciseendurance.class);
        startActivity(intent);
    }
    public void openExercisesStamina(){
        Intent intent = new Intent(this,exercisestamina.class);
        startActivity(intent);
    }
    public void openExercisesCore(){
        Intent intent = new Intent(this,exercisecore.class);
        startActivity(intent);
    }
}
