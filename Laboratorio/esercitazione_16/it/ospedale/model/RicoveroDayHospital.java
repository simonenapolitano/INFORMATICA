package it.ospedale.model;
import java.time.Period;

public class RicoveroDayHospital extends Paziente {
    public RicoveroDayHospital(String nome, String codiceCartellaClinica){
        super(nome, codiceCartellaClinica);
    }

    @Override
    public Double calcolaCostoRicovero() {
        if(super.getDataUscita() != null){
            int nGiorni = Period.between(super.getDataArrivo(), super.getDataUscita()).getDays();
            if(nGiorni > 5){
                return (super.getTariffaBase()) * Period.between(super.getDataArrivo(), super.getDataUscita()).getDays() * 0.8;  
            }
            return super.getTariffaBase() * Period.between(super.getDataArrivo(), super.getDataUscita()).getDays();
        }
        return -1.0;
    }
}
