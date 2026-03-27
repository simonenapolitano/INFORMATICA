package it.ospedale.model;

import java.time.LocalDate;
import java.time.Period;

public class RicoveroDayHospital extends Paziente {
    public RicoveroDayHospital(String nome, String codiceCartellaClinica){
        super(nome, codiceCartellaClinica);
    }

    @Override
    public Double calcolaCostoRicovero() {
        int nGiorni = Period.between(super.getDataArrivo(), LocalDate.now()).getDays();
        if(nGiorni > 5){
            return super.getTariffaBase() * Period.between(super.getDataArrivo(), LocalDate.now()).getDays() * 0.8;
        } else{
            return super.getTariffaBase() * Period.between(super.getDataArrivo(), LocalDate.now()).getDays();
        }
    }
}
