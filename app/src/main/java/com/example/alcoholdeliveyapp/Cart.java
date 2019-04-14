package com.example.alcoholdeliveyapp;

import android.content.Intent;
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
    private TextView eTotal;
    private TextView displayTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        payBtn = findViewById(R.id.payBtn);

        payBtn.setOnClickListener(this);

        displayTv = (TextView) findViewById(R.id.displayTv);
        eTotal = (TextView) findViewById(R.id.eTotal);


        Intent i = getIntent();
        int sum = i.getIntExtra("total", 0);
        eTotal.setText(String.valueOf(sum));

        int g = i.getIntExtra("GuinN", 0);
        displayTv.append ("Guinness " + String.valueOf(g) + "\n");

        int h = i.getIntExtra("HenN", 0);
        displayTv.append("Heineken " + String.valueOf(h) + "\n");

        int d = i.getIntExtra("DesN", 0);
        displayTv.append ("Desperado " + String.valueOf(d) + "\n");

        int f = i.getIntExtra("FosN", 0);
        displayTv.append("Fosters " + String.valueOf(f) + "\n");

        int c = i.getIntExtra("CapN", 0);
        displayTv.append ("Captain Morgan " + String.valueOf(c) + "\n");

        int s = i.getIntExtra("SmirnN", 0);
        displayTv.append("Smirnoff " + String.valueOf(s) + "\n");

        int b = i.getIntExtra("BasN", 0);
        displayTv.append("Beer " + String.valueOf(b) + "\n");

        int w = i.getIntExtra("WineN", 0);
        displayTv.append ("Wine " + String.valueOf(w) + "\n");

        int k = i.getIntExtra("WhiskN", 0);
        displayTv.append("Whiskey " + String.valueOf(k) + "\n");

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.payBtn:

                Toast.makeText(this, "Accepted. Your order is on the way.", Toast.LENGTH_LONG).show();
                return;
        }
    }
}
