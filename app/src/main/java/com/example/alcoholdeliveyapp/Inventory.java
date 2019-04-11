package com.example.alcoholdeliveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Inventory extends AppCompatActivity implements View.OnClickListener {


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

    private TextView guinn;
    private TextView hen;
    private TextView desper;
    private TextView foster;
    private TextView captain;
    private TextView smir;
    private TextView whis;
    private TextView win;
    private TextView bas;

    private ArrayList guiness;
    private ArrayList heinekin;
    private ArrayList desperados;
    private ArrayList fosters;
    private ArrayList captainMorgan;
    private ArrayList smirnoff;
    private ArrayList whiskey;
    private ArrayList wines;
    private ArrayList beer;


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


        guiness = new ArrayList <Integer>(0);
        heinekin = new ArrayList <Integer>(0);
        desperados = new ArrayList <Integer>(0);
        fosters = new ArrayList <Integer>(0);
        captainMorgan = new ArrayList <Integer>(0);
        smirnoff = new ArrayList <Integer>(0);
        whiskey = new ArrayList <Integer>(0);
        wines = new ArrayList <Integer>(0);
        beer = new ArrayList <Integer>(0);


        cart.setOnClickListener(this);


        guin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                guiness.add(+1);
                int g = (int) guiness.get();

                Intent intent = new Intent(getBaseContext(), Cart.class);
                intent.putExtra("GUIN_ID", g);

            }
        });

        hein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String h = (String) hen.getText();

                Intent intent = new Intent(getBaseContext(), Cart.class);
                intent.putExtra("HEN_ID", h);
                startActivity(intent);

            }
        });

        des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String d = (String) desper.getText();

                Intent intent = new Intent(getBaseContext(), Cart.class);
                intent.putExtra("DES_ID", d);
                startActivity(intent);

            }
        });

        fost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = (String) foster.getText();

                Intent intent = new Intent(getBaseContext(), Cart.class);
                intent.putExtra("FOS_ID", f);
                startActivity(intent);

            }
        });

        cap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = (String) captain.getText();

                Intent intent = new Intent(getBaseContext(), Cart.class);
                intent.putExtra("CAP_ID", c);
                startActivity(intent);

            }
        });

        smirn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = (String) smir.getText();

                Intent intent = new Intent(getBaseContext(), Cart.class);
                intent.putExtra("SMI_ID", s);
                startActivity(intent);

            }
        });

        wine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String w = (String) win.getText();

                Intent intent = new Intent(getBaseContext(), Cart.class);
                intent.putExtra("WIN_ID", w);
                startActivity(intent);

            }
        });

        whisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String k = (String) whis.getText();

                Intent intent = new Intent(getBaseContext(), Cart.class);
                intent.putExtra("WHIS_ID", k);
                startActivity(intent);

            }
        });

        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = (String) bas.getText();

                Intent intent = new Intent(getBaseContext(), Cart.class);
                intent.putExtra("BAS_ID", b);
                startActivity(intent);

            }
        });


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

