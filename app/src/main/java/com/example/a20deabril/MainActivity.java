package com.example.a20deabril;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    //Atributos
    private EditText etPalabra;
    private Button btnProcesar, btnContar;
    private CheckBox cbMinuscula;

    private String palabra;
    private String mensaje;
    private boolean esMinuscula;
    private int contar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
        /*btnProcesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obtenerInformacion();
            }
        });*/
        //Lambda functions o funciones de flecha
        //Es igual al codigo anterior
        // INVESTIGAR LAS FUNCIONES DE LANBDA FUCTIONS
        btnProcesar.setOnClickListener(view -> Datos());
        // btnContar.setOnClickListener(view -> contarVocal());
        btnContar.setOnClickListener(view -> contarVocales());
    }
//Solucion realizada en clases
    private void contarVocales() {
        obtenerInformacion();
        ArrayList<Character> vocales = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        int cantidadVocales = 0;
       // String palabraMinuscula = palabra.toLowerCase();
        for (int i = 0; i< palabra.length(); i ++){
            if (vocales.contains(palabra.charAt(i))){
                    cantidadVocales++;
            }
        }
    }

   /* private void contarVocal() {
        Datos();
        if (palabra.contains("a") || palabra.contains("A")) {
            contar += 1;
        }
        if (palabra.contains("e") || palabra.contains("E")) {
            contar += 1;
        }
        if (palabra.contains("i") || palabra.contains("I")) {
            contar += 1;
        }
        if (palabra.contains("o") || palabra.contains("O")) {
            contar += 1;
        }
        if (palabra.contains("u") || palabra.contains("U")) {
            contar += 1;
        }
        mensaje = "La palabra tiene: " + this.contar + " vocales";
        contar = 0;
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
    }
*/

    private void Datos() {
        palabra = etPalabra.getText().toString();
        esMinuscula = cbMinuscula.isChecked();
    }

    private void inicializarVistas() {
        etPalabra = findViewById(R.id.etPalabra);
        btnContar = findViewById(R.id.btnContar);
        btnProcesar = findViewById(R.id.btnProcesar);
        cbMinuscula = findViewById(R.id.cbMinuscula);

    }
    private void obtenerInformacion(){
        palabra = etPalabra.getText().toString();
        esMinuscula = cbMinuscula.isChecked();
        convertirAMinuscula();
    }
    private void convertirAMinuscula(){
        if (esMinuscula ){
            palabra = palabra.toLowerCase();
        }
    }
}