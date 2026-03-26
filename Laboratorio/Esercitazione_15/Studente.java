import java.util.ArrayList;

public class Studente{
    private String cognome;
    private ArrayList<Integer> voti = new ArrayList<Integer>();

    public Studente(String cognome, ArrayList<Integer> listaVoti){
        this.cognome = cognome;
        for(int v : listaVoti){
            this.voti.add(v);
        }
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public ArrayList<Integer> getListaVoti() {
        return voti;
    }

    public void addVoto(int voto) {
        voti.add(voto);
    }
}