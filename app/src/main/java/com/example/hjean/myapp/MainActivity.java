package com.example.hjean.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button EnterValues = findViewById(R.id.EnterValues);
        EnterValues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goingToEnterValuesScreen = new Intent(getApplicationContext(), EnterValues.class);
                startActivity(goingToEnterValuesScreen);
            }
        });
       Button goScreen = findViewById(R.id.Results);
        goScreen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText text = findViewById(R.id.editText);
                Intent intents = new Intent(getApplicationContext(), FindAntonym.class);
                intents.putExtra("text", text.getText().toString());
                startActivity(intents);
            }
        });

    }
}

