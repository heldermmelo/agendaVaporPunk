package br.com.helder.agendafinal.Controle;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import br.com.helder.agendafinal.Modelo.Usuario;
import br.com.helder.agendafinal.Modelo.Util;
import br.com.helder.agendafinal.R;

public class AtividadeLogin extends AppCompatActivity implements View.OnClickListener{
    EditText edtEmail;
    EditText edtSenha;
    TextView mTextMensagem;
    ProgressBar mProgressBar;
    Usuario usuario;

    private FirebaseAuth minhaAuth;

    AtividadeLogin _this;

    String email;
    String senha;



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

        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (googleApiAvailability.isGooglePlayServicesAvailable(getApplicationContext()) != ConnectionResult.SUCCESS) {
            googleApiAvailability.makeGooglePlayServicesAvailable(this);
        }

        minhaAuth = FirebaseAuth.getInstance();

        _this = this;
    }


    @Override
    public void onClick(View view) {

        String email = edtEmail.getText().toString();
        String senha = edtSenha.getText().toString();

        usuario = new Usuario("", email, senha);

        minhaAuth.signInWithEmailAndPassword(email, senha)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d("TAG.sucesso", "signInWithEmail:success");
                            FirebaseUser user = minhaAuth.getCurrentUser();
                            updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("TAG.falha", "signInWithEmail:failure", task.getException());
                            Toast.makeText(_this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            // updateUI(null);
                        }

                        // ...
                    }
                });
    }

    public void updateUI(FirebaseUser user) {

        //FirebaseDatabase myRefdatabase = FirebaseDatabase.getInstance();
        //DatabaseReference myRef = myRefdatabase.getReference("usuario");
        //String id = user.getUid();
        //Query query = myRef.equalTo(id);
        //Usuario usuario = query.

        Util.idUsuario = user.getUid();

        Intent intent = new Intent(this, RecepcaoActivity.class);
        intent.putExtra("usuario", usuario);
        startActivity(intent);
    }

    public void cadastrar(View v) {
       // Intent intent = new Intent(this, EditarUsuarioActivity.class);
        //startActivity(intent);
    }
}
