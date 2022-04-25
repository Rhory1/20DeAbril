package com.example.a20deabril;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

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
        btnContar.setOnClickListener(view -> contarVocal());
    }

    private void contarVocal() {
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

}





/*
* String cadena = "Mi nombre es Luis Cabrera. Tengo un blog en parzibyte.me/blog y aunque no es mi lenguaje favorito, me gusta Java";

        // Crear e inicializar mapa
        // Tutorial de mapas: https://parzibyte.me/blog/2020/01/07/hashmap-java-tutorial-ejemplos/
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 0);
        hashMap.put("e", 0);
        hashMap.put("i", 0);
        hashMap.put("o", 0);
        hashMap.put("u", 0);

        // Recorremos la cadena letra por letra y vemos si es una vocal
        for (int x = 0; x < cadena.length(); x++) {
            char letraActual = cadena.charAt(x);
            if (esVocal(letraActual)) {
                // La clave es la vocal en sí, pero en minúscula
                String clave = String.valueOf(letraActual).toLowerCase();
                // Aumentamos el conteo en esa clave
                hashMap.put(clave, hashMap.get(clave) + 1);
            }
        }
        System.out.printf("Resultados para '%s':\n", cadena);
        //Imprimir resultados
        for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.printf("Vocal: %s. Conteo: %d\n", entry.getKey(), entry.getValue());
        }
    }

    private static boolean esVocal(char letra) {
        return "aeiou".contains(String.valueOf(letra).toLowerCase());*/