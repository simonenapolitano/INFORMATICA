public class Dvd extends MaterialeBiblioteca {
    private Double durata;
    public Dvd(String titolo, Double durata){
        super(titolo);
        this.durata = durata;
    }
}