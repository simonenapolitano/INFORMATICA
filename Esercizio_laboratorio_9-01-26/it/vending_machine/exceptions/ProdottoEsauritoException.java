package it.vending_machine.exceptions;

public class ProdottoEsauritoException extends Exception{
    public ProdottoEsauritoException(String message){
        super(message);
    }
    public ProdottoEsauritoException(){
        super("Prodotto Esaurito!");
    }
}