package it.ospedale.helper;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import it.ospedale.model.*;
import java.util.List;

public class FileManager {
    public static void scriviSuFile(String percorso, String message) throws IOException{
        Path path = Path.of(percorso);
        Files.writeString(path, message, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

    public static ArrayList<Paziente> leggiDaFile(String percorso) throws IOException{
        Path path = Path.of(percorso);
        List<String> tutteLeRighe = Files.readAllLines(path);
        ArrayList<Paziente> pazienti = new ArrayList<Paziente>();
        for (String riga : tutteLeRighe) {
            String r[] = riga.split(", ");
            if(r[2].equals("true")){
                boolean pasto = r[3].equals("true")? true : false;
                pazienti.add(new RicoveroOrdinario(r[0], r[1], pasto));
            } else{
                pazienti.add(new RicoveroDayHospital(r[0], r[1]));
            }
        }
        return pazienti;
    }
}
