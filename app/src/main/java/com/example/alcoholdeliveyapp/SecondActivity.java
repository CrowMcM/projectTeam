package com.example.alcoholdeliveyapp;

/*
       Social Media Icon Code Reference:
       https://stackoverflow.com/questions/3536165/how-can-imageview-link-to-web-page


      Completed by Nathan Hodgkiss
      Student Number: x17381176
*/

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogout, viewBeverageBtn, buttonUser;
    private TextView textViewUserEmail;
    EditText etName, etAge, etUserName;
    ImageView imgF, imgT;


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
        ImageView imgF = (ImageView)findViewById(R.id.imageView10);
        ImageView imgT = (ImageView)findViewById(R.id.imageView11);
        ImageView imgI = (ImageView)findViewById(R.id.imageView12);

        //Displays currently logged in user
        textViewUserEmail.setText("Welcome "+user.getEmail());

        btnLogout.setOnClickListener(this);
        viewBeverageBtn.setOnClickListener(this);
        buttonUser.setOnClickListener(this);


        //Facebook icon re-directs to facebook homepage.
        imgF.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://facebook.com"));
                startActivity(intent);
            }
        });

        //Twitter icon re-directs to twitter homepage.
        imgT.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://twitter.com"));
                startActivity(intent);
            }
        });

        //Instagram icon re-directs to instagram homepage
        imgI.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://instagram.com"));
                startActivity(intent);
            }
        });
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
