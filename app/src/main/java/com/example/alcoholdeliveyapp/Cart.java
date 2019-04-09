package com.example.alcoholdeliveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cart extends AppCompatActivity implements View.OnClickListener {

    private Button payBtn;
    private TextView cnTxt;
    private TextView cvcTxt;
    private TextView dateTxt;
    private TextView etTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);



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
