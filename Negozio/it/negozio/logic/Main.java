import it.negozio.model.Abbigliamento;
import it.negozio.model.CentroCommerciale;
import it.negozio.model.Prodotto;
import it.negozio.model.Ristorante;

public class Main{
    public Main(){
        CentroCommerciale centroCommerciale = new CentroCommerciale();
        centroCommerciale.registraNegozio(new Abbigliamento("Zara", new Prodotto("Jeans", 40.99), new Prodotto("Maglia", 50.99), new Prodotto("Pantaloni", 30.50)));
        centroCommerciale.registraNegozio(new Ristorante("Bagai", 40, new Prodotto("Pizza", 6.50), new Prodotto("Panino", 7.99), new Prodotto("Coca-Cola", 2.50)));
        System.out.println("Negozi prima della campagna sconti: ");
        centroCommerciale.stampaNegozi();
        System.out.println("\nNegozi dopo la campagna sconti: ");
        centroCommerciale.avviaCampagnaSconti(25.0);
        centroCommerciale.stampaNegozi();
    }
    public static void main(String[] args) {
        new Main();
    }
}