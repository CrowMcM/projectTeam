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

        displayTv =findViewById(R.id.displayTv);


        String guin= getIntent().getStringExtra("GUIN_ID");
        displayTv.setText(guin);

        String heinekin= getIntent().getStringExtra("HEN_ID");
        displayTv.setText(heinekin);

        String desperados= getIntent().getStringExtra("DOS_ID");
        displayTv.setText(desperados);

        String foster= getIntent().getStringExtra("FOS_ID");
        displayTv.setText(foster);

        String captain= getIntent().getStringExtra("CAP_ID");
        displayTv.setText(captain);

        String smirnoff= getIntent().getStringExtra("SMI_ID");
        displayTv.setText(smirnoff);

        String basic= getIntent().getStringExtra("BAS_ID");
        displayTv.setText(basic);

        String wine= getIntent().getStringExtra("WIN_ID");
        displayTv.setText(wine);

        String whiskey= getIntent().getStringExtra("WHIS_ID");
        displayTv.setText(whiskey);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.payBtn:

                Toast.makeText(this,"Accepted. Your order is on th way.",Toast.LENGTH_LONG).show();
                return;
        }
    }
}
