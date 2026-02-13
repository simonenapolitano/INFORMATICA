public class LimiteOspitiRaggiuntiException extends Exception {
    public LimiteOspitiRaggiuntiException(String message){
        super(message);
    }
    public LimiteOspitiRaggiuntiException(){
        super("Il limite degli ospiti e' stato raggiunto. Riprovare piu' tardi!");
    }
}
