package com.vivianafemenia.ejercicio01enviarinformacin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtEscribir;
    private Button btnPalabras;
    private Button btncaracteres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inicializaVistas();



        btnPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CalculadoraMainActivity2.class);
                Bundle bundle = new Bundle();

                bundle.putString("FRASE", txtEscribir.getText().toString());
                bundle.putInt("BOTON",view.getId());
                intent.putExtras(bundle);
                startActivity(intent);


            }
        });
        btncaracteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CalculadoraMainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putString("FRASE", txtEscribir.getText().toString());
                bundle.putInt("BOTON",view.getId());
                intent.putExtras(bundle);
                startActivity(intent);




            }
        });
    }


    private void inicializaVistas() {

        txtEscribir = findViewById(R.id.txtEscribirMain);
        btnPalabras = findViewById(R.id.btnPalbrasMain);
        btncaracteres = findViewById(R.id.btnCaracteresMain);
    }
}