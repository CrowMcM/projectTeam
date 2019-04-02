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

        guin = (Button)findViewById(R.id.guinAdd);
        hein = (Button)findViewById(R.id.heinAdd);
        bulm = (Button)findViewById(R.id.bulmAdd);
        des = (Button)findViewById(R.id.desperAdd);
        fost = (Button)findViewById(R.id.fosterAdd);
        tig = (Button)findViewById(R.id.tigerAdd);
        cap = (Button)findViewById(R.id.morganAdd);
        smirn = (Button)findViewById(R.id.SmirnAdd);
        smith = (Button)findViewById(R.id.SmithAdd);
        basic = (Button)findViewById(R.id.beerAdd);
        cart = (Button)findViewById(R.id.cartBtn);

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
        if(v == cart){
            //open login activity when user taps on the already registered textview
            startActivity(new Intent(this, Cart.class));
        }
        }
    }

