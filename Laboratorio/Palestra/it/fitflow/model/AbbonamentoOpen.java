public class AbbonamentoOpen extends Abbonamento {
    private boolean accessoSpa;
    public AbbonamentoOpen(String nomeCliente, String codiceIscrizione, Double prezzoBase, boolean accessoSpa){
        super(nomeCliente, codiceIscrizione, prezzoBase);
        this.accessoSpa = accessoSpa;
    }
    @Override
    public Double calcolaCostoMensile(){
        return super.getPrezzoBase() + 15; 
    }

    public boolean getAccessoSpa() {
      return accessoSpa;
    }
    public void setAccessoSpa(boolean accessoSpa) {
      this.accessoSpa = accessoSpa;
    }
}
