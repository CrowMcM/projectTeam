package com.example.alcoholdeliveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inventory extends AppCompatActivity implements View.OnClickListener{

    private Button guin;
    private Button hein;
    private Button bulm;
    private Button des;
    private Button fost;
    private Button tig;
    private Button cap;
    private Button smirn;
    private Button smith;
    private Button basic;
    private Button cart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        guin = findViewById(R.id.guinAdd);
        hein = findViewById(R.id.heinAdd);
        bulm = findViewById(R.id.bulmAdd);
        des = findViewById(R.id.desperAdd);
        fost = findViewById(R.id.fosterAdd);
        tig = findViewById(R.id.tigerAdd);
        cap = findViewById(R.id.morganAdd);
        smirn = findViewById(R.id.SmirnAdd);
        smith = findViewById(R.id.SmithAdd);
        basic = findViewById(R.id.beerAdd);
        cart = findViewById(R.id.cartBtn);

        cart.setOnClickListener(this);
        guin.setOnClickListener(this);
        hein.setOnClickListener(this);
        bulm.setOnClickListener(this);
        des.setOnClickListener(this);
        fost.setOnClickListener(this);
        tig.setOnClickListener(this);
        cap.setOnClickListener(this);
        smirn.setOnClickListener(this);
        smith.setOnClickListener(this);
        basic.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        //open login activity when user taps on the already registered Button
        if (v == cart) startActivity(new Intent(this, Cart.class));
    }
    }

