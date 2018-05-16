package br.com.helder.agendafinal.Modelo;


import android.icu.util.GregorianCalendar;

import java.util.Date;

/**
 * Created by Helder on 27/11/2017.
 */

public class Lembrete {


    private String id=null;
    private String lembrete=null;
    private Date dataInicial=null;
    private Date dataFinal=null;

    public GregorianCalendar getGregorianCalendar() {
        return gregorianCalendar;
    }

    public void setGregorianCalendar(GregorianCalendar gregorianCalendar) {
        this.gregorianCalendar = gregorianCalendar;
    }

    private GregorianCalendar gregorianCalendar=null;
    public Lembrete(){
       if (id==null){
            setId(this.id);
        }
        if (lembrete==null){
            setLembrete(this.lembrete);
        }
        if (dataInicial==null){
            setDataInicial(this.dataInicial);
        }
        if (dataFinal==null){
            setDataFinal(this.dataFinal);
        }
        if (gregorianCalendar==null){
            setGregorianCalendar(this.gregorianCalendar);
    }}
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public void setLembrete(String lembrete) {

        this.lembrete = lembrete;
    }

    public String getLembrete() {
        return lembrete;
    }
}
