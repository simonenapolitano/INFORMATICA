package it.acearena.model;

public class AffittoSemplice extends Giocatore {
    private boolean noleggioRacchetta;

    public AffittoSemplice(String nome, String codiceIdentificativo, boolean noleggioRacchetta){
        super(nome, codiceIdentificativo);
        this.noleggioRacchetta = noleggioRacchetta;
    }

    public boolean isNoleggioRacchetta() {
        return noleggioRacchetta;
    }

    public void setNoleggioRacchetta(boolean noleggioRacchetta) {
        this.noleggioRacchetta = noleggioRacchetta;
    }
    
    @Override
    public Double calcolaTariffaFinale() {
        if(noleggioRacchetta){
            return super.getTariffaBase() + 5;
        }
        return super.getTariffaBase();
    }
}
