package com.example.alcoholdeliveyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inventory extends AppCompatActivity {

    private Button guin;
    private Button hein;
    private Button bulm;
    private Button des;
    private Button fost;
    private Button tig;
    private Button cap;
    private Button smirn;
    private Button smith;
    private Button basic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        guin = (Button)findViewById(R.id.guinAdd);
        hein = (Button)findViewById(R.id.heinAdd);
        bulm = (Button)findViewById(R.id.bulmAdd);
        des = (Button)findViewById(R.id.desperAdd);
        fost = (Button)findViewById(R.id.fosterAdd);
        tig = (Button)findViewById(R.id.tigerAdd);
        cap = (Button)findViewById(R.id.morganAdd);
        smirn = (Button)findViewById(R.id.SmirnAdd);
        smith = (Button)findViewById(R.id.SmithAdd);
        basic = (Button)findViewById(R.id.beerAdd);

    }
}
