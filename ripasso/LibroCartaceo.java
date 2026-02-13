public class LibroCartaceo extends MaterialeBiblioteca {
    private Integer numeroPagine;
    public LibroCartaceo(String titolo, Integer numeroPagine){
        super(titolo);
        this.numeroPagine = numeroPagine;
    }
}
