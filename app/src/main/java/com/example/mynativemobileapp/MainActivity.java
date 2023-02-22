package com.example.mynativemobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Spinner to handel search bar
        Spinner spinner = findViewById(R.id.locationSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.city_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        //Functionality: Post Your Business Button Onclick navigate to Post Your Business Screen
        Button myButton = findViewById(R.id.button5);
        myButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PostYourBusiness.class);
            startActivity(intent);
        });
        //Set1: Salon Image Button and Button
        //Functionality: Salon Image Button Onclick navigate to Service Page Screen
            ImageButton imageButton = findViewById(R.id.imageButton8);
            imageButton.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, OrderConfirmation.class);
                startActivity(intent);
            });
        //Functionality: Salon Button Onclick navigate to Service Page Screen
        Button myButton1 = findViewById(R.id.button10);
        myButton1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, OrderConfirmation.class);
            startActivity(intent);
        });

        //Set2: Electrician Image Button and Button
        //Functionality: Electrician Image Button Onclick navigate to Service Page Screen
        ImageButton imageButton1 = findViewById(R.id.imageButton9);
        imageButton1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, OrderConfirmation.class);
            startActivity(intent);
        });
        //Functionality: Electrician Button Onclick navigate to Service Page Screen
        Button myButton2 = findViewById(R.id.button11);
        myButton2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, OrderConfirmation.class);
            startActivity(intent);
        });

        //Set3: Plumber Image Button and Button
        //Functionality: Plumber Image Button Onclick navigate to Service Page Screen
        ImageButton imageButton2 = findViewById(R.id.imageButton10);
        imageButton2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, OrderConfirmation.class);
            startActivity(intent);
        });
        //Functionality: Plumber Button Onclick navigate to Service Page Screen
        Button myButton3 = findViewById(R.id.button12);
        myButton3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, OrderConfirmation.class);
            startActivity(intent);
        });

        //Set4: Others Image Button and Button
        //Functionality: Others Image Button Onclick navigate to Service Page Screen
        ImageButton imageButton3 = findViewById(R.id.imageButton11);
        imageButton3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, OrderConfirmation.class);
            startActivity(intent);
        });
        //Functionality: Others Button Onclick navigate to Service Page Screen
        Button myButton4 = findViewById(R.id.button13);
        myButton4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, OrderConfirmation.class);
            startActivity(intent);
        });
    }

}