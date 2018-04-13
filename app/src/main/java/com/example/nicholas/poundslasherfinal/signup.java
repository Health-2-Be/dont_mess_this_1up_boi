package com.example.nicholas.poundslasherfinal;

import android.graphics.drawable.AnimationDrawable;
import android.support.annotation.NonNull;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

import java.util.regex.Pattern;

public class signup extends AppCompatActivity{

    EditText editTexte,editTextp,editTextpa;
    ProgressBar progressBar2;
    private FirebaseAuth mAuth;
    private Button buttonjoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        editTexte =(EditText)findViewById(R.id.editTexte);
        editTextp =(EditText)findViewById(R.id.editTextp);
        editTextpa = (EditText)findViewById(R.id.editTextpa);
        progressBar2 =(ProgressBar)findViewById(R.id.progressBar2);
        mAuth = FirebaseAuth.getInstance();
        buttonjoin = (Button) findViewById(R.id.buttonjoin);
        buttonjoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editTexte.getText().toString().trim();
                String Password = editTextp.getText().toString().trim();
                if (email.isEmpty()) {
                    editTexte.setError("Email is required");
                    editTexte.requestFocus();
                    return;
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    editTexte.setError("Email is not Valid");
                    editTexte.requestFocus();
                    return;
                }
                if (email.isEmpty()) {
                    editTextp.setError("Password is required");
                    editTextp.requestFocus();
                    return;
                }
                if (Password.length() < 6) {
                    editTextp.setError("Please fill in a vaild password");
                    editTextp.requestFocus();
                    return;
                }
                progressBar2.setVisibility(View.VISIBLE);
                mAuth.createUserWithEmailAndPassword(email, Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressBar2.setVisibility(View.INVISIBLE);
                        if (task.isSuccessful()) {
                            Toast.makeText(getApplicationContext(), "User Registered", Toast.LENGTH_SHORT);
                        } else {

                            if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                                Toast.makeText(getApplicationContext(), "Registered", Toast.LENGTH_SHORT);
                            } else {
                                Toast.makeText(getApplicationContext(), "ERROR", Toast.LENGTH_SHORT);
                            }

                        }

                    }

                });
            }
        });
    }
    private void registerUser() {

    }

}
