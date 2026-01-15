import java.util.ArrayList;

public class GestioneBiblioteca{
    public static void main(String[] args) {
        ArrayList<Libro> catalogo = new ArrayList<Libro>();
        catalogo.add(new Libro("Il nome della rosa", "Umberto Eco", 1980, true));
        catalogo.add(new Libro("1984", "George Orwell", 1949, true));
        catalogo.add(new Libro("Il Gattopardo", "Giuseppe Tomasi di Lampedusa", 1958, false));

        for(Libro libro : catalogo){
            System.out.println(libro);
        }

        Libro libroPrestato = catalogo.get(1);
        
        System.out.println("Prestito del libro: " + libroPrestato.getTitolo());
        if(libroPrestato.isDisponibile()){
            libroPrestato.setDisponibile(false);
            System.out.println("Libro " + libroPrestato.getTitolo() + " prestato e non piu' disponibile!");
        } else{
            System.out.println("Libro non disponibile!");
        }

        for(Libro libro : catalogo){
            String stato = libro.isDisponibile()? "[DISPONIBILE]" : "[NON DISPONIBILE]"; 
            System.out.println(libro + "    " + stato);
        }
    }
}