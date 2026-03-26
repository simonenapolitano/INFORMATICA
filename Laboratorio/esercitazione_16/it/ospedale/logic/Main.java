package it.ospedale.logic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import it.ospedale.helper.FileManager;
import it.ospedale.model.Paziente;

public class Main {
    Scanner s = new Scanner(System.in);
    public Main(){
        while (true){
            System.out.println("[1]VISUALIZZA IL REGISTRO DI SISTEMA\n[2]AGGIUNGI UN PAZIENTE\n[0]ESCI");
            int scelta = s.nextInt();
            s.nextLine();
            switch(scelta){
                case 0:
                    s.close();
                    System.exit(0);
                case 1:
                    try {
                        System.out.println("\n\n");
                        ArrayList<Paziente> pazienti = FileManager.leggiDaFile("it/ospedale/file/registro_ospedale.txt");
                        for(Paziente p : pazienti){
                            System.out.println(p + "\n");
                        }
                    } catch (IOException e) {
                        System.out.println("ERRORE:\t" + e.getMessage());
                    }
                    break;
                case 2:
                    String nome, codiceDiCartellaClinica, ricovero, pasto = "";
                    System.out.println("Inserisci il nome del paziente: ");
                    nome = s.nextLine();
                    System.out.println("Inserisci il codice di cartella clinica del paziente: ");
                    codiceDiCartellaClinica = s.nextLine();
                    do{
                        System.out.println("Il paziente è un ricovero ordinario oppure premium?: ");
                        ricovero = s.nextLine();
                        if(!ricovero.equals("ordinario") && !ricovero.equals("premium")){
                            System.out.println("Tipo di paziente non valido. Reinserire: \n\n");
                        }
                    }while(!ricovero.equals("ordinario") && !ricovero.equals("premium"));
                    boolean idPaziente = ricovero.equals("ordinario")? true : ricovero.equals("premium")? false : null;
                    if(ricovero.equals("ordinario")){
                        do{
                            System.out.println("Il paziente ha un pasto personalizzato?[si/no]: ");
                            pasto = s.nextLine();
                            if(!pasto.equals("si") && !pasto.equals("no")){
                                System.out.println("Risposta non valida. Reinserire: \n\n");
                            }
                        }while(!pasto.equals("si") && !pasto.equals("no"));
                    }
                    boolean pastoPaziente = pasto.equals("si")? true : pasto.equals("no")? false : false;
                    String message = nome + ", " + codiceDiCartellaClinica + ", " + idPaziente + ", " + pastoPaziente + System.lineSeparator();
                    try {
                        FileManager.scriviSuFile("it/ospedale/file/registro_ospedale.txt", message, true);
                    } catch (IOException e) {
                        System.out.println("ERRORE:\t" + e.getMessage());
                    }   
                    
                    break;
            }
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}
