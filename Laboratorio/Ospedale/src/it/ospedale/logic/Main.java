package it.ospedale.logic;

import java.io.IOException;
import java.util.Scanner;

import it.ospedale.helper.FileManager;
import it.ospedale.model.*;

public class Main {
    OspedaleManager manager;
    Scanner scanner = new Scanner(System.in);
    public Main(){
        try {
            manager = new OspedaleManager(FileManager.leggiDaFile("file/registro_ospedale.txt"));
        } catch (IOException e) {
            System.out.println("<!>" + e.getMessage() + "<!>");
        }
        while(true){
            System.out.println("[1]VISUALIZZA REGISTRO DI SISTEMA\n[2]AGGIUNGI PAZIENTE\n[0]ESCI\nScegli:");
            int scelta = scanner.nextInt();
            scanner.nextLine();
            switch(scelta){
                case 0:
                    System.exit(0);
                case 1:
                    for(Paziente p: manager.getPazienti()){
                        System.out.println(p + "\n");
                    }
                    break;
                case 2:
                    if(manager.getPazienti().size() + 1 > 30){
                        System.out.println("<!>L'ospedale non ha piu' posti<!>");
                        break;
                    }
                    String nome, codice;
                    int ordinario, pasto;
                    boolean ordinarioBool, pastoBool = false;
                    System.out.println("Inserisci il nome del paziente: ");
                    nome = scanner.nextLine();
                    System.out.println("Inserisci il codice del paziente: ");
                    codice = scanner.nextLine();
                    do{
                        System.out.println("Paziente ordinario[1] o premium[2]? ");
                        ordinario = scanner.nextInt();
                        if(ordinario != 1 && ordinario != 2){
                            System.out.println("Tipo di paziente non valido.");
                        }
                    }while(ordinario != 1 && ordinario != 2);
                    if(ordinario == 1){
                        do{
                            System.out.println("Pasto personalizzato[1] o no[2]? ");
                            pasto = scanner.nextInt();
                            if(pasto != 1 && pasto != 2){
                                System.out.println("Tipo di paziente non valido.");
                            }
                        }while(pasto != 1 && pasto != 2);
                        pastoBool = pasto == 1? true : false;
                    }
                    ordinarioBool = ordinario == 1? true : false;
                    String message = nome + ", " + codice + ", " + ordinarioBool + ", " + pastoBool + System.lineSeparator();
                    try {
                        FileManager.scriviSuFile("file/registro_ospedale.txt", message);
                        manager.setListaPazienti(FileManager.leggiDaFile("file/registro_ospedale.txt"));
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("<!>Scelta |" + scelta + "| non valida<!>");
            }
        }
        
    }
    public static void main(String[] args) {
        new Main();
    }
}
