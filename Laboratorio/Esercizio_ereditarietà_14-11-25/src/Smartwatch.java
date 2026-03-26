public class Smartwatch extends Indossabile {
    String cinturino;
    int cardioFrequenza;
    public Smartwatch(String idUnivoco, double prezzo, String produttore, boolean disponibile, String cinturino){
        super(idUnivoco, prezzo, produttore, disponibile);
        this.cinturino = cinturino;
    }
    public int monitoraBattito(){
        return cardioFrequenza;
    }
}
