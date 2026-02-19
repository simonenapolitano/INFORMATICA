public class LimiteDurataSuperatoException extends Exception{
    public LimiteDurataSuperatoException(String message){
        super(message);
    }
    public LimiteDurataSuperatoException(){
        super("ERRORE: Il limite della durata in secondi è stato superato!");
    }
} 