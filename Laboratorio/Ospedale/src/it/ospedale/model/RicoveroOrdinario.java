package it.ospedale.model;

import java.time.LocalDate;
import java.time.Period;

public class RicoveroOrdinario extends Paziente {
    private boolean pastoPersonalizzato;

    public RicoveroOrdinario(String nome, String codiceCartellaClinica, boolean pastoPersonalizzato){
        super(nome, codiceCartellaClinica);
        this.pastoPersonalizzato = pastoPersonalizzato;
    }   

    public boolean isPastoPersonalizzato() {
        return pastoPersonalizzato;
    }

    public void setPastoPersonalizzato(boolean pastoPersonalizzato) {
        this.pastoPersonalizzato = pastoPersonalizzato;
    }

    public Double calcolaCostoRicovero(){   
        if(pastoPersonalizzato){
            return (super.getTariffaBase() + 20) * Period.between(super.getDataArrivo(), LocalDate.now()).getDays();
        }
        return super.getTariffaBase() * Period.between(super.getDataArrivo(), LocalDate.now()).getDays();
    }
}
