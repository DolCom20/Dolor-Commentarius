package com.example.dolortagebuch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registrieren(View view) {

        Intent i = new Intent(getApplicationContext(), Registrieren.class);
        startActivity(i);

    }

    public void einloggen(View view) {

        Intent i = new Intent(getApplicationContext(), Einloggen.class);
        startActivity(i);
    }
}