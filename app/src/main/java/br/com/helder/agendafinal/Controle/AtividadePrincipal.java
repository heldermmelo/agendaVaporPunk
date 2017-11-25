package br.com.helder.agendafinal.Controle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import br.com.helder.agendafinal.R;

public class AtividadePrincipal extends AppCompatActivity {


    //TextView txtEmail;
    //TextView txtSenha;
    //TextView txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_principal);

   //     txtNome = (TextView) findViewById(R.id.txtPrincipalNome);
      //  txtEmail = (TextView) findViewById(R.id.txtEmail);
       // txtSenha = (TextView) findViewById(R.id.txtSenha);


        Intent it = getIntent();

        //String email = it.getStringExtra("email");
        //txtEmail.setText(email);

        //String senha = it.getStringExtra("senha");
        //txtSenha.setText(senha);
    }
}