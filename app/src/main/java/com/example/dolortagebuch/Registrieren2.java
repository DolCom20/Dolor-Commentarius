package com.example.dolortagebuch;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Registrieren2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrieren2);

        //EditText Vorname = findViewById(R.id.Vorname);
        //String user = Vorname.getText().toString();
        //String benutzer = "Hallo " + user;
        //TextView name = findViewById(R.id. benutzername);
        //name.setText(benutzer);
        //
    }

    public void registrieren(View view) {

        RatingBar stars = (RatingBar) findViewById(R.id.sternpw);
        float starvalue = stars.getRating();


        EditText Passwort = findViewById(R.id.passwort);
        EditText Kontrollpw = findViewById(R.id.pwwiederholen);

        //Diese Variablen müssen in der Datenbank abgespeichert werden
        String passwort = Passwort.getText().toString();
        String pwwiederholen = Kontrollpw.getText().toString();


        if (Passwort.length() == 0 || Kontrollpw.length() == 0 || starvalue == 0) {

            Toast.makeText(this, "Alle Felder mit * müssen ausgefüllt werden!", Toast.LENGTH_LONG).show();
        } else if (passwort.equals(pwwiederholen))
        {
            Toast.makeText(this, "Sie haben sich erfolgreich registriert!", Toast.LENGTH_LONG).show();
            Intent i = new Intent(getApplicationContext(), Einloggen.class);
            startActivity(i);
        }
        else {
            Toast.makeText(this, "Passwörter stimmen nicht überein!", Toast.LENGTH_LONG).show();

        }
    }
    public void zurück(View view) {
        Intent i = new Intent(getApplicationContext(), Registrieren.class);
        startActivity(i);
    }
}
