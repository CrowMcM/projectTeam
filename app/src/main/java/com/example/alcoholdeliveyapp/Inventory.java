package com.example.alcoholdeliveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inventory extends AppCompatActivity implements View.OnClickListener{

    private Button guin;
    private Button hein;
    private Button des;
    private Button fost;
    private Button cap;
    private Button smirn;
    private Button basic;
    private Button wine;
    private Button whisk;
    private Button cart;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        guin = findViewById(R.id.guinAdd);
        hein = findViewById(R.id.heinAdd);
        des = findViewById(R.id.desAdd);
        fost = findViewById(R.id.fostAdd);
        cap = findViewById(R.id.morganAdd);
        smirn = findViewById(R.id.SmirnAdd);
        basic = findViewById(R.id.basicAdd);
        wine = findViewById(R.id.wineAdd);
        whisk = findViewById(R.id.whiskeyAdd);
        cart = findViewById(R.id.cartBtn);

        cart.setOnClickListener(this);
        guin.setOnClickListener(this);
        hein.setOnClickListener(this);
        des.setOnClickListener(this);
        fost.setOnClickListener(this);
        cap.setOnClickListener(this);
        smirn.setOnClickListener(this);
        wine.setOnClickListener(this);
        whisk.setOnClickListener(this);
        basic.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        //open login activity when user taps on the already registered Button
        cart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Inventory.this, Cart.class));
            }
        });
    }
    }

