package com.example.nicholas.poundslasherfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dietary extends AppCompatActivity {

    private Button buttonbreakfast;
    private Button buttonsnacks;
    private Button buttonlunch;
    private Button buttondinner;
    private Button buttonquickmeal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietary);

        buttonbreakfast = (Button) findViewById(R.id.buttonbreakfast);
        buttonbreakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDietaryBreakfast();
            }
        });
        buttonsnacks = (Button) findViewById(R.id.buttonsnacks);
        buttonsnacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDietarySnacks();
            }
        });
        buttonlunch = (Button) findViewById(R.id.buttonlunch);
        buttonlunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDietaryLunch();
            }
        });
        buttondinner = (Button) findViewById(R.id.buttondinner);
        buttondinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDietaryDinner();
            }
        });
        buttonquickmeal = (Button) findViewById(R.id.buttonquickmeal);
        buttonquickmeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDietaryQuickMeal();
            }
        });
    }
    public void openDietaryBreakfast(){
        Intent intent = new Intent(this,dietarybreakfast.class);
        startActivity(intent);
    }
    public void openDietarySnacks(){
        Intent intent = new Intent(this,dietarysnacks.class);
        startActivity(intent);
    }
    public void openDietaryLunch(){
        Intent intent = new Intent(this,dietarylunch.class);
        startActivity(intent);
    }
    public void openDietaryDinner(){
        Intent intent = new Intent(this,dietarydinner.class);
        startActivity(intent);
    }
    public void openDietaryQuickMeal(){
        Intent intent = new Intent(this,dietaryquickmeal.class);
        startActivity(intent);
    }
}
