public class Device {
    private String idUnivoco;
    private double prezzo;
    private String produttore;
    private boolean disponibile;
    public Device(String idUnivoco, double prezzo, String produttore, boolean disponibile){
        this.idUnivoco = idUnivoco;
        this.prezzo = prezzo;
        this.produttore = produttore;
        this.disponibile = disponibile;
    }
    public double getPrezzo(){
        return prezzo;
    }
    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }
    public String getProduttore(){
        return produttore;
    }
    public boolean isDisponibile(){
        return disponibile;
    }
    public String getId(){
        return idUnivoco;
    }
    public double calcolaSconto(double perc){
        double nuovoprezzo = 0;
        if(perc>=0 && perc<=1){
            nuovoprezzo = prezzo - (prezzo*perc);
        } else if(perc>=0 && perc<=100){
            nuovoprezzo = prezzo - (prezzo*(perc/100));
        } 
        return nuovoprezzo;
    }
}
