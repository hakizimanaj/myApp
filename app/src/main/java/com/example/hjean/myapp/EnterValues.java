package com.example.hjean.myapp;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class EnterValues extends AppCompatActivity {

    private myAppDatabase base;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_values);
         final myAppDatabase base = myAppDatabase.getFileDatabase(getApplicationContext());
         final Words words = new Words();
        Button submitting = findViewById(R.id.results2);
        submitting.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText kk = findViewById(R.id.word);
                String word = kk.getText().toString();
                words.setWord(word);
                EditText antonym = findViewById(R.id.antonym);
                String opposite = antonym.getText().toString();
                words.setAntonym(opposite);
                new AsyncTask<Void, Void, Void>() {
                    @Override
                    protected Void doInBackground(Void... voided) {
                        base.model().insertAll(words);
                        return null;
                    }

                    @Override
                    protected void onPostExecute(Void voiding) {
                        Intent goValue = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(goValue);
                    }
                }.execute();

            }
        });
    }
    }


