public abstract class Abbonamento{
    private String nomeCliente;
    private String codiceIscrizione;
    private Double prezzoBase;

    public Abbonamento(String nomeCliente, String codiceIscrizione, Double prezzoBase){
        this.nomeCliente = nomeCliente;
        this.codiceIscrizione = codiceIscrizione;
        this.prezzoBase = prezzoBase;
    }
    
    public String getNomeCliente() {
      return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
      this.nomeCliente = nomeCliente;
    }
    public String getCodiceIscrizione() {
      return codiceIscrizione;
    }
    public void setCodiceIscrizione(String codiceIscrizione) {
      this.codiceIscrizione = codiceIscrizione;
    }
    public Double getPrezzoBase() {
      return this.prezzoBase;
    }
    public void setPrezzoBase(Double prezzoBase) {
      this.prezzoBase = prezzoBase;
    }

    public abstract Double calcolaCostoMensile();
}