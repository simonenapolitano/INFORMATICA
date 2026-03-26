import java.util.Scanner;
public class Main {
    Scanner input = new Scanner(System.in);
    public Main(){
        GestorePrenotazioni gestorePrenotazioni = new GestorePrenotazioni(10, 10);
        do{
            System.out.println("[1]PRENOTA\n[2]ESCI");
            int scelta = input.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Quanti ne vuoi prenotare? ");
                    int numeroPrenotati = input.nextInt();
                    gestorePrenotazioni.prenota(numeroPrenotati);
                    break;
                case 2:
                    System.exit(0);
                default:
                    break;
            }
        }while(true);
        
    }
    public static void main(String[] args) {
        new Main();
    }
}
