package com.example.dolortagebuch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Einloggen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.einloggen);

        //String benutzername = Aus Datenbank auslesen (Vorname des ausgewählten Kontos)
        String benutzername = "Thimo";

        TextView name = findViewById(R.id. Benutzername);
        name.setText(benutzername);
    }


    public void login(View view) {

        // String passWord = Aus Datenbank auslesen
        String passWord = "android";


        EditText password = findViewById(R.id.PasswortEingeben);

        String kontrollePw = password.getText().toString();

        if (passWord.equals(kontrollePw)) {
            Toast.makeText(this, "Sie haben sich erfolreich eingeloggt!", Toast.LENGTH_LONG).show();

            //Intent j = new Intent(getApplicationContext(), startseite.class); Hier muss der Klassenname der Starteite eingegeben werden
            //startActivity(j);
        }else if (kontrollePw.length() == 0){
            Toast.makeText(this, "Es wurden kein Passwort eingegeben.", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Das Passwort stimmt nicht überein.", Toast.LENGTH_LONG).show();
        }
    }

    public void back(View view){
        Intent x = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(x);

    }
}
