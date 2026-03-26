import java.time.*;

public abstract class Veicolo{
    private String targa;
    private LocalDateTime orarioIngresso;

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public LocalDateTime getOrarioIngresso() {
        return orarioIngresso;
    }

    public void setOrarioIngresso(LocalDateTime orarioIngresso) {
        this.orarioIngresso = orarioIngresso;
    }

    public Veicolo(String targa){
        this.targa = targa;
        orarioIngresso = LocalDateTime.now();
    }

    public abstract Double calcolaTariffa(LocalDateTime orarioUscita);
}