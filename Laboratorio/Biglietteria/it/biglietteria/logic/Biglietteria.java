package it.biglietteria.logic;
import java.util.ArrayList;
import java.util.Scanner;

import it.biglietteria.model.Utente;

public class Biglietteria{
    ArrayList<Utente> utentiRegistrati = new ArrayList<Utente>();
    Utente utenteAttuale;
    Scanner scanner = new Scanner(System.in);
    public Biglietteria(){
        int scelta;
        do{
            System.out.println("MENU");
            System.out.println("[1] REGISTRATI");
            System.out.println("[2] ACCEDI");
            System.out.println("[3] ESCI");
            scelta = scanner.nextInt();
            scanner.nextLine();
            switch(scelta){
                case 1:
                    registrazione();
                    break;
                case 2:
                    if(accesso()){
                        utenteAttuale.setAdmin(true);
                        String message = utenteAttuale.isAdmin()? "[1] MOSTRA BIGLIETTI DISPONIBILI\n[2] COMPRA BIGLIETTO\n[3] MOSTRA BIGLIETTI COMPRATI\n[4] AGGIUNGI BIGLIETTO\n[5] RIMUOVI BIGLIETTO" : "[1] MOSTRA BIGLIETTI DISPONIBILI\n[2] COMPRA BIGLIETTO\n[3] MOSTRA BIGLIETTI COMPRATI"; 
                        /*System.out.println("[1] MOSTRA BIGLIETTI DISPONIBILI");
                        System.out.println("[2] COMPRA BIGLIETTO");
                        System.out.println("[3] MOSTRA BIGLIETTI COMPRATI");
                        if(utenteAttuale.isAdmin()){
                            System.out.println("[4] AGGIUNGI BIGLIETTO");
                            System.out.println("[5] RIMUOVI BIGLIETTO");
                        }*/
                       System.out.println(message);
                        scelta = scanner.nextInt();
                        scanner.nextLine();
                        if(utenteAttuale.isAdmin()){
                            switch(scelta){
                                case 1:
                                    
                                    break;
                                case 2:

                                    break;
                                case 3:

                                    break;
                                case 4:

                                    break;
                                case 5:

                                    break;
                                default:
                                    

                            }
                        } else{
                            switch(scelta){
                                case 1:
                                    
                                    break;
                                case 2:

                                    break;
                                case 3:

                                    break;
                                default:
                                    

                            }
                        }
                        
                    } else{
                        System.out.println("Accesso fallito!");
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }while(true);
        
    }

    public void registrazione(){
        String nomeUtente, password;
        System.out.println("Inserisci il nome utente: ");
        nomeUtente = scanner.nextLine();
        System.out.println("Inserisci la password: ");
        password = scanner.nextLine();
        utentiRegistrati.add(new Utente(nomeUtente, password));
        System.out.println("Registrazione effettuata con successo!");
    }

    public boolean accesso(){
        String nomeUtente, password;
        System.out.println("Inserisci il nome utente: ");
        nomeUtente = scanner.nextLine();
        System.out.println("Inserisci la password: ");
        password = scanner.nextLine();
        for (Utente utente : utentiRegistrati) {
            if(utente.getNomeUtente().equals(nomeUtente) && utente.getPassword().equals(password)){
                utenteAttuale = utente;
                return true;
            }
        }   
        return false;
    }

    public static void main(String[] args) {
        new Biglietteria();
    }
}