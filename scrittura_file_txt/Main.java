import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main{

    public static void main(String[] args) {
        String percorso = "files/file.txt";
        try (FileWriter fileWriter = new FileWriter(percorso);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) 
        {
            bufferedWriter.write("Ciao");
            System.out.println("Archiviazione completata");
        } catch (IOException e) {
            System.out.println("ERRORE: " + e.getMessage());
        }
    }
}