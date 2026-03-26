public class CanzoneNonTrovataException extends Exception{
    public CanzoneNonTrovataException(String message){
        super(message);
    }
    public CanzoneNonTrovataException(){
        super("ERRORE: la canzone non e' stata trovata!");
    }
} 