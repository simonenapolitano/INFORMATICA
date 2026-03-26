public class Docente extends Persona {
    String materia;
    public Docente(String nome, String cognome, int eta, String materia){
        super(nome, cognome, eta);
        this.materia = materia;
    }
    String getMateria(){
        return materia;
    }
    void setMateria(String materia){
        this.materia = materia;
    }
}
