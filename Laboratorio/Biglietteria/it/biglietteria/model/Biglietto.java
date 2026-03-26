package it.biglietteria.model;

public class Biglietto{
    private double prezzo;
    private int giornoConcerto;
    private int meseConcerto;
    private int annoConcerto;
    private Utente utenteCompratore;

    public Biglietto(double prezzo, int giornoConcerto, int meseConcerto, int annoConcerto, Utente utenteCompratore){
        if(giornoConcerto < 1 || giornoConcerto > 31){
            throw new IllegalArgumentException("Giorno non valido! [1-31]");
        }
        if(meseConcerto < 1 || meseConcerto > 12){
            throw new IllegalArgumentException("Mese non valido! [1-12]");
        }
        if(annoConcerto < 2026){
            throw new IllegalArgumentException("Anno non valido! [2026-]");
        }
        this.prezzo = prezzo;
        this.giornoConcerto = giornoConcerto;
        this.meseConcerto = meseConcerto;
        this.annoConcerto = annoConcerto;
        this.utenteCompratore = utenteCompratore;
        utenteCompratore.addBigliettoComprato(this);
    }

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }
    public void setGiornoConcerto(int giornoConcerto){
        if(giornoConcerto < 1 || giornoConcerto > 31){
            throw new IllegalArgumentException("Giorno non valido! [1-31]");
        }
        this.giornoConcerto = giornoConcerto;
    }
    public void setMeseConcerto(int meseConcerto){
        if(meseConcerto < 1 || meseConcerto > 12){
            throw new IllegalArgumentException("Mese non valido! [1-12]");
        }
        this.meseConcerto = meseConcerto;
    }
    public void setAnnoConcerto(int annoConcerto){
        if(annoConcerto < 2026){
            throw new IllegalArgumentException("Anno non valido! [2026-]");
        }
        this.annoConcerto = annoConcerto;
    }
    public void setUtenteCompratore(Utente utenteCompratore){
        this.utenteCompratore = utenteCompratore;
    }

    public double getPrezzo(){
        return prezzo;
    }
    public int getGiorno(){
        return giornoConcerto;
    }
    public int getMese(){
        return meseConcerto;
    }
    public int getAnno(){
        return annoConcerto;
    }
    public Utente getUtente(){
        return utenteCompratore;
    }

    @Override
    public String toString() {
        return "Giorno " + giornoConcerto + " Mese " + meseConcerto + " Anno " + annoConcerto + " Prezzo " + prezzo + " euro";
    }
}