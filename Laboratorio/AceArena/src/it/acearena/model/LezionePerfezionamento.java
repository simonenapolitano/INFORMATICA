package it.acearena.model;

public class LezionePerfezionamento extends Giocatore {
    private Integer durataMinuti;

    public LezionePerfezionamento(String nome, String codiceIdentificativo, Integer durataMinuti){
        super(nome, codiceIdentificativo);
        this.durataMinuti = durataMinuti;
    }

    public Integer getDurataMinuti() {
        return durataMinuti;
    }

    public void setDurataMinuti(Integer durataMinuti) {
        this.durataMinuti = durataMinuti;
    }


    @Override
    public Double calcolaTariffaFinale() {
        if(durataMinuti > 45){
            return super.getTariffaBase() + (super.getTariffaBase()* 0.75);
        }
        return super.getTariffaBase();
    }
}
