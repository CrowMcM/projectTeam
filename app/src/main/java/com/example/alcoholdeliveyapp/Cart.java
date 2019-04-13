package com.example.alcoholdeliveyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Cart extends AppCompatActivity implements View.OnClickListener {


    private Button payBtn;
    private TextView cnTxt;
    private TextView cvcTxt;
    private TextView dateTxt;
    private TextView etTotal;
    private TextView displayTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        payBtn = findViewById(R.id.payBtn);

        payBtn.setOnClickListener(this);

        displayTv = (TextView) findViewById(R.id.displayTv);


        String g = getIntent().getStringExtra("GuinN");
        displayTv.setText("guiness " +g+"\n");

        String h = getIntent().getStringExtra("HenN");
        displayTv.append("heinekin " +h+"\n");

        String d = getIntent().getStringExtra("DesN");
        displayTv.append("Desperados " +d+"\n");

        String f = getIntent().getStringExtra("FosN");
        displayTv.append("Fosters " +f+"\n");

        String c = getIntent().getStringExtra("CapN");
        displayTv.append("Captain Morgan's " +c+"\n");

        String s = getIntent().getStringExtra("SmirnN");
        displayTv.append("Smirnoff " +s+"\n");

        String b = getIntent().getStringExtra("BasN");
        displayTv.append("Beer " +b+"\n");

        String w = getIntent().getStringExtra("WineN");
        displayTv.append("Wine " +w+"\n");

        String k = getIntent().getStringExtra("WhiskN");
        displayTv.append("Whiskey " +k+"\n");

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.payBtn:

                Toast.makeText(this, "Accepted. Your order is on th way.", Toast.LENGTH_LONG).show();
                return;
        }
    }
}
