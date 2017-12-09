package br.com.helder.agendafinal.Controle;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.provider.CalendarContract.Attendees;
import android.text.format.Time;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.ListView;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

import br.com.helder.agendafinal.R;

public class AtividadePrincipal extends AppCompatActivity {


    //TextView txtEmail;
    //TextView txtSenha;
    //TextView txtNome;
    private TextView lembrete;
    private CalendarView dataInicial;
    private CalendarView dataFinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade_principal);



        //String email = it.getStringExtra("email");
        //txtEmail.setText(email);

        //String senha = it.getStringExtra("senha");
        //txtSenha.setText(senha);
    }
}