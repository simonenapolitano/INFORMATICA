public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist(600);
        try{
            playlist.aggiungiCanzone(new Canzone("Canzone 1", "Autore 1", 250));
            playlist.aggiungiCanzone(new Canzone("Canzone 2", "Autore 2", 250));
            playlist.aggiungiCanzone(new Canzone("Canzone 3", "Autore 3", 150));
        } catch(LimiteDurataSuperatoException e){
            System.out.println(e.getMessage());
        }
        try {
            playlist.rimuoviCanzone("Canzone 3");
        } catch (CanzoneNonTrovataException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
