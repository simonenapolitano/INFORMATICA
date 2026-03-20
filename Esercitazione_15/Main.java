import java.util.ArrayList;

public class Main {
    private ArrayList<String> trovaNomiInsufficienti(ArrayList<Studente> classe){
        ArrayList<String> nomiInsufficienti = new ArrayList<String>();
        for(Studente s : classe){
            int somma = 0;
            for (int i = 0; i < s.getListaVoti().size(); i++) {
                somma += s.getListaVoti().get(i);
            }
            if((somma/s.getListaVoti().size()) < 6){
                nomiInsufficienti.add(s.getCognome());
            }
        }
        return nomiInsufficienti;
    }
    public Main(){
        ArrayList<Studente> classe = AnalizzatoreFile.leggidati("files/classe.txt");
        AnalizzatoreFile.scriviReport("files/report.txt", trovaNomiInsufficienti(classe), classe);
    }

    public static void main(String[] args) {
        new Main();
    }
}
