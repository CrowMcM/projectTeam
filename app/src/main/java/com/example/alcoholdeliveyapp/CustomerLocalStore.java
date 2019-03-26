package com.example.alcoholdeliveyapp;

import android.content.SharedPreferences;
import android.content.Context;

public class CustomerLocalStore {

    public static final String SP_NAME = "CustomersDetails";
    SharedPreferences CustomersLocalDatabase;

    public CustomerLocalStore(Context context){
        CustomersLocalDatabase = context.getSharedPreferences(SP_NAME, 0);
    }

    public void storeCustomersData(Customers customer){
        SharedPreferences.Editor spEditor = CustomersLocalDatabase.edit();
        spEditor.putString("name", customer.name);
        spEditor.putInt("age", customer.age);
        spEditor.putString("userName", customer.username);
        spEditor.putString("password", customer.password);
        spEditor.commit();
    }

    public Customers getLoggedInCustomer(){
        String name = CustomersLocalDatabase.getString("name", "");
        int age = CustomersLocalDatabase.getInt("age", -1);
        String username = CustomersLocalDatabase.getString("username", "");
        String password = CustomersLocalDatabase.getString("password", "");

        Customers storedCustomers = new Customers(name, age, password, username);
        return storedCustomers;
    }

    public void setLoggedInCustomer(boolean loggedIn){
        SharedPreferences.Editor spEditor = CustomersLocalDatabase.edit();
        spEditor.putBoolean("loggedIn", loggedIn);
        spEditor.commit();
    }

    public void clearCustomersData(){
        SharedPreferences.Editor spEditor = CustomersLocalDatabase.edit();
        spEditor.clear();
        spEditor.commit();
    }

}
