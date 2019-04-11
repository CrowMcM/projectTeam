package com.example.alcoholdeliveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

            guinn =(TextView) findViewById(R.id.guinTv);
            hen =(TextView) findViewById(R.id.heinTv);
            desper =(TextView) findViewById(R.id.desTv);
            foster =(TextView) findViewById(R.id.fosTv);
            captain =(TextView) findViewById(R.id.capTv);
            smir =(TextView) findViewById(R.id.smirnTv);
            whis =(TextView) findViewById(R.id.whisTv);
            win =(TextView) findViewById(R.id.wineTv);
            bas =(TextView) findViewById(R.id.basTv);

            cart.setOnClickListener(this);

            guin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String g = (String) guinn.getText();

                    Intent intent=new Intent(getBaseContext(),Cart.class);
                    intent.putExtra("GUIN_ID", g);
                    startActivity(intent);

                }
            });

            hein.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    String h = (String) hen.getText();

                    Intent intent=new Intent(getBaseContext(),Cart.class);
                    intent.putExtra("HEN_ID", h);
                    startActivity(intent);

                }
            });

            des.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    String d = (String) desper.getText();

                    Intent intent=new Intent(getBaseContext(),Cart.class);
                    intent.putExtra("DES_ID", d);
                    startActivity(intent);

                }
            });

            fost.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    String f = (String) foster.getText();

                    Intent intent=new Intent(getBaseContext(),Cart.class);
                    intent.putExtra("FOS_ID", f);
                    startActivity(intent);

                }
            });

            cap.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    String c = (String) captain.getText();

                    Intent intent=new Intent(getBaseContext(),Cart.class);
                    intent.putExtra("CAP_ID", c);
                    startActivity(intent);

                }
            });

            smirn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    String s = (String) smir.getText();

                    Intent intent=new Intent(getBaseContext(),Cart.class);
                    intent.putExtra("SMI_ID", s);
                    startActivity(intent);

                }
            });

            wine.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    String w = (String) win.getText();

                    Intent intent=new Intent(getBaseContext(),Cart.class);
                    intent.putExtra("WIN_ID", w);
                    startActivity(intent);

                }
            });

            whisk.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    String k = (String) whis.getText();

                    Intent intent=new Intent(getBaseContext(),Cart.class);
                    intent.putExtra("WHIS_ID", k);
                    startActivity(intent);

                }
            });

            basic.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    String b = (String) bas.getText();
                    Toast.makeText(getApplicationContext(),b,Toast.LENGTH_LONG).show();

                    Intent intent=new Intent(getBaseContext(),Cart.class);
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

