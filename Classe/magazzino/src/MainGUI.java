public class MainGUI {
    
    public static void main(String[] args) {
        Prodotti[] prodotti = new Prodotti[7];
        prodotti[0] = new Prodotti("Pasta", 12);
        prodotti[1] = new Prodotti("Riso", 8);
        prodotti[2] = new Prodotti("Biscotti", 4);
        prodotti[3] = new Prodotti("Latte", 0);
        prodotti[4] = new Prodotti("Uova", 20);
        prodotti[5] = new Prodotti("Pane", 3);
        prodotti[6] = new Prodotti("Farina", 6);
        new NegozioGUI(prodotti);
    }
}
