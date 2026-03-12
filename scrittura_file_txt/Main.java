import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main{

    public Main(){
        scriviSuFile("files/file.txt");
        String contenuto = leggiFile("files/file.txt");
        System.out.println("Contenuto del file: " + contenuto);
    }

    private void scriviSuFile(String percorso){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(percorso));) 
        {
            bufferedWriter.write("Ciao");
            System.out.println("Archiviazione completata");
        } catch (IOException e) {
            System.out.println("ERRORE: " + e.getMessage());
        }
    }

    private String leggiFile(String percorso){
        try(BufferedReader reader = new BufferedReader(new FileReader(percorso))) {
            String linea;
            String contenuto = "";
            while((linea = reader.readLine()) != null){
                contenuto += linea;
            }
            return contenuto;
        } catch (IOException e) {
            System.out.println("ERRORE: " + e.getMessage());
            return "ERRORE";
        }
    }

    public static void main(String[] args) {
        new Main();
        
    }
}