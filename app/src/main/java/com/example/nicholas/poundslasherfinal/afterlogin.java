package com.example.nicholas.poundslasherfinal;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class afterlogin extends AppCompatActivity {

    private Button buttonm;
    private Button buttonex;
    private Button buttond;
    private Button buttonsr;
    private Button buttonset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterlogin);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        buttonm = (Button) findViewById(R.id.buttonm);
        buttonm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMachine();
            }
        });
        buttonex = (Button) findViewById(R.id.buttonex);
        buttonex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openExercise();
            }
        });
        buttond = (Button) findViewById(R.id.buttond);
        buttond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDietary();
            }
        });
        buttonsr = (Button) findViewById(R.id.buttonsr);
        buttonsr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStatusReport();
            }
        });
        buttonset = (Button) findViewById(R.id.buttonset);
        buttonset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettings();
            }
        });
    }
    public void openMachine(){
        Intent intent = new Intent(this,machine.class);
        startActivity(intent);
    }
    public void openExercise(){
        Intent intent = new Intent(this,exercise.class);
        startActivity(intent);
    }
    public void openDietary(){
        Intent intent = new Intent(this,dietary.class);
        startActivity(intent);
    }
    public void openStatusReport(){
        Intent intent = new Intent(this,statusreport.class);
        startActivity(intent);
    }
    public void openSettings(){
        Intent intent = new Intent(this,settingpage.class);
        startActivity(intent);
    }
}
