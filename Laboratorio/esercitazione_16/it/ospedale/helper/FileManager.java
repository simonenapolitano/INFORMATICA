package it.ospedale.helper;
import it.ospedale.model.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public static void scriviSuFile(String percorso, String message, boolean append) throws IOException{
        Path path = Path.of(percorso);
        if(append){
            Files.writeString(path, message, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } else{
            Files.writeString(path, message, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        }   
    }

    public static ArrayList<Paziente> leggiDaFile(String percorso) throws IOException{
        Path path = Path.of(percorso);
        List<String> tutteLeRighe = Files.readAllLines(path);
        ArrayList<Paziente> pazienti = new ArrayList<Paziente>();
        for (String riga : tutteLeRighe) {
            String[] r;
            r = riga.split(", ");
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
