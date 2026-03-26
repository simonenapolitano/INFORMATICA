package it.acearena.exceptions;

public class CampiEsauritiException extends Exception {
    public CampiEsauritiException(){
        super("<!>E' stato raggiunta la capienza massima<!>");
    }
    public CampiEsauritiException(String message){
        super(message);
    }
}
