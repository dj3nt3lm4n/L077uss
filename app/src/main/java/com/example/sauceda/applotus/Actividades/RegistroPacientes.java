package com.example.sauceda.applotus.Actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sauceda.applotus.MainActivity;
import com.example.sauceda.applotus.R;

public class RegistroPacientes extends AppCompatActivity {

    EditText edtNom,edtApe,edtCorreo,edtPass;
    Button btnRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        edtNom=findViewById(R.id.edtNombresUsuario);
        edtApe=findViewById(R.id.edtApellidosUsuario);
        edtCorreo=findViewById(R.id.edtCorreoUsuario);
        edtPass=findViewById(R.id.edtPaswordUsuario);
        btnRegistrar=findViewById(R.id.btnRegistrarUsuario);


        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre=edtNom.getText().toString();
                String apellido=edtApe.getText().toString();
                String correo=edtCorreo.getText().toString();
                String pass=edtPass.getText().toString();

                Toast.makeText(RegistroPacientes.this, "Se Registró al usuario: "
                        +nombre+" "+apellido+" su correo es: "+correo+" su contraseña es: "
                        +pass, Toast.LENGTH_SHORT).show();
                startActivity(new Intent(RegistroPacientes.this,MainActivity.class));
            }
        });
    }
}
