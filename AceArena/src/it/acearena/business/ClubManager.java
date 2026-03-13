package it.acearena.business;
import java.util.ArrayList;

import it.acearena.exceptions.CampiEsauritiException;
import it.acearena.model.*;

public class ClubManager {
    private ArrayList<Giocatore> prenotazioni;
    private final int capienzaMassima = 15;

    public ClubManager(){
        prenotazioni = new ArrayList<Giocatore>();
    }

    public void addGiocatore(Giocatore g) throws CampiEsauritiException{
        if((prenotazioni.size() + 1) > capienzaMassima){
            throw new CampiEsauritiException();
        }
        prenotazioni.add(g);
    }
}
