package it.negozio.model;
import it.negozio.exceptions.ValoreScontoException;

public class Abbigliamento extends Negozio{
    public Abbigliamento(String nome, Prodotto... p){
        super(nome, p);
    }
    public void applicaSaldi(double percentuale) throws ValoreScontoException{
        if(percentuale < 1 || percentuale > 100){
            throw new ValoreScontoException();
        }
        for(Prodotto prodotto : super.getListaProdotti()){
            prodotto.setPrezzo(prodotto.getPrezzo()*(1-(percentuale/100)));
        }
    }

    @Override
    public void stampaDettagli(){
        //
    }
}