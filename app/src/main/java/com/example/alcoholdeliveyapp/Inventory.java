package com.example.alcoholdeliveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


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


        cart.setOnClickListener(this);




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

/*                String input10 = guinT.getText().toString();
                String input11 = heinT.getText().toString();
                String input12 = desT.getText().toString();
                String input13 = fosT.getText().toString();
                String input14 = capT.getText().toString();
                String input15 = smirnT.getText().toString();
                String input16 = basT.getText().toString();
                String input17 = wineT.getText().toString();
                String input18 = whisT.getText().toString();
*/

                Intent i = new Intent (getApplicationContext(), Cart.class);

                i.putExtra("GuinN", (CharSequence) guinTv );
                i.putExtra("HenN", (CharSequence) heinTv );
                i.putExtra("DesN", (CharSequence) desTv );
                i.putExtra("FosN", (CharSequence) fosTv );
                i.putExtra("CapN", (CharSequence) capTv );
                i.putExtra("SmirnN", (CharSequence) smirnTv );
                i.putExtra("BasN", (CharSequence) basTv );
                i.putExtra("WineN", (CharSequence) wineTv );
                i.putExtra("WhiskN", (CharSequence) whisTv );

                /*
                i.putExtra("GuinNa", (CharSequence) guinT );
                i.putExtra("HenNa", (CharSequence) heinT );
                i.putExtra("DesNa", (CharSequence) desT );
                i.putExtra("FosNa", (CharSequence) fosT );
                i.putExtra("CapNa", (CharSequence) capT );
                i.putExtra("SmirnNa", (CharSequence) smirnT );
                i.putExtra("BasNa", (CharSequence) basT );
                i.putExtra("WineNa", (CharSequence) wineT );
                i.putExtra("WhiskNa", (CharSequence) whisT );
                startActivity(i);
*/

            }
        });
    }
}

