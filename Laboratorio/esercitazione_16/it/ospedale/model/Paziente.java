package it.ospedale.model;
import java.time.LocalDate;

public abstract class Paziente{
    private String nome;
    private String codiceCartellaClinica;
    private Double tariffaBase;
    private LocalDate dataArrivo;
    private LocalDate dataUscita;

    public Paziente(String nome, String codiceCartellaClinica, Double tariffaBase){
        this.nome = nome;
        this.codiceCartellaClinica = codiceCartellaClinica;
        this.tariffaBase = tariffaBase;
        this.dataArrivo = LocalDate.now();
        this.dataUscita = null;
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

    public LocalDate getDataArrivo() {
        return dataArrivo;
    }

    public void setDataArrivo(LocalDate dataArrivo) {
        this.dataArrivo = dataArrivo;
    }

    public LocalDate getDataUscita() {
        return dataUscita;
    }

    public void registraUscita(){
        this.dataUscita = LocalDate.now();
    }

    public abstract Double calcolaCostoRicovero();

}