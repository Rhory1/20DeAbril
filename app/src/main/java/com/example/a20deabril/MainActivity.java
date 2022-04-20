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
    private String contarVocal;
    private boolean esMinuscula;
    private int contar = 0;
    private char a = 'a';
    private char e = 'e';
    private char i = 'i';
    private char o = 'o';
    private char u = 'u';

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
        btnProcesar.setOnClickListener(view -> obtenerInformacion());
    }

    private void inicializarVistas() {
        etPalabra = findViewById(R.id.etPalabra);
        btnContar = findViewById(R.id.btnContar);
        btnProcesar = findViewById(R.id.btnProcesar);
        cbMinuscula = findViewById(R.id.cbMinuscula);
    }
    private void obtenerInformacion(){
        palabra = etPalabra.getText().toString();
        // getChecked --- is checked
        esMinuscula = cbMinuscula.isChecked();
        contar =0;
        for(int i = this.palabra.length()-1; i>=0; i--){
            char conteo= this.palabra.charAt(i);
            if (a == palabra.charAt(i) || e ==palabra.charAt(i)) {
            contar++;
            }
        }

        Toast.makeText(this,"tiene"+contar, Toast.LENGTH_SHORT).show();

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