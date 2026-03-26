public class Ristorante extends Negozio {
    private double prezzoCoperto;
    public Ristorante(String nome, double prezzoCoperto, Prodotto... prodotti){
        super(nome, prodotti);
        this.prezzoCoperto = prezzoCoperto;
    }
    @Override
    public void stampaDettagli() {
        System.out.println("Prezzo coperto: " + prezzoCoperto + " euro.\nLista piatti: ");
        for (Prodotto p : super.getProdotti()) {
            System.out.println(p);
        }
    }
}