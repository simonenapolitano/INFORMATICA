public class Canzone {
    private String titolo;
    private String autore;
    private int durataSecondi;

    public Canzone(String titolo, String autore, int durataSecondi) {
        this.titolo = titolo;
        this.autore = autore;
        this.durataSecondi = durataSecondi;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getDurataSecondi() {
        return durataSecondi;
    }

    public void setDurataSecondi(int durataSecondi) {
        this.durataSecondi = durataSecondi;
    }
}