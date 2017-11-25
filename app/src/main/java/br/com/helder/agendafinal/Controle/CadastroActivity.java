package br.com.helder.agendafinal.Controle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import br.com.helder.agendafinal.Modelo.Usuario;
import br.com.helder.agendafinal.R;

public class CadastroActivity extends AppCompatActivity {

    TextView txtNome;
    TextView txtEmail;

    Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        txtNome = (TextView) findViewById(R.id.txtPrincipalNome);
        txtEmail = (TextView) findViewById(R.id.txtPrincipalEmail);

        Intent it = getIntent();
        usuario = (Usuario) it.getSerializableExtra("usuario");

        String nome = usuario.getNome();
        String email = usuario.getEmail();
        txtNome.setText(nome);
        txtEmail.setText(email);
    }

}
