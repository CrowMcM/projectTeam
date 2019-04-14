package com.example.alcoholdeliveyapp;

import android.app.Notification;
import android.content.Intent;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;
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
    private Button guinMin;
    private Button heinMin;
    private Button desMin;
    private Button fostMin;
    private Button capMin;
    private Button smirnMin;
    private Button basicMin;
    private Button wineMin;
    private Button whiskMin;
    private Button eTotal;

    private Button cart;

    private TextView guinTv;
    private TextView heinTv;
    private TextView desTv;
    private TextView fosTv;
    private TextView capTv;
    private TextView smirnTv;
    private TextView basTv;
    private TextView wineTv;
    private TextView whisTv;
    private TextView sumTv;

    private TextView guinT;
    private TextView heinT;
    private TextView desT;
    private TextView fosT;
    private TextView capT;
    private TextView smirnT;
    private TextView basT;
    private TextView wineT;
    private TextView whisT;

    int g_qty = 0;
    int h_qty = 0;
    int d_qty = 0;
    int f_qty = 0;
    int c_qty = 0;
    int s_qty = 0;
    int b_qty = 0;
    int w_qty = 0;
    int k_qty = 0;

    /*
    int guinTotal = 0;
    int heinTotal = 0;
    int desTotal = 0;
    int fostTotal = 0;
    int morganTotal = 0;
    int smirnTotal = 0;
    int beerTotal = 0;
    int wineTotal = 0;
    int whiskeyTotal = 0;
     */

    int guinTotal = 5;
    int heinTotal = 6;
    int desTotal = 6;
    int fostTotal = 4;
    int morganTotal = 20;
    int smirnTotal = 22;
    int beerTotal = 4;
    int wineTotal = 12;
    int whiskeyTotal = 30;

    private int sum;

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

        guinMin = findViewById(R.id.guinMinus);
        heinMin = findViewById(R.id.heinMinus);
        desMin = findViewById(R.id.desMinus);
        fostMin = findViewById(R.id.fostMinus);
        capMin = findViewById(R.id.morganMinus);
        smirnMin = findViewById(R.id.smirnMinus);
        basicMin = findViewById(R.id.basicMinus);
        wineMin = findViewById(R.id.wineMinus);
        whiskMin = findViewById(R.id.whiskeyMinus);
        eTotal = findViewById(R.id.etTotal);

        cart = findViewById(R.id.cartBtn);

        guinTv = (TextView) findViewById( R.id.guinTv );
        heinTv = (TextView) findViewById( R.id.heinTv );
        desTv = (TextView) findViewById( R.id.desTv );
        fosTv = (TextView) findViewById( R.id.fosTv );
        capTv = (TextView) findViewById( R.id.capTv );
        smirnTv = (TextView) findViewById( R.id.smirnTv );
        basTv = (TextView) findViewById( R.id.basTv );
        wineTv = (TextView) findViewById( R.id.wineTv );
        whisTv = (TextView) findViewById( R.id.whisTv );
        sumTv = (TextView) findViewById( R.id.sumTv );



        cart.setOnClickListener(this);



        eTotal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sum = (guinTotal * g_qty)+(heinTotal * h_qty)+(fostTotal * f_qty)+(desTotal * d_qty)+(morganTotal * c_qty)+(smirnTotal * s_qty)+(beerTotal * b_qty)+(wineTotal * w_qty)+(whiskeyTotal * k_qty);


                String sum_txt =Integer.toString( sum );
                sumTv.setText(sum_txt );


            }
            /*public void onClick(View v) {
                Intent intent = new Intent(this, Cart.class);
                intent.putExtra("cart.KEY_EXTRA, int);
                startActivity(intent);
            }*/
        });



        //sum = (TextView)findViewById(R.id.sum);

        guin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                g_qty++;

                String g_qty_txt =Integer.toString( g_qty );
                guinTv.setText(g_qty_txt );

            }
        });

        guinMin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                g_qty--;

                String g_qty_txt =Integer.toString( g_qty );
                guinTv.setText(g_qty_txt );

            }
        });

        hein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                h_qty++;

                String h_qty_txt =Integer.toString( h_qty );
                heinTv.setText(h_qty_txt );

            }
        });

        heinMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                h_qty--;

                String h_qty_txt =Integer.toString( h_qty );
                heinTv.setText(h_qty_txt );

            }
        });

        des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                d_qty++;

                String d_qty_txt =Integer.toString( d_qty );
                desTv.setText(d_qty_txt );

            }
        });

        desMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                d_qty--;

                String d_qty_txt =Integer.toString( d_qty );
                desTv.setText(d_qty_txt );

            }
        });

        fost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                f_qty++;

                String f_qty_txt =Integer.toString( f_qty );
                fosTv.setText(f_qty_txt );

            }
        });

        fostMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                f_qty--;

                String f_qty_txt =Integer.toString( f_qty );
                fosTv.setText(f_qty_txt );

            }
        });

        cap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c_qty++;

                String c_qty_txt =Integer.toString( c_qty );
                capTv.setText(c_qty_txt );

            }
        });

        capMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c_qty--;

                String c_qty_txt =Integer.toString( c_qty );
                capTv.setText(c_qty_txt );

            }
        });

        smirn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s_qty++;

                String s_qty_txt =Integer.toString( s_qty );
                smirnTv.setText(s_qty_txt );

            }
        });

        smirnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s_qty--;

                String s_qty_txt =Integer.toString( s_qty );
                smirnTv.setText(s_qty_txt );

            }
        });

        wine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                w_qty++;

                String w_qty_txt =Integer.toString( w_qty );
                wineTv.setText(w_qty_txt );

            }
        });

        wineMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                w_qty--;

                String w_qty_txt =Integer.toString( w_qty );
                wineTv.setText(w_qty_txt );

            }
        });

        whisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                k_qty++;

                String k_qty_txt =Integer.toString( k_qty );
                whisTv.setText(k_qty_txt );

            }
        });

        whiskMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                k_qty--;

                String k_qty_txt =Integer.toString( k_qty );
                whisTv.setText(k_qty_txt );

            }
        });

        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b_qty++;

                String b_qty_txt =Integer.toString( b_qty );
                basTv.setText(b_qty_txt );

            }
        });

        basicMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b_qty--;

                String b_qty_txt =Integer.toString( b_qty );
                basTv.setText(b_qty_txt );

            }
        });


        /*final Button Total = (Button) findViewById(R.id.button);
        Total.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Total.setText(String.valueOf(Double.valueOf(String.valueOf(guinTotal))*Double.valueOf(String.valueOf(guinTv.getText()))));
            }
        });*/

    }

    @Override
    public void onClick(View v) {
        //open login activity when user taps on the already registered Button
        cart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String input1 = guinTv.getText().toString();
                String input2 = heinTv.getText().toString();
                String input3 = desTv.getText().toString();
                String input4 = fosTv.getText().toString();
                String input5 = capTv.getText().toString();
                String input6 = smirnTv.getText().toString();
                String input7 = basTv.getText().toString();
                String input8 = wineTv.getText().toString();
                String input9 = whisTv.getText().toString();


                Intent i = new Intent (getApplicationContext(), Cart.class);

                i.putExtra("GuinN", g_qty);
                i.putExtra("HenN", h_qty);
                i.putExtra("DesN", d_qty);
                i.putExtra("FosN", f_qty);
                i.putExtra("CapN", c_qty);
                i.putExtra("SmirnN", s_qty);
                i.putExtra("BasN", b_qty);
                i.putExtra("WineN", w_qty);
                i.putExtra("WhiskN", k_qty);
                i.putExtra("total", sum);

                startActivity(i);

            }
        });
    }
}