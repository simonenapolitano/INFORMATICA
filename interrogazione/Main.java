import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    Scanner scanner = new Scanner(System.in);
    Magazzino magazzino = new Magazzino(new Prodotto("Prodotto1", 12, 3.50), new Prodotto("Prodotto2", 14, 4.99), new Prodotto("Prodotto3", 11, 10.99), new Prodotto("Prodotto4", 7, 15.00), new Prodotto("Prodotto5", 8, 13.99));
    ArrayList<Prodotto> scontrino = new ArrayList<Prodotto>();
    public Main(){
        
        do{
            for (Prodotto prodotto : magazzino.getProdotti()) {
                System.out.println(prodotto);
            }
            System.out.println("[1]COMPRA\n[2]EMETTI SCONTRINO\n[3]ESCI");
            int scelta = scanner.nextInt();
            scanner.nextLine();
            switch(scelta){
                case 1:
                    System.out.println("Inserisci il nome del prodotto: ");
                    String sceltaProdotto = scanner.nextLine();
                    boolean trovato = false;
                    for (Prodotto prodotto : magazzino.getProdotti()) {
                        if(prodotto.getNome().equals(sceltaProdotto)){
                            trovato = true;

                            if(prodotto.getQuantita() > 0){
                                System.out.println("\nProdotto " + prodotto + " comprato\n");
                                prodotto.setQuantita(prodotto.getQuantita()-1);

                                boolean ricerca = false;
                                
                                for(Prodotto p : scontrino){
                                    if(p.getNome().equals(prodotto.getNome())){
                                        p.setQuantita(p.getQuantita() + 1);
                                        ricerca = true;
                                        break;
                                    }
                                }

                                if(!ricerca){
                                    scontrino.add(new Prodotto(prodotto.getNome(), 1, prodotto.getPrezzo()));
                                }
                                
                            } else{
                                System.out.println("Prodotto non disponibile\n");
                            }
                        }
                    }
                    
                    if(!trovato){
                        System.out.println("Prodotto |" + sceltaProdotto + "| non trovato!\n\n");
                    }
                    break;
                case 2:
                    if(scontrino.size()>0){
                        for (Prodotto p : scontrino) {
                            double prezzoTotale = p.getPrezzo() * p.getQuantita();
                            System.out.println(p.getNome() + " x" + p.getQuantita() + " " + prezzoTotale + " euro");
                        }
                    } else{
                        System.out.println("Compra prima qualcosa!\n");
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Scelta |" + scelta + "| non valida!");
            }
        }while(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
