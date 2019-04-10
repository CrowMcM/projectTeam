package com.example.alcoholdeliveyapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.HashMap;
import java.util.Map;

public class UserActivity extends AppCompatActivity {

    private static final String NAME_KEY = "Name";
    private static final String EMAIL_KEY = "Email";
    private static final String PHONE_KEY = "Phone";
    FirebaseFirestore db;
    TextView textDisplay;
    TextView message;
    EditText name, email, phone;
    Button save;
    Button buttonGet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        db = FirebaseFirestore.getInstance();
        textDisplay = findViewById(R.id.textDisplay);
        message = findViewById(R.id.displayMessage);
        save    = findViewById(R.id.save);
        buttonGet = findViewById(R.id.buttonGet);

        buttonGet.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                ReadSingleContact();
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addNewContact();
            }
        });



    }

    private void addRealtimeUpdate() {
        DocumentReference contactListener = db.collection("PhoneBook").document("Contacts");
        contactListener.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(DocumentSnapshot documentSnapshot, FirebaseFirestoreException e) {
                if (e != null ){
                    Log.d("ERROR", e.getMessage());
                    return;
                }
                if (documentSnapshot != null && documentSnapshot.exists()){
                    message.setText(documentSnapshot.getData().toString());
                }
            }
        });
    }
    private void DeleteData() {

        db.collection("PhoneBook").document("Contacts")
                .delete().addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {

                Toast.makeText(UserActivity.this, "Data deleted !",
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
    private void UpdateData() {

        DocumentReference contact = db.collection("PhoneBook").document("Contacts");
        contact.update(NAME_KEY, "Kenny");
        contact.update(EMAIL_KEY, "kenny@gmail.com");
        contact.update(PHONE_KEY, "090-911-419")
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(UserActivity.this, "Updated Successfully",
                                Toast.LENGTH_SHORT).show();
                    }
                });

    }
    private void ReadSingleContact() {

        DocumentReference user = db.collection("PhoneBook").document("Contacts");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    StringBuilder fields = new StringBuilder("");
                    fields.append("Name: ").append(doc.get("Name"));
                    fields.append("\nEmail: ").append(doc.get("Email"));
                    fields.append("\nPhone: ").append(doc.get("Phone"));
                    message.setText(fields.toString());

                }
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });

    }
    private void addNewContact(){
        save    = findViewById(R.id.save);
        name    = findViewById(R.id.name);
        email   = findViewById(R.id.email);
        phone   = findViewById(R.id.phone);
        String mName = name.getText().toString();
        String mEmail = email.getText().toString();
        String mPhone = phone.getText().toString();
        Map<String, Object> newContact = new HashMap<>();
        newContact.put(NAME_KEY, mName);
        newContact.put(EMAIL_KEY, mEmail);
        newContact.put(PHONE_KEY, mPhone);
        db.collection("PhoneBook").document("Contacts").set(newContact)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(UserActivity.this, "User Registered",
                                Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(UserActivity.this, "ERROR" +e.toString(),
                                Toast.LENGTH_SHORT).show();
                        Log.d("TAG", e.toString());
                    }
                });
    }
}
