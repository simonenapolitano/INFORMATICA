public abstract class Benessere{
    private String nomeOspite;
    private String codicePrenotazione;
    private Double tariffaBase;

    public Benessere(String nomeOspite, String codicePrenotazione, Double tariffaBase){
        this.nomeOspite = nomeOspite;
        this.codicePrenotazione = codicePrenotazione;
        this.tariffaBase = tariffaBase;
    }

    public String getNomeOspite() {
        return nomeOspite;
    }

    public void setNomeOspite(String nomeOspite) {
        this.nomeOspite = nomeOspite;
    }

    public String getCodicePrenotazione() {
        return codicePrenotazione;
    }

    public void setCodicePrenotazione(String codicePrenotazione) {
        this.codicePrenotazione = codicePrenotazione;
    }

    public Double getTariffaBase() {
        return tariffaBase;
    }

    public void setTariffaBase(Double tariffaBase) {
		this.tariffaBase = tariffaBase;
	}

    public abstract Double calcolaTariffaGiornaliera();
}