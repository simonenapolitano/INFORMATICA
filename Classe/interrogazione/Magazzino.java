import java.util.ArrayList;

public class Magazzino {
    ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();

    public Magazzino(Prodotto... p){
        for (Prodotto prodotto : p) {
            prodotti.add(prodotto);
        }
    }
    public ArrayList<Prodotto> getProdotti(){
        return prodotti;
    }
    public void addProdotti(Prodotto... p){
        for (Prodotto prodotto : p) {
            prodotti.add(prodotto);
        }
    }
}
