package it.vending_machine.model;
public class Prodotto{
    private String codiceProdotto;
    private String nomeProdotto;
    private double prezzo;
    private int quantita;

    public Prodotto(String codiceProdotto, String nomeProdotto, double prezzo, int quantita){
        this.codiceProdotto = codiceProdotto;
        this.nomeProdotto = nomeProdotto;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public String getCodiceProdotto(){
        return codiceProdotto;
    }
    public String getNomeProdotto(){
        return nomeProdotto;
    }
    public double getPrezzo(){
        return prezzo;
    }
    public int getQuantita(){
        return quantita;
    }

    public void setCodiceProdotto(String codiceProdotto){
        this.codiceProdotto = codiceProdotto;
    }
    public void setNomeProdotto(String nomeProdotto){
        this.nomeProdotto = nomeProdotto;
    }
    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }
    public void setQuantita(int quantita){
        this.quantita = quantita;
    }
}