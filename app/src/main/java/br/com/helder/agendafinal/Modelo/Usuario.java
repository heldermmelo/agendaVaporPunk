package br.com.helder.agendafinal.Modelo;

/**
 * Created by Helder on 14/09/2017.
 */

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;

import java.io.Serializable;
import java.util.Map;

import br.com.helder.agendafinal.Controle.LibraryClass;

public class Usuario implements Serializable {
    private String id;
    private String nome;
    private String email;
    private String senha;

    public Usuario() {}

    public Usuario(String nome, String email, String senha) {

        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private void setNomeInMap(Map<String, Object> map) {
        if (getNome()!= null) {
            map.put("nome", getNome());
        }
    }
    public void setNomeIfNull(String nome) {
        if (this.nome == null) {
            this.nome = nome;
        }
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private void setEmailInMap(Map<String, Object> map) {
        if (getEmail() != null) {
            map.put("email", getEmail());
        }
    }

    public void setEmailIfNull(String email) {
        if (this.email == null) {
            this.email = email;
        }
    }
    @Exclude
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void saveDB(DatabaseReference.CompletionListener... completionListener) {
        DatabaseReference firebase = LibraryClass.getFirebase().child("users").child(getId());
        if (completionListener.length == 0) {
            firebase.setValue(this);
        } else {
            firebase.setValue(this, completionListener[0]);
        }
    }

}