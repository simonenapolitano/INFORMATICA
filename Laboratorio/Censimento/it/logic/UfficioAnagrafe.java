package it.logic;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import it.exceptions.CittadinoMinorenneException;
import it.model.Cittadino;

public class UfficioAnagrafe{
    ArrayList<Cittadino> registro = new ArrayList<Cittadino>();

    public UfficioAnagrafe(){
        Scanner scanner = new Scanner(System.in);
        int scelta, sceltaDettagli = 0;
        registro.add(new Cittadino("Mario", "Rossi", 20, "1"));
        registro.add(new Cittadino("Luca", "Verdi", 19, "2"));
        registro.add(new Cittadino("Marco", "Gialli", 17, "3"));
        registro.add(new Cittadino("Andrea", "Di Santo", 25, "4"));
        do{
            for(int i=0; i < registro.size(); i++){
                System.out.println(String.valueOf((i+1)) + " " + registro.get(i));
            }
            System.out.println("\n[1]VISUALIZZA I DETTAGLI COMPLETI\n[2]ESCI DAL PROGRAMMA");
            try {
                scelta = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Devi inserire un numero!");
                continue;
            }
            switch(scelta){
                case 1:
                    do{
                        try {
                            System.out.println("Inserisci il numero del cittadino che vuoi vedere: ");
                            sceltaDettagli = scanner.nextInt();
                            sceltaDettagli-=1;
                            try {
                                try {
                                    if(registro.get(sceltaDettagli).getEta() < 18){
                                        throw new CittadinoMinorenneException();
                                    }
                                } catch (CittadinoMinorenneException e) {
                                    System.out.println(e.getMessage());
                                    continue;
                                }
                                System.out.println(registro.get(sceltaDettagli) + "    Eta' " +  registro.get(sceltaDettagli).getEta() + "    Codice Fiscale " + registro.get(sceltaDettagli).getCodiceFiscale() + "\n");

                                if(sceltaDettagli < 0 || sceltaDettagli > registro.size()){
                                    throw new IndexOutOfBoundsException("Cittadino " + sceltaDettagli + " non esistente!");
                                }
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println(e.getMessage());
                                continue;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Devi inserire un numero!");
                            continue;
                        }
                    }while(sceltaDettagli < 0 || sceltaDettagli > registro.size());
                    break;
                case 2:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Scelta [" + scelta + "] non valida!");
            }

        }while(true);   
    }

    public static void main(String[] args) {
        new UfficioAnagrafe();
    }
}
