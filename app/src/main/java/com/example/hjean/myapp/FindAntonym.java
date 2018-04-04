package com.example.hjean.myapp;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class FindAntonym extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_antonym);

        final String text = getIntent().getExtras().getString("text");
        new AsyncTask<Context, Void, Void>() {

            @Override
            protected Void doInBackground(Context... voided) {
                if (myAppDatabase.getFileDatabase(voided[0]).model().findByName(text) != null) {
                    String antonym = myAppDatabase.getFileDatabase(voided[0]).model().findByName(text).getAntonym();
                    ((TextView) findViewById(R.id.antonym)).setText(antonym);
                }
                return null;
            }
        }.execute(this);
    }
}


