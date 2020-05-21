package com.example.dolortagebuch;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

public class Registrieren extends AppCompatActivity {

        int zähler = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {


            super.onCreate(savedInstanceState);
            setContentView(R.layout.registrieren);


        }


        public void registrieren(View view) {

            RatingBar stars = (RatingBar) findViewById(R.id.sternpw);
            float starvalue = stars.getRating();

            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

            EditText Vorname = findViewById(R.id.Vorname);
            EditText Name = findViewById(R.id.Name);
            EditText Email = findViewById(R.id.email);
            EditText Geburtsdatum = findViewById(R.id.Geburtsdatum);

            String vorname = Vorname.getText().toString();
            String name = Name.getText().toString();
            String email = Email.getText().toString();
            String geburtsdatum = Geburtsdatum.getText().toString();

            if (vorname.length() == 0 || name.length() == 0 || email.length() == 0 || geburtsdatum.length() == 0 || starvalue == 0) {
                context = getApplicationContext();
                text = "Alle Felder mit * müssen ausgefüllt werden ";
                duration = Toast.LENGTH_SHORT;

                toast = Toast.makeText(context, text, duration);
                toast.show();
            } else {

                context = getApplicationContext();
                text = "Sie wurden erfolgreich registriert! ";
                duration = Toast.LENGTH_SHORT;

                toast = Toast.makeText(context, text, duration);
                toast.show();

                Intent i = new Intent(getApplicationContext(), Einloggen.class);
                startActivity(i);


            }
        }

        public void onCheckboxClicked(View view) {

            boolean checked = ((CheckBox) view).isChecked();
            switch (view.getId()) {
                case R.id.Herr:
                    if (checked)

                        break;
                    switch (view.getId()) {
                        case R.id.Frau:
                            if (checked)


                                break;
                    }

            }

        }


        public void zurück(View view) {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);


        }

        public void wechselBild(View view) {


            ImageView imgView = (ImageView) findViewById(R.id.Avatar);
            if (zähler == 3)
            {
                zähler = 0;
                imgView.setImageResource(R.drawable.avatarmann);
            }

            else if (zähler == 0) {
                zähler++;

                imgView.setImageResource(R.drawable.avatarfrau);
            } else if (zähler == 1) {
                zähler++;
                imgView.setImageResource(R.drawable.avatarhund);
            } else if (zähler == 2) {
                zähler++;
                imgView.setImageResource(R.drawable.avatarkatze);
            } else if (zähler == 3) {
                zähler++;
                imgView.setImageResource(R.drawable.avatarmann);
            }

        }
}

