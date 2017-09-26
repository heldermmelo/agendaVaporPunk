package br.com.helder.agendafinal.Modelo;

/**
 * Created by Helder on 14/09/2017.
 */

import java.io.Serializable;

public class Usuario implements Serializable {

    private String nome;
    private String email;

    public Usuario() {
        nome = null;
        email = null;
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}