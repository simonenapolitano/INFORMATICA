import java.util.Scanner;

public class Main {
    int i=0;
    float somma=0;
    int max = 0;
    String nomemax, classemax;
    public Main(){
        Scanner input = new Scanner(System.in);
        Preside[] presidi = new Preside[3];
        presidi[0] = new Preside("Luca", "1A info", 7);
        presidi[1] = new Preside("Anna", "2A info", 10);
        presidi[2] = new Preside("Giorgio", "3A info", 2);

        System.out.println("1. Visualizza tutti gli studenti");
        System.out.println("2. Calcola la media di tutta la scuola");
        System.out.println("3. Trova lo studente con il voto più alto");
        System.out.println("4. Esci dal programma");
        int scelta = input.nextInt();
        switch(scelta){
            case 1:
                for(Preside preside : presidi){
                    System.out.println("Studente " + (i+1) + ": Nome: " + preside.getNome() + " Classe: " + preside.getClasse() + " Voto: " + preside.getVoto());
                    i++;
                }
                i=0;
                break;
            case 2:
                for(Preside preside : presidi){
                    somma += preside.getVoto();
                }
                System.out.println("La media di tutta la scuola e': " + (somma/10));
                break;
            case 3:
                for(Preside preside : presidi){
                    if(max<preside.getVoto()){
                        max = preside.getVoto();
                        nomemax = preside.getNome();
                        classemax = preside.getClasse();
                    }
                }
                System.out.println("Lo studente con il voto piu' alto e' " + nomemax + " nella classe " + classemax + " con un voto pari a " + max);
                break;
            case 4:
                System.exit(0);
        }
    }
    public static void main(String[] args) throws Exception {
        new Main();
    }
}
