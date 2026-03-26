import java.util.ArrayList;

public class Playlist {
    private ArrayList<Canzone> brani;
    private int durataMassima;
    public Playlist(int durataMassima){
        this.durataMassima = durataMassima;
        brani = new ArrayList<Canzone>();
    }
    public int getDurataTotale(){
        int somma = 0;
        for(Canzone c : brani){
            somma += c.getDurataSecondi();
        }
        return somma;
    }
    public void aggiungiCanzone(Canzone c) throws LimiteDurataSuperatoException{
        if(getDurataTotale() + c.getDurataSecondi() > durataMassima){
            throw new LimiteDurataSuperatoException();
        } else{
            brani.add(c);
        }
    }
    public void rimuoviCanzone(String titolo) throws CanzoneNonTrovataException{
        boolean trovato = false;
        for (Canzone c : brani) {
            if(c.getTitolo().equals(titolo)){
                brani.remove(c);
                trovato = true;
                break;
            }
        }
        if(!trovato){
            throw new CanzoneNonTrovataException();
        }
    }

    
}
