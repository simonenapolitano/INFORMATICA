import java.util.Scanner;
import java.util.Random;
public class Main {
    public Main(){
        Scanner s = new Scanner(System.in);
        Coda coda = new Coda();
        Random r = new Random();

        while (true) {
            System.out.println("[1]Registra un nuovo cliente(Aggiungi alla coda)\n[2]Servi una persona(Togli dalla coda)\n[3]Conta il numero di persone in coda\n[4]Stampa nome e cognome dell'ultimo arrivato\n[5]Stampa l'incasso totale\n[0]Esci\nScegli:");
            int scelta = s.nextInt();
            s.nextLine();
            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il nome: ");
                    String nome = s.nextLine();
                    System.out.println("Inserisci il cognome: ");
                    String cognome = s.nextLine();
                    System.out.println("Inserisci l'importo da pagare: ");
                    Double importo = s.nextDouble();
                    s.nextLine();
                    coda.push(new Persona(nome, cognome, importo));
                    break;
                case 2:
                    System.out.println(coda.pop());
                    break;
                case 3:
                    int cont = coda.contaPersone();
                    if(cont == 0){
                        System.out.println("La coda è vuota.");
                    } else if(cont == 1){
                        System.out.println("La coda ha 1 persona");
                    } else{
                        System.out.println("La coda ha " + cont + " persone.");
                    }
                    break;  
                case 4:
                    System.out.println(coda.stampaUltimo());
                    break;
                case 5:
                    System.out.println("L'incasso fino ad adesso e' di " + coda.getIncasso() + " euro");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("<!>Scelta |" + scelta + "| non valida<!>");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
