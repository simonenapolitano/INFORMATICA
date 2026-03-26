public class PazienteGiaPresenteException extends Exception {
    public PazienteGiaPresenteException(String message){
        super(message);
    }
    public PazienteGiaPresenteException(){
        super("ERRORE: Il paziente è gia presente!");
    }
}
