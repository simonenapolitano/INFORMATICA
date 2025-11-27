import java.util.Scanner;

public class MainApp {
    Articolo[] panini = new Articolo[3];
    Articolo[] bibite = new Articolo[3];
    Articolo temp = new Articolo(null, 0);
    double prezzoTotale;
    Scanner input = new Scanner(System.in);
    public MainApp(){
        int paninoBibita, scelta, contPanini=0, contBibite=0, quantita;
        String scontrino = "";
        panini[0] = new Articolo("Panino", 2.00);
        panini[1] = new Articolo("Panino completo", 2.50);
        panini[2] = new Articolo("Piadina", 3.00);
        bibite[0] = new Articolo("Coca-cola", 2.00);
        bibite[1] = new Articolo("Acqua", 0.80);
        bibite[2] = new Articolo("Fanta", 2.00);
        do {
            System.out.println("[1]Visualizza panini");
            System.out.println("[2]Visualizza bibite");
            System.out.println("[3]Visualizza scontrino ed esci");
            System.out.println("Scegli:");
            scelta=input.nextInt();
            switch (scelta) {
                case 1:
                    for(int i = 0; i < panini.length - 1; i++){
                        for(int j = 0; j <  panini.length - 1; j++){
                            if(panini[j].getPrezzo() < panini[j+1].getPrezzo()){
                                temp = panini[j];
                                panini[j] = panini[j + 1];
                                panini[j+1] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < panini.length; i++) {
                        System.out.println("Panino " + (i+1) + ": " + panini[i].getNome() + "   " + panini[i].getPrezzo() +" euro(iva inclusa di " + (panini[i].getPrezzo() * panini[i].getIva()) + " euro)");
                    }
                    do{
                        System.out.println("Inserisci il numero del panino che vuoi: ");
                        paninoBibita = input.nextInt();
                        if(paninoBibita>panini.length || paninoBibita<=0){
                            System.out.println("Scelta non valida.");
                        }
                    }while(paninoBibita>panini.length || paninoBibita<=0);
                    System.out.println("Quanti?");
                    quantita = input.nextInt();
                    contPanini += quantita;
                    prezzoTotale += quantita * panini[paninoBibita-1].getPrezzo();
                    scontrino += panini[paninoBibita-1].getNome() + " " + quantita + " " + (quantita*panini[paninoBibita-1].getPrezzo()) + "\n"; 
                    break;
                case 2:
                    for(int i = 0; i < bibite.length - 1; i++){
                        for(int j = 0; j <  bibite.length - 1; j++){
                            if(bibite[j].getPrezzo() < bibite[j+1].getPrezzo()){
                                temp = bibite[j];
                                bibite[j] = bibite[j + 1];
                                bibite[j+1] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < bibite.length; i++) {
                        System.out.println("Bibita " + (i+1) + ": " + bibite[i].getNome() + "   " + bibite[i].getPrezzo() +" euro(iva inclusa di " + (bibite[i].getPrezzo() * bibite[i].getIva()) + " euro)");
                    }
                    do{
                        System.out.println("Inserisci il numero della bibita che vuoi: ");
                        paninoBibita = input.nextInt();
                        if(paninoBibita>bibite.length || paninoBibita<=0){
                            System.out.println("Scelta non valida.");
                        }
                    }while(paninoBibita>bibite.length || paninoBibita<=0);
                    System.out.println("Quanti?");
                    quantita = input.nextInt();
                    contBibite += quantita;
                    prezzoTotale += quantita * bibite[paninoBibita-1].getPrezzo();
                    scontrino += bibite[paninoBibita-1].getNome() + " " + quantita + " " + (quantita*bibite[paninoBibita-1].getPrezzo()) + "\n";
                    break;
                case 3:
                    if(contPanini>2 && contBibite>1){
                    System.out.println("Scontrino: " + scontrino);
                    System.out.println("Prezzo totale(con sconto del 10%): " + (prezzoTotale * 0.9) + " (senza sconto " + prezzoTotale + " euro)");
                    } else{
                        System.out.println("Scontrino: " + scontrino);
                        System.out.println("Prezzo totale: " + prezzoTotale);
                    }
                    return;
                default:
                    System.out.println("Scelta '" + scelta + "' non valida");
            }
        } while (true);
    }
    public static void main(String[] args) throws Exception {
        new MainApp();
    }
}