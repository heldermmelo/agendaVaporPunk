package br.com.helder.agendafinal.Controle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import br.com.helder.agendafinal.Modelo.Usuario;
import br.com.helder.agendafinal.R;

public class AtividadeLogin extends AppCompatActivity implements View.OnClickListener{
    EditText edtEmail;
    EditText edtSenha;
    TextView mTextMensagem;
    ProgressBar mProgressBar;
    Usuario usuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_login);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtSenha = (EditText) findViewById(R.id.edtSenha);

        View view = getLayoutInflater().inflate(R.layout.activity_atividade_login, null);
        mTextMensagem = (TextView)view.findViewById(android.R.id.empty);
        mProgressBar = (ProgressBar)view.findViewById(R.id.progressBar);

        Button btnEntrar = (Button) findViewById(R.id.btnEntrar);
        btnEntrar.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        String email = edtEmail.getText().toString();
        String senha = edtSenha.getText().toString();
        Intent intent = new Intent(this, AtividadePrincipal.class);

        intent.putExtra("nome", usuario.getNome());
        intent.putExtra("email", usuario.getEmail());
        startActivity(intent);
    }


}
