package com.example.alcoholdeliveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogout, viewBeverageBtn;
    EditText etName, etAge, etUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        btnLogout = (Button) findViewById(R.id.btnLogout);
        viewBeverageBtn = (Button) findViewById(R.id.viewBeveragesBtn);



        btnLogout.setOnClickListener(this);
        viewBeverageBtn.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLogout:

                startActivity(new Intent(this, MainActivity.class));


                break;

        }

        switch (v.getId()) {
            case R.id.viewBeveragesBtn:

                startActivity(new Intent(this, ProfileActivity.class));




                break;

        }
    }
}
