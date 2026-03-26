import java.util.Scanner;
public class GestionePila {
    public GestionePila(){
        Scanner scanner = new Scanner(System.in);
        Pila pila = new Pila();
        int scelta;
        do{
            System.out.println("[1] INSERISCI\n[2] ESTRAI\n[3] STAMPA\n[0]ESCI\nScegli:");
            scelta = scanner.nextInt();
            scanner.nextLine();
            switch (scelta) {
                case 1:
                    System.out.println("Inserisci la targa: ");
                    String targa = scanner.nextLine();
                    System.out.println("Inserisci la cilindrata: ");
                    int cil = scanner.nextInt();
                    pulisciBuffer(scanner);
                    pila.push(targa, cil);
                    break;
                case 2:
                    String s = pila.pop();
                    if(s!="Lista vuota"){
                        System.out.println("Eliminata auto con targa: " + s);
                    } else{
                        System.out.println("<!>" + s + "<!>");
                    }
                    
                    break;
                case 3:
                    System.out.println(pila);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Scelta [" + scelta + "] non valida");
                    break;
            }
        
        }while(true);
    }
    public static void main(String[] args) {
        new GestionePila();
    }

    private void pulisciBuffer(Scanner s){
        s.nextLine();
    }
}
