package it.model;
public class Cittadino{
    private String nome;
    private String cognome;
    private int eta;
    private String codiceFiscale;

    public Cittadino(String nome, String cognome, int eta, String codiceFiscale){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.codiceFiscale = codiceFiscale;
    }

    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public int getEta(){
        return eta;
    }
    public String getCodiceFiscale(){
        return codiceFiscale;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    public void setEta(int eta){
        this.eta = eta;
    }
    public void setCodiceFiscale(String codiceFiscale){
        this.codiceFiscale = codiceFiscale;
    }
    
    @Override
    public String toString() {
        return "Nome " + nome + "   Cognome " + cognome;
    }
}