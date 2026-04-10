public class Persona{
    private String nome;
    private String cognome;
    private Double importo;
    private Persona next;

    public Persona(String nome, String cognome, Double importo){
        this.nome = nome;
        this.cognome = cognome;
        this.importo = importo;
        this.next = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Double getImporto() {
        return importo;
    }

    public void setImporto(Double importo) {
        this.importo = importo;
    }

    public Persona getNext() {
        return next;
    }

    public void setNext(Persona next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Cognome: " + cognome + " Importo: " + importo;
    }
}