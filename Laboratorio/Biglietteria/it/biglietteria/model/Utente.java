package it.biglietteria.model;

import java.util.ArrayList;

public class Utente{
    private String nomeUtente;
    private String password;
    private boolean admin;
    private ArrayList<Biglietto> bigliettiComprati;

    public Utente(String nomeUtente, String password){
        this.nomeUtente = nomeUtente;
        this.password = password;
        bigliettiComprati = new ArrayList<Biglietto>();
    }

    public String getNomeUtente(){
        return nomeUtente;
    }
    public String getPassword(){
        return password;
    }
    public boolean isAdmin(){
        return admin;
    }
    public void setNomeUtente(String nomeUtente){
        this.nomeUtente = nomeUtente;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setAdmin(boolean admin){
        this.admin = admin;
    }
    public void addBigliettoComprato(Biglietto biglietto){
        bigliettiComprati.add(biglietto);
    }    
}