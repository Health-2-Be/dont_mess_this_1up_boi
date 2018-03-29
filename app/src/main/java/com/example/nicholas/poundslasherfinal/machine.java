package com.example.nicholas.poundslasherfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class machine extends AppCompatActivity {

    private Button buttonupperb;
    private Button buttonlowerb;
    private Button buttonarm;
    private Button buttonleg;
    private Button buttonmback;
    private Button buttonmcore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine);
        buttonupperb = (Button) findViewById(R.id.buttonupperb);
        buttonupperb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMachineUpperBody();
            }
        });
        buttonlowerb = (Button) findViewById(R.id.buttonlowerb);
        buttonlowerb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLowerBody();
            }
        });
        buttonarm = (Button) findViewById(R.id.buttonarm);
        buttonarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openArm();
            }
        });
        buttonleg = (Button) findViewById(R.id.buttonleg);
        buttonleg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLeg();
            }
        });
        buttonmback = (Button) findViewById(R.id.buttonmback);
        buttonmback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMachineBack();
            }
        });
        buttonmcore = (Button) findViewById(R.id.buttonmcore);
        buttonmcore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMachineCore();
            }
        });
    }
    public void openMachineUpperBody(){
        Intent intent = new Intent(this,machineupperbody.class);
        startActivity(intent);
    }
    public void openLowerBody(){
        Intent intent = new Intent(this,machinelowerbody.class);
        startActivity(intent);
    }
    public void openArm(){
        Intent intent = new Intent(this,machinearms.class);
        startActivity(intent);
    }
    public void openLeg(){
        Intent intent = new Intent(this,machinelegs.class);
        startActivity(intent);
    }
    public void openMachineBack(){
        Intent intent = new Intent(this,machineback.class);
        startActivity(intent);
    }
    public void openMachineCore(){
        Intent intent = new Intent(this,machinecore.class);
        startActivity(intent);
    }
}
