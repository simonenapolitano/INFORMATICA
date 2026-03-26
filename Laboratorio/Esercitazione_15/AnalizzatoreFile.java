import java.io.*;
import java.util.ArrayList;

public class AnalizzatoreFile {
    public static ArrayList<Studente> leggidati(String nomeFile){
        ArrayList<Studente> classe = new ArrayList<Studente>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeFile))) {
            String linea;
            while((linea = bufferedReader.readLine()) !=null){
                String cont[] = linea.split(", ");
                ArrayList<Integer> voti = new ArrayList<Integer>();
                for (int i = cont.length-1; i > 0; i--) {
                    voti.add(Integer.parseInt(cont[i]));
                }
                classe.add(new Studente(cont[0], voti));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return classe;
    }
    public static void scriviReport(String nomeFile, ArrayList<String> nomiInsufficienti, ArrayList<Studente> classe){
        try(PrintWriter printWriter = new PrintWriter(nomeFile);) {
            for(String nome : nomiInsufficienti){
                for(Studente s : classe){
                    if(nome.equals(s.getCognome())){
                        printWriter.append(nome + "\n");
                        break;
                    } 
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
         
    }
}
