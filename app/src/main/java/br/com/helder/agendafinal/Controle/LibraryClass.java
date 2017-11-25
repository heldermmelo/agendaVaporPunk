package br.com.helder.agendafinal.Controle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Helder on 10/10/2017.
 */

public class LibraryClass {
    private static DatabaseReference firebase;

    private LibraryClass(){}

    public static DatabaseReference getFirebase(){
        if (firebase == null){
            firebase= FirebaseDatabase.getInstance().getReference();
        }
        return (firebase);
    }

}
