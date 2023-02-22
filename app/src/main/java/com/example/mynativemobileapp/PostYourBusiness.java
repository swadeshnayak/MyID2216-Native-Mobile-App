package com.example.mynativemobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class PostYourBusiness extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_your_business);

        Spinner spinner = findViewById(R.id.serviceSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.service_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

//        Button myButton = findViewById(R.id.button2);
//        myButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(PostYourBusiness.this, OrderConfirmation.class);
//                startActivity(intent);
//            }
//        });

        Button myButton = findViewById(R.id.button2);
        myButton.setOnClickListener(v -> {
            // Validate the mandatory fields
            EditText editText1 = findViewById(R.id.textView2);
            EditText editText2 = findViewById(R.id.textView6);
            EditText editText3 = findViewById(R.id.textView12);
            EditText editText4 = findViewById(R.id.textView13);
            EditText editText5 = findViewById(R.id.textView15);
            EditText editText6 = findViewById(R.id.textView16);
            if (editText1.getText().toString().isEmpty() || editText2.getText().toString().isEmpty() ||
                editText3.getText().toString().isEmpty() || editText4.getText().toString().isEmpty() ||
                editText5.getText().toString().isEmpty() || editText6.getText().toString().isEmpty()) {
                Toast.makeText(PostYourBusiness.this, "Please fill in all mandatory fields.", Toast.LENGTH_SHORT).show();
                if (editText1.getText().toString().isEmpty()) {
                    editText1.setBackgroundResource(R.drawable.edittext_mandatory);
                } else {
                    editText1.setBackgroundResource(R.drawable.edittext_filled);
                }
                if (editText2.getText().toString().isEmpty()) {
                    editText2.setBackgroundResource(R.drawable.edittext_mandatory);
                } else {
                    editText2.setBackgroundResource(R.drawable.edittext_filled);
                }
                if (editText3.getText().toString().isEmpty()) {
                    editText3.setBackgroundResource(R.drawable.edittext_mandatory);
                } else {
                    editText3.setBackgroundResource(R.drawable.edittext_filled);
                }
                if (editText4.getText().toString().isEmpty()) {
                    editText4.setBackgroundResource(R.drawable.edittext_mandatory);
                } else {
                    editText4.setBackgroundResource(R.drawable.edittext_filled);
                }
                if (editText5.getText().toString().isEmpty()) {
                    editText5.setBackgroundResource(R.drawable.edittext_mandatory);
                } else {
                    editText5.setBackgroundResource(R.drawable.edittext_filled);
                }
                if (editText6.getText().toString().isEmpty()) {
                    editText6.setBackgroundResource(R.drawable.edittext_mandatory);
                } else {
                    editText6.setBackgroundResource(R.drawable.edittext_filled);
                }
            } else {
                // Proceed to the next screen
                Intent intent = new Intent(PostYourBusiness.this, OrderConfirmation.class);
                startActivity(intent);
            }
        });

    }
}