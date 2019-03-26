package com.example.alcoholdeliveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogout;
    EditText etName, etAge, etUserName;
    CustomerLocalStore customerLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etName = (EditText) findViewById(R.id.etName);
        etAge = (EditText) findViewById(R.id.etAge);
        etUserName = (EditText) findViewById(R.id.etUserName);
        btnLogout = (Button) findViewById(R.id.btnLogout);


        btnLogout.setOnClickListener(this);

        customerLocalStore = new CustomerLocalStore(this);
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

                customerLocalStore.clearCustomersData();
                customerLocalStore.setLoggedInCustomer(false);


                break;

        }
    }
}
