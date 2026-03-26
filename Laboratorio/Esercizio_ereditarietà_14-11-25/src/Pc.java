public class Pc extends Computer{
    String schedaVideo;
    public Pc(String idUnivoco, double prezzo, String produttore, boolean disponibile, String sistemaOperativo, int ramGB, String schedaVideo){
        super(idUnivoco, prezzo, produttore, disponibile, sistemaOperativo, ramGB);
        this.schedaVideo = schedaVideo;
    }
    public String eseguiBenchmark(){
        return schedaVideo;
    }
}
