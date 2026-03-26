package it.exceptions;

public class CittadinoMinorenneException extends Exception {
    public CittadinoMinorenneException(String message){
        super(message);
    }
    public CittadinoMinorenneException(){
        super("Attenzione: il cittadino selezionato e' minorenne");
    }
}