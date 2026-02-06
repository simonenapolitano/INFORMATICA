public class AbbonamentoCorsi extends Abbonamento{
    private Integer numeroCorsi;
    public AbbonamentoCorsi(String nomeCliente, String codiceIscrizione, Double prezzoBase, Integer numeroCorsi){
        super(nomeCliente, codiceIscrizione, prezzoBase);
        this.numeroCorsi = numeroCorsi;
    }

    @Override
    public Double calcolaCostoMensile(){
        if(numeroCorsi > 3){
            return getPrezzoBase() * 0.95;
        }
        return getPrezzoBase();
    }
}