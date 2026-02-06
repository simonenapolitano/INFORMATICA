package it.negozio.model;
import java.util.ArrayList;

public abstract class Negozio{
    private String nome;
    private ArrayList<Prodotto> prodotti;

    public Negozio(String nome, Prodotto... p){
        this.nome = nome;
        prodotti = new ArrayList<>();

        for(Prodotto prodotto : p){
            prodotti.add(prodotto);
        }
    }
    public String getNome(){
        return nome;
    }
    public ArrayList<Prodotto> getListaProdotti(){
        return prodotti;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void addProdotto(Prodotto prodotto){
        prodotti.add(prodotto);
    }
    public abstract void stampaDettagli();
}