package com.example.sauceda.applotus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sauceda.applotus.Actividades.RegistroPacientes;
import com.example.sauceda.applotus.Actividades.RegistroPsicologos;

public class MainActivity extends AppCompatActivity {

    Button btnRCPsicologo,btnRCUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRCUsuario =findViewById(R.id.btnRCUsuario);
        btnRCPsicologo=findViewById(R.id.btnRCPsicologo);

        btnRCUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,RegistroPsicologos.class));
            }
        });
        btnRCUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,RegistroPacientes.class));
            }
        });
    }

}

