package com.example.alcoholdeliveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText UserName;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter =3;
    TextView etRegister;


    CustomerLocalStore customerLocalStore;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserName = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Info = (TextView)findViewById(R.id.tvInfo);
        Login = (Button)findViewById(R.id.btnLogin);
        etRegister = (Button)findViewById(R.id.registerBtn);

        Info.setText("Chances left: 3");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(UserName.getText().toString(), Password.getText().toString());
            }
        });

        etRegister.setOnClickListener(this);
        customerLocalStore = new CustomerLocalStore(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLogin:

                Customers customer = new Customers(null, null);
                customerLocalStore.storeCustomersData(customer);
                customerLocalStore.setLoggedInCustomer(true);

                break;

            case R.id.registerBtn:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
        }
    }



    private void validate(String userName, String userPassword){
        if((userName.equals("AlexP")) && (userPassword.equals("AlexH"))){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        else{
            counter--;

            Info.setText("Chances left: "+ String.valueOf(counter));

            if(counter == 0){
                Login.setEnabled(false);
            }
        }
    }

}
