package it.acearena.model;

public abstract class Giocatore{
    private String nome;
    private String codiceIdentificativo;
    private Double tariffaBase = 12.5;
    
    public Giocatore(String nome, String codiceIdentificativo){
        this.nome = nome;
        this.codiceIdentificativo = codiceIdentificativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodiceIdentificativo() {
        return codiceIdentificativo;
    }

    public void setCodiceIdentificativo(String codiceIdentificativo) {
        this.codiceIdentificativo = codiceIdentificativo;
    }

    public Double getTariffaBase() {
        return tariffaBase;
    }

    public void setTariffaBase(Double tariffaBase) {
        this.tariffaBase = tariffaBase;
    }

    public abstract Double calcolaTariffaFinale();
}
