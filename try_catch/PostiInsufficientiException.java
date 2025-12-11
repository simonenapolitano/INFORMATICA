public class PostiInsufficientiException extends Exception {
    public PostiInsufficientiException(int postiRichiesti, int postiDisponibili){
        super("Richiesti " + postiRichiesti + " posti, disponibili " + postiDisponibili);
    }
    public PostiInsufficientiException(String message){
        super(message);
    }
}