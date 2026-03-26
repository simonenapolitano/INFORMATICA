package it.vending_machine.logic;

import it.vending_machine.model.*;
import it.vending_machine.exceptions.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import it.vending_machine.model.Merendina;
import it.vending_machine.model.Prodotto;

public class Main{
    Prodotto[] prodotti = new Prodotto[10];
    public Main(){
        Scanner scanner = new Scanner(System.in);
        int scelta = 0, sceltaAltro;
        String sceltaProdotto;
        double prezzoTot = 0;
        prodotti[0] = new Merendina("A0", "Patatine", 2.50, 3, true);
        prodotti[1] = new Merendina("A1", "Biscotti", 1.99, 2, false);
        prodotti[2] = new Merendina("A2", "Crackers", 1.50, 4, false);
        prodotti[3] = new Merendina("B0", "Cioccolato", 3.50, 7, true);
        prodotti[4] = new Merendina("B1", "Tramezzino", 5.50, 6, true);
        prodotti[5] = new Merendina("B2", "Barretta", 3.20, 4, false);
        prodotti[6] = new Bevanda("C0", "Coca-Cola", 2.99, 1, 20);
        prodotti[7] = new Bevanda("C1", "Acqua", 1.99,8, 10);
        prodotti[8] = new Bevanda("C2", "Fanta", 2.99, 5, 25);
        prodotti[9] = new Bevanda("D0", "Croissant", 1.99, 7, 30);
        
        do{
            try {
                System.out.print(" [1]COMPRA QUALCOSA\n [2]ESCI DAL PROGRAMMA\nScegli: ");
                scelta = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\nErrore: devi inserire un numero.\n");
                scanner.nextLine();
                continue;
            } 
            switch(scelta){
                case 1:
                    boolean trovato = false;
                    do{
                        for (int i = 0; i < prodotti.length; i++) {
                            
                            try {
                                System.out.println("\nProdotto " + prodotti[i].getCodiceProdotto() + ":   " + prodotti[i].getNomeProdotto() + "   " + prodotti[i].getPrezzo() + " euro    " + prodotti[i].getQuantita());
                            } catch (NullPointerException e) {
                                System.out.println("\nSlot " + (i+1) + " vuoto\n");
                            }
                        }
                        
                        try {
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
                                    throw new ProdottoEsauritoException("\nProdotto " + prodotti[i].getNomeProdotto() + " esaurito!\n");
                                } else if(i==prodotti.length-1 && !trovato){
                                    System.out.println("\nCodice [" + sceltaProdotto + "] non valido\n");
                                }
                            }
                        } catch (ProdottoEsauritoException e) {
                            System.out.println(e.getMessage());
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
                    System.out.println("\nSCONTRINO");
                    if (prezzoTot > 0) {
                        System.out.println(String.format("Totale da pagare: %.2f euro", prezzoTot));
                    }
                    
                    break;
                case 2:
                    System.exit(0);
                    scanner.close();
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