public class Main {
    public static void main(String[] args) {
        CentroCommerciale centroCommerciale = new CentroCommerciale(new Abbigliamento("Zara", new Prodotto("Jeans", 14.00), new Prodotto("Maglietta", 15.00)), new Ristorante("McDonalds", 2.00, new Prodotto("Hamburger", 10.00), new Prodotto("Patatine", 5.00)));
        System.out.println("Prima della campagna sconti: ");
        for(Negozio n : centroCommerciale.getListaNegozi()){
            for(Prodotto p : n.getProdotti()){
                System.out.println(p);
            }
        }
        System.out.println("---------------------------");
        centroCommerciale.avviaCampagnaSconti(10);
        for(Negozio n : centroCommerciale.getListaNegozi()){
            for(Prodotto p : n.getProdotti()){
                System.out.println(p);
            }
        }
    }
}
