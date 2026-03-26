package it.fitflow.exception;

public class CapienzaMassimaException extends Exception{
    public CapienzaMassimaException(String message){
        super(message);
    }
    public CapienzaMassimaException(){
        super("La palestra ha raggiunto la massima capienza di iscritti!");
    }
}
