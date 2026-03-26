package it.ospedale.model;
import java.util.ArrayList;

import it.ospedale.exception.OspedalePienoException;

public class OspedaleManager {
    private ArrayList<Paziente> pazienti;
    private final int CAPIENZA_MASSIMA = 30;

    public ArrayList<Paziente> getListaPazienti() {
        return pazienti;
    }

    public void addPaziente(Paziente paziente) throws OspedalePienoException {
        if(pazienti.size() + 1 < CAPIENZA_MASSIMA){
            pazienti.add(paziente);
        } else{
            throw new OspedalePienoException();
        }
    }

    
    public OspedaleManager(){
        pazienti = new ArrayList<Paziente>();
    }
}
