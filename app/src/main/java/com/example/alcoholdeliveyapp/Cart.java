package com.example.alcoholdeliveyapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Cart extends AppCompatActivity implements View.OnClickListener {

    //Defining view objects
    private Button payBtn;
    private TextView cnTxt;
    private TextView cvcTxt;
    private TextView dateTxt;
    private TextView etTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        payBtn = findViewById(R.id.payBtn);

        payBtn.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.payBtn:

                Toast.makeText(this,"Accepted. Your order is on the way.",Toast.LENGTH_LONG).show();
                return;
        }
    }
}
