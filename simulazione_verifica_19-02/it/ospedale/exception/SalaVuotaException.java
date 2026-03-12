public class SalaVuotaException extends Exception {
    public SalaVuotaException(String message){
        super(message);
    }
    public SalaVuotaException(){
        super("ERRORE: La sala e' vuota!");
    }
}
