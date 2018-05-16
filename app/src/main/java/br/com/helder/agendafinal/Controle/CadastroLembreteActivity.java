package br.com.helder.agendafinal.Controle;

import android.content.Intent;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import android.widget.EditText;
import android.widget.TextView;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import br.com.helder.agendafinal.Modelo.Lembrete;
import br.com.helder.agendafinal.Modelo.Usuario;
import br.com.helder.agendafinal.R;



public class CadastroLembreteActivity extends AppCompatActivity {
    private DatePicker dtPickResultado;
    private EditText dataEdit;
    private TextView txtLembrete;
    private int ano;
    private int mes;
    private int dia;

    static final int DATE_DIALOG_ID = 111;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_lembrete);

        //setando data no datepicker:
        dtPickResultado.init(ano, mes, dia, null);
        final Calendar cal = Calendar.getInstance();
        ano = cal.get(Calendar.YEAR);
        mes = cal.get(Calendar.MONTH);
        dia = cal.get(Calendar.DAY_OF_MONTH);
        dtPickResultado =  findViewById(R.id.dtPickResultado);
      final Lembrete lembrete=new Lembrete();
        Button reg = findViewById(R.id.btnAdicionarLembrete);
        reg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View reg) {

               lembrete.setLembrete(txtLembrete.toString()); // Fetch strings from edit texts here and check if they are not empty


            }
        });

        //clique sobre o botão para editar texto:

        dataEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DATE_DIALOG_ID);
            }
        });
    }
        @Override
        protected Dialog onCreateDialog(int id){
            switch (id){
                case DATE_DIALOG_ID:
                    return new DatePickerDialog(this, datePickerListener
                            ,ano, mes, dia);
            }
            return null;
        }


         DatePickerDialog.OnDateSetListener datePickerListener
                = new DatePickerDialog.OnDateSetListener() {
            //fechando o datapicker
            public void onDateSet(DatePicker view, int selectedYear,
                                  int selectedMonth, int selectedDay){
                ano=selectedYear;
                mes=selectedMonth;
                dia=selectedDay;

                dataEdit.setText(new StringBuilder().append(dia).append(mes+1).append(ano).append(" "));
                dtPickResultado.init(ano, mes, dia, null);
            }
        };



   // public void setLembrete(TextView lembrete) {
        //this.lembrete = lembrete;
    //}
    Intent intent = new Intent(this, AtividadePrincipal.class);
    //intent.putExtra("lembrete", lembrete);

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }
    }

