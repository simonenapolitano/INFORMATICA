public class Studente extends Persona {
    String classe;
    public Studente(String nome, String cognome, int eta, String classe){
        super(nome, cognome, eta);
        this.classe = classe;
    }
    String getClasse(){
        return classe;
    }
    void setClasse(String classe){
        this.classe = classe;
    }
}
