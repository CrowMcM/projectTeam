package com.example.alcoholdeliveyapp;

/*
    Based of tutorial from here:
    https://www.youtube.com/watch?v=t8vUdt1eEzE

    Completed by Nathan Hodgkiss
    Student Number: x17381176
*/

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPasswordActivity extends AppCompatActivity {

    Toolbar toolbar;
    ProgressBar progressBar;
    EditText userEmail;
    Button userPass;

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);


        //Initiating views
        toolbar = findViewById(R.id.toolbar);
        progressBar = findViewById(R.id.progressBar);
        userEmail = findViewById(R.id.etUserEmail);
        userPass = findViewById(R.id.btnForgotPass);

        toolbar.setTitle("Forgot password");


        //Initializing firebase auth object
        firebaseAuth = firebaseAuth.getInstance();

        userPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.sendPasswordResetEmail(userEmail.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful()){
                                    Toast.makeText(ForgotPasswordActivity.this, "Password sent to your email", Toast.LENGTH_LONG).show();
                                }else{
                                    Toast.makeText(ForgotPasswordActivity.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                                }
                            }
                        });
            }
        });
    }
}
