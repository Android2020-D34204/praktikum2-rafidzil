package com.example.kalkulatorrafi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText bilangan1, bilangan2, operasi;
    TextView hasill;
    Button Tombol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bilangan1 = findViewById(R.id.angka1);
        bilangan2 = findViewById(R.id.angka2);
        operasi = findViewById(R.id.operator);
        hasill = findViewById(R.id.editHasil);
        Tombol = findViewById(R.id.tombol);
    }

    public void Ngitung(View v){
        double a1 = Double.parseDouble(bilangan1.getText().toString());
        double a2 = Double.parseDouble(bilangan2.getText().toString());

        if ("+".equals(operasi.getText().toString())){
            double jumlah = a1 + a2;
            hasill.setText(String.valueOf(jumlah));
        }
        else if ("-".equals(operasi.getText().toString())){
            double jumlah = a1 - a2;
            hasill.setText(String.valueOf(jumlah));
        }
        else if ("*".equals(operasi.getText().toString())){
            double jumlah = a1 * a2;
            hasill.setText(String.valueOf(jumlah));
        }
        else if ("/".equals(operasi.getText().toString())){
            double jumlah = a1 / a2;
            hasill.setText(String.valueOf(jumlah));
        }
        else{
            hasill.setText("HASIL ARITMATIKA TIDAK SESUAI");
        }
    }
}