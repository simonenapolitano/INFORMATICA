public class Abbigliamento extends Negozio{
    public Abbigliamento(String nome){
        super(nome);
    }
    public void applicaSaldi(int percentuale) throws ValoreScontoException{
        if(percentuale < 1 || percentuale > 100){
            throw new ValoreScontoException();
        }
        for(Prodotto prodotto : super.getListaProdotti()){
            prodotto.setPrezzo(prodotto.getPrezzo()*(1-(percentuale/100)));
        }
    }

    @Override
    public void stampaDettagli(){
        System.out.println("Dettagli stampati!");
    }
}