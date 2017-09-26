package br.com.helder.agendafinal.Controle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import br.com.helder.agendafinal.R;

public class AtividadePrincipal extends AppCompatActivity {

    TextView txtNome;
    TextView txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_principal);

        txtNome = (TextView) findViewById(R.id.txtNome);
        txtEmail = (TextView) findViewById(R.id.txtEmail);

        Intent it = getIntent();

        String nome = it.getStringExtra("nome");
        txtNome.setText(nome);

        String email = it.getStringExtra("email");
        txtEmail.setText(email);
    }
}