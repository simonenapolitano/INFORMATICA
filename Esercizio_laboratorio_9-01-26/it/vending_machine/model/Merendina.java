package it.vending_machine.model;

public class Merendina extends Prodotto {
    private boolean contieneGlutine;
    public Merendina(String codiceProdotto, String nomeProdotto, double prezzo, int quantita, boolean contieneGlutine) {
        super(codiceProdotto, nomeProdotto, prezzo, quantita);
        this.contieneGlutine = contieneGlutine;
    }
    public boolean getContieneGlutine() {
        return contieneGlutine;
    }
    public void setContieneGlutine(boolean contieneGlutine) {
        this.contieneGlutine = contieneGlutine;
    }
}
