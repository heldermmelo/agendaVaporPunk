package br.com.helder.agendafinal.Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Helder on 27/11/2017.
 */

public class Lembrete {
    private String id;
    private String lembrete;
    private Date dataInicial;
    private Date dataFinal;

    public void setLembrete(String lembrete) {
        this.lembrete = lembrete;
    }

    public String getLembrete() {
        return lembrete;
    }
}
