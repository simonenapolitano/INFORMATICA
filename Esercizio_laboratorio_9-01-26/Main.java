import java.util.Scanner;

public class Main{
    Prodotto[] prodotti = new Prodotto[10];
    public Main(){
        Scanner scanner = new Scanner(System.in);
        int scelta, sceltaAltro;
        String sceltaProdotto;
        double prezzoTot = 0;
        prodotti[0] = new Prodotto("A0", "Patatine", 2.50, 3);
        prodotti[1] = new Prodotto("A1", "Biscotti", 1.99, 2);
        prodotti[2] = new Prodotto("A2", "Crackers", 1.50, 4);
        prodotti[3] = new Prodotto("B0", "Cioccolato", 3.50, 7);
        prodotti[4] = new Prodotto("B1", "Tramezzino", 5.50, 6);
        prodotti[5] = new Prodotto("B2", "Barretta", 3.20, 4);
        prodotti[6] = new Prodotto("C0", "Coca-Cola", 2.99, 1);
        prodotti[7] = new Prodotto("C1", "Acqua", 1.99,8);
        prodotti[8] = new Prodotto("C2", "Fanta", 2.99, 5);
        prodotti[9] = new Prodotto("D0", "Croissant", 1.99, 7);
        
        do{
            System.out.print(" [1]COMPRA QUALCOSA\n [2]ESCI DAL PROGRAMMA\nScegli: ");
            scelta = scanner.nextInt();
            scanner.nextLine();
            switch(scelta){
                case 1:
                    boolean trovato = false;
                    for (int i = 0; i < prodotti.length; i++) {
                        System.out.println("\nProdotto " + prodotti[i].getCodiceProdotto() + ":   " + prodotti[i].getNomeProdotto() + "   " + prodotti[i].getPrezzo() + " euro    " + prodotti[i].getQuantita());
                    }
                    do{
                        System.out.print("\nInserisci il codice di quello che vuoi: ");
                        sceltaProdotto = scanner.nextLine();
                        for (int i = 0; i < prodotti.length; i++) {
                            if(prodotti[i].getCodiceProdotto().equals(sceltaProdotto) && prodotti[i].getQuantita() > 0){
                                trovato = true;
                                System.out.println("\nProdotto trovato!\n" + prodotti[i].getNomeProdotto() + "  " + prodotti[i].getPrezzo() + " euro\n");
                                prodotti[i].setQuantita((prodotti[i].getQuantita()-1));
                                prezzoTot += prodotti[i].getPrezzo();
                                break;
                            } else if(prodotti[i].getCodiceProdotto().equals(sceltaProdotto) && prodotti[i].getQuantita() == 0){
                                System.out.println("Prodotto non disponibile! ");
                            } else if(i==prodotti.length && !trovato){
                                System.out.println("Codice [" + sceltaProdotto + "] non valido");
                            }
                        }
                        do{
                            System.out.println("Altro? [1]SI [0]NO");
                            sceltaAltro = scanner.nextInt();
                            scanner.nextLine();
                            if(sceltaAltro!=1 && sceltaAltro!=0){
                                System.out.println("Scelta [" + sceltaAltro + "] non valida");
                            }
                        }while(sceltaAltro!=1 && sceltaAltro!=0);
                    }while(sceltaAltro == 1);
                    if(prezzoTot>0){
                        System.out.println(String.format("Devi pagare %.2f euro", prezzoTot));
                    }
                    
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Scelta [" + scelta + "] non valida");
            }
        }while(true);
        

    }
    public static void main(String[] args){
        new Main();
    }
}