import java.io.*;

public class Main{

    public Main(){
        scriviSuFile("files/LucaRavasi.txt", "ciao");
        String contenuto = leggiFile("files/file.txt");
        System.out.println("Contenuto del file: " + contenuto);
    }

    private void scriviSuFile(String percorso, String message){
        try (BufferedWriter gay = new BufferedWriter(new FileWriter(percorso));) 
        {
            gay.write(message);
        } catch (IOException e) {
            System.out.println("ERRORE: " + e.getMessage());
        }
    }

    private String leggiFile(String percorso){
        try(BufferedReader reader = new BufferedReader(new FileReader(percorso))) {
            return reader.readAllAsString();
        } catch (IOException e) {
            return "ERRORE" + e.getMessage();
        }
    }

    public static void main(String[] args) {
        new Main(); 
    }
}