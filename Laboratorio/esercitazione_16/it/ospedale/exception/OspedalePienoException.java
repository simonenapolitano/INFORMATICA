package it.ospedale.exception;
public class OspedalePienoException extends Exception {
    public OspedalePienoException(String message){
        super(message);
    }
    public OspedalePienoException(){
        super("<!>L'ospedale non ha posti disponibili<!>");
    }
}
