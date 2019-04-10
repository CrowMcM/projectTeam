package com.example.alcoholdeliveyapp;

/*    Completed by Nathan Hodgkiss
      Student Number: x17381176
*/

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogout, viewBeverageBtn, buttonUser;
    private TextView textViewUserEmail;
    EditText etName, etAge, etUserName;


    //firebase auth object
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //initializing firebase authentication object
        firebaseAuth = FirebaseAuth.getInstance();

        //if the user is not logged in
        //that means current user will return null
        if(firebaseAuth.getCurrentUser() == null){
            //closing this activity
            finish();
            //starting login activity
            startActivity(new Intent(this, LoginActivity.class));
        }


        //getting current user
        FirebaseUser user = firebaseAuth.getCurrentUser();


        //Initialising views
        textViewUserEmail = (TextView) findViewById(R.id.textViewUserEmail);
        btnLogout = (Button) findViewById(R.id.btnLogout);
        viewBeverageBtn = (Button) findViewById(R.id.viewBeveragesBtn);
        buttonUser = (Button) findViewById(R.id.buttonUser);

        //Displays currently logged in user
        textViewUserEmail.setText("Welcome "+user.getEmail());

        btnLogout.setOnClickListener(this);
        viewBeverageBtn.setOnClickListener(this);
        buttonUser.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();


    }



    @Override
    public void onClick(View v) {
            //if logout is pressed
            if(v == btnLogout){
                //logging out the user
                firebaseAuth.signOut();
                //closing activity
                finish();
                //starting login activity
                startActivity(new Intent(this, LoginActivity.class));
            }


        switch (v.getId()) {
            case R.id.buttonUser:

                startActivity(new Intent(this, UserActivity.class));




                break;

        }

        switch (v.getId()) {
            case R.id.viewBeveragesBtn:

                startActivity(new Intent(this, ProfileActivity.class));




                break;

        }
    }
}
