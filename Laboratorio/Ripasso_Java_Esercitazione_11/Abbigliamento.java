public class Abbigliamento extends Negozio {
    public Abbigliamento(String nome, Prodotto... prodotti){
        super(nome, prodotti);
    }
    public void applicaSaldi(double percentuale) throws ValoreScontoException{
            for(Prodotto p : super.getProdotti()){
                p.setPrezzo(p.getPrezzo() * (1 - (percentuale/100)));
            }
            if(percentuale < 0 || percentuale > 100){
                throw new ValoreScontoException();
            }
    }
    @Override
    public void stampaDettagli() {
        //pass
    }
}
