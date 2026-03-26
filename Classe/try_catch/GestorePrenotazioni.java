public class GestorePrenotazioni {
    private int postiTotali;
    private int postiDisponibili;
    public GestorePrenotazioni(int postiTotali, int postiDisponibili){
        if(postiTotali < 0){
            throw new IllegalArgumentException("Il valore dei posti totali deve essere maggiore di zero");
        } else if(postiDisponibili < 0){
            throw new IllegalArgumentException("Il valore dei posti disponibili non può essere negativo");
        } else if(postiDisponibili < postiTotali){
            throw new IllegalArgumentException("Il valore dei posti disponibili non può essere più grande di quelli totali");
        }
        this.postiTotali = postiTotali;
        this.postiDisponibili = postiDisponibili;
    }
    public void prenota(int numeroPostiRichiesti){
        if(numeroPostiRichiesti > postiTotali){
            try {
                throw new PostiInsufficientiException("Richiesti " + numeroPostiRichiesti + " posti, totali " + postiTotali);
            } catch (PostiInsufficientiException e) {
                e.printStackTrace();
            }
        }else if (numeroPostiRichiesti < 0) {
            throw new IllegalArgumentException("Il numero di posti richiesti deve essere maggiore di 0.");
        } else if (numeroPostiRichiesti > postiDisponibili){
            throw new PostiInsufficientiException(numeroPostiRichiesti, postiDisponibili);
        } else if(postiDisponibili < 0){
            try {
                throw new PostiEsauritiException(numeroPostiRichiesti);
            } catch (PostiEsauritiException e) {
                e.printStackTrace();
            }
        }
        postiDisponibili -= numeroPostiRichiesti;
    }
}
