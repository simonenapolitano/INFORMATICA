package it.ospedale.model;

import java.time.LocalDate;

public abstract class Paziente {
    private String nome;
    private String codiceCartellaClinica;
    private Double tariffaBase;
    private LocalDate dataArrivo;
       
    public Paziente(String nome, String codiceCartellaClinica){
        this.nome = nome;
        this.codiceCartellaClinica = codiceCartellaClinica;
        this.dataArrivo = LocalDate.now();
    }

    public LocalDate getDataArrivo() {
        return dataArrivo;
    }

    public void setDataArrivo(LocalDate dataArrivo) {
        this.dataArrivo = dataArrivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodiceCartellaClinica() {
        return codiceCartellaClinica;
    }

    public void setCodiceCartellaClinica(String codiceCartellaClinica) {
        this.codiceCartellaClinica = codiceCartellaClinica;
    }

    public Double getTariffaBase() {
        return tariffaBase;
    }

    public void setTariffaBase(Double tariffaBase) {
        this.tariffaBase = tariffaBase;
    }

    public abstract Double calcolaCostoRicovero();

    @Override
    public String toString() {
        return "Nome: " + nome + " Codice di cartella clinica: " + codiceCartellaClinica;
    }
}
