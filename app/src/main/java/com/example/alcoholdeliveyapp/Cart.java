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
    private TextView etTotal;
    private TextView displayTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        payBtn = findViewById(R.id.payBtn);

        payBtn.setOnClickListener(this);

        displayTv = (TextView) findViewById(R.id.displayTv);


        Intent intent = getIntent();
        String guinTv = intent.getExtras().getString("GuinN");


    /*      int heinekin = getIntent().getIntExtra("HEN_ID", 0);
        displayTv.setText(heinekin);

      String d = getIntent().getStringExtra("DES_ID");
        displayTv.append(d);

        String f = getIntent().getStringExtra("FOS_ID");
        displayTv.append(f);

        String c = getIntent().getStringExtra("CAP_ID");
        displayTv.append(c);

        String s = getIntent().getStringExtra("SMI_ID");
        displayTv.append("" + s);

        String w = getIntent().getStringExtra("WIN_ID");
        displayTv.append(w);

        String k = getIntent().getStringExtra("WHIS_ID");
        displayTv.append(k);

        String b = getIntent().getStringExtra("BAS_ID");
        displayTv.append(b);
*/
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
