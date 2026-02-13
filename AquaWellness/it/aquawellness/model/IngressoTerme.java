public class IngressoTerme extends Benessere {
    private boolean noleggioKitRelax;

    public IngressoTerme(String nomeOspite, String codicePrenotazione, Double tariffaBase, boolean noleggioKitRelax){
        super(nomeOspite, codicePrenotazione, tariffaBase);
        this.noleggioKitRelax = noleggioKitRelax;
    }

    public boolean isNoleggioKitRelax() {
        return noleggioKitRelax;
    }

    public void setNoleggioKitRelax(boolean noleggioKitRelax) {
        this.noleggioKitRelax = noleggioKitRelax;
    }

    public Double calcolaTariffaGiornaliera(){
        if(noleggioKitRelax){
            return super.getTariffaBase() + 10.0;
        } else{
            return super.getTariffaBase();
        }
    }
}
