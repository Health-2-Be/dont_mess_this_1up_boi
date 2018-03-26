package com.example.nicholas.poundslasherfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class statusreport extends AppCompatActivity {

    private Button buttonbmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statusreport);
        buttonbmi = (Button) findViewById(R.id.buttonbmi);
        buttonbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBMICalc();
            }
        });
    }
    public void openBMICalc(){
        Intent intent = new Intent(this,bmicalc.class);
        startActivity(intent);
    }
}
