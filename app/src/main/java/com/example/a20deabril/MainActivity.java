package com.example.a20deabril;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Atributos
    private EditText etPalabra;
    private Button btnProcesar, btnContar;
    private CheckBox cbMinuscula;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
    }

    private void inicializarVistas() {
        etPalabra = findViewById(R.id.etPalabra);
        btnContar = findViewById(R.id.btnContar);
        btnProcesar = findViewById(R.id.btnProcesar);
        cbMinuscula = findViewById(R.id.cbMinuscula);
    }
}