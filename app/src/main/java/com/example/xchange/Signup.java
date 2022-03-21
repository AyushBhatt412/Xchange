package com.example.xchange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        EditText name,phone,email,password,location;
        Button b1;

        name=findViewById(R.id.name);
        phone=findViewById(R.id.phone);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        location=findViewById(R.id.location);
        b1=findViewById(R.id.button3);

        String name1=name.getText().toString();
        String phone1=phone.getText().toString();
        String email1=email.getText().toString();
        String password1=password.getText().toString();
        String location1=location.getText().toString();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //SEnd the data to firebase and then, call main activity.
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivity(intent);

            }
        });
    }
}