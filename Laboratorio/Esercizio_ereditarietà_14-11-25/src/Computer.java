public class Computer extends Device {
    String sistemaOperativo;
    int ramGB;
    public Computer(String idUnivoco, double prezzo, String produttore, boolean disponibile, String sistemaOperativo, int ramGB){
        super(idUnivoco, prezzo, produttore, disponibile);
        this.sistemaOperativo = sistemaOperativo;
        this.ramGB = ramGB;
    }
    public String avviaOS(){
        return sistemaOperativo;
    }
    public void eseguiProgramma(String nome){
        System.out.println(nome + " in esecuzione!");;
    }
}
