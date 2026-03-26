public class PostiEsauritiException extends Exception {
    public PostiEsauritiException(int postiRichiesti){
        super("Richiesti " + postiRichiesti + " posti, disponibili 0");
    }
    public PostiEsauritiException(String message){
        super(message);
    }
}
