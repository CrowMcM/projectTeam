package com.example.alcoholdeliveyapp;

public class Customers {
    String name, username, password;
    int age;

    public Customers (String name, int age, String username, String password){
        this.name = name;
        this.age = age;
        this.password = password;
        this.username = username;
    }

    public Customers (String username, String password){
        this.username = username;
        this.password = password;
        this.age = 1;
        this.name ="";
    }
}
