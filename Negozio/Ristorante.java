public class Ristorante extends Negozio{
    private double prezzoCoperto;
    public Ristorante(String nome, double prezzoCoperto, Prodotto... p){
        super(nome, p);
        this.prezzoCoperto = prezzoCoperto;
    }

    @Override
    public void stampaDettagli(){
        System.out.println("Piatti disponibili: ");
        for(Prodotto prodotto : super.getListaProdotti()){
            System.out.println("Nome " + prodotto.getNome());
        }
        System.out.println("Il prezzo del coperto e' " + prezzoCoperto + " euro");
    }
}