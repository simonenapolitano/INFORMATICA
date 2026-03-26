package it.vending_machine.model;

public class Bevanda extends Prodotto {
    private double temperatura;
    public Bevanda(String codiceProdotto, String nomeProdotto, double prezzo, int quantita, double temperatura) {
        super(codiceProdotto, nomeProdotto, prezzo, quantita);
        this.temperatura = temperatura;
    }
    public double getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
}
