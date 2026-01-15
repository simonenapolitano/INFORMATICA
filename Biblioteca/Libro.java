public class Libro{
    private String titolo;
    private String autore;
    private int anno;
    private boolean disponibile;

    public Libro(String titolo, String autore, int anno, boolean disponibile){
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
        this.disponibile = disponibile;
    }
    public String getTitolo(){
        return titolo;
    }
    public String getAutore(){
        return autore;
    }
    public int getAnno(){
        return anno;
    }
    public boolean isDisponibile(){
        return disponibile;
    }
    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
    public void setAutore(String autore){
        this.autore = autore;
    }
    public void setAnno(int anno){
        this.anno = anno;
    }
    public void setDisponibile(boolean disponibile){
        this.disponibile = disponibile;
    }
    @Override
    public String toString(){
        return "Titolo: " + titolo + " Autore: " + autore + " Anno: " + anno + " Disponibile: " + disponibile;
    }

}