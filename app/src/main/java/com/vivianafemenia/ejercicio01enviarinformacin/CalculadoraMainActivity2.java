package com.vivianafemenia.ejercicio01enviarinformacin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.StringTokenizer;

public class CalculadoraMainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_main2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null ){
            int boton = bundle.getInt("BOTON");
            String escribir = bundle.getString("FRASE");

            switch (boton){
                case R.id.btnCaracteresMain:
                    cuantaCarateres(escribir);
                    break;
                case R.id.btnPalbrasMain:
                    cuentaPalabras(escribir);
                    break;
            }
        }
    }

    private void cuentaPalabras(String escribir) {
        StringTokenizer token= new StringTokenizer(escribir);
        Toast.makeText(this,String.valueOf(token.countTokens()), Toast.LENGTH_SHORT).show();
    }

    private void cuantaCarateres(String escribir) {
        Toast.makeText(this, String.valueOf(escribir.length()), Toast.LENGTH_SHORT).show();
    }
}