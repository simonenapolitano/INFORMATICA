public class PacchettoMassaggi extends Benessere {
    private Integer durataTrattamento;

    public PacchettoMassaggi(String nomeOspite, String codicePrenotazione, Double tariffaBase, Integer durataTrattamento){
        super(nomeOspite, codicePrenotazione, tariffaBase);
        this.durataTrattamento = durataTrattamento;
    }

    public Integer getDurataTrattamento() {
        return durataTrattamento;
    }

    public void setDurataTrattamento(Integer durataTrattamento) {
        this.durataTrattamento = durataTrattamento;
    }

    public Double calcolaTariffaGiornaliera(){
        if(durataTrattamento > 50){
            return super.getTariffaBase() + (super.getTariffaBase()*0.8);
        } else{
            return super.getTariffaBase();
        }
    } 
}
