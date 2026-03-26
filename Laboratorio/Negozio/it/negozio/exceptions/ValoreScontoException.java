package it.negozio.exceptions;
public class ValoreScontoException extends Exception{
    public ValoreScontoException(String message){
        super(message);
    }
    public ValoreScontoException(){
        super("Valore sconto non valido! [1-100]");
    }
}