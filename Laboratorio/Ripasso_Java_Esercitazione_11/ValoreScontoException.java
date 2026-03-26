public class ValoreScontoException extends Exception {
    public ValoreScontoException(String message){
        super(message);
    }
    public ValoreScontoException(){
        super("Il valore dello sconto non e' valido!(0-100)");
    }
}
