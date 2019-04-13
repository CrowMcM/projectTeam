package com.example.alcoholdeliveyapp;

/*
          Based of tutorial from here:
          https://android.jlelse.eu/build-a-phonebook-with-cloud-firestore-in-10-minutes-59c65e7af4ad


         Completed by Nathan Hodgkiss
         Student Number: x17381176

*/

public class AddressBook {


    public void AddressBook() {

    }

    String name, email, phone;

    public AddressBook(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}