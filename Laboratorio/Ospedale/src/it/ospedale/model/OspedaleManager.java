package it.ospedale.model;

import java.util.ArrayList;

import it.ospedale.exception.OspedalePienoException;

public class OspedaleManager {
    private ArrayList<Paziente> pazienti;
    private final int CAPIENZA_MASSIMA = 30;

    public OspedaleManager(ArrayList<Paziente> pazienti){
        this.pazienti = pazienti;
    }

    public void setListaPazienti(ArrayList<Paziente> pazienti){
        this.pazienti = pazienti;
    }

	public ArrayList<Paziente> getPazienti() {
		return pazienti;
	}

    public void aggiungiPaziente(Paziente p) throws OspedalePienoException{
        if(pazienti.size() + 1 > CAPIENZA_MASSIMA){
            throw new OspedalePienoException();
        }
        pazienti.add(p);
    }
}
