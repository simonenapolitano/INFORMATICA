package it.ospedale.exception;

public class OspedalePienoException extends Exception {
    public OspedalePienoException(){
        super("<!>L'ospedale non ha piu' posti<!>");
    }
    public OspedalePienoException(String message){
        super(message);
    }
}
