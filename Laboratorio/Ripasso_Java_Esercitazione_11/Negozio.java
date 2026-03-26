import java.util.ArrayList;

public abstract class Negozio {
    private String nome;
    private ArrayList<Prodotto> prodotti;

    public Negozio(String nome, Prodotto... prodotti){
        this.nome = nome;
        this.prodotti = new ArrayList<Prodotto>();
        for(Prodotto p : prodotti){
            this.prodotti.add(p);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Prodotto> getProdotti() {
        return prodotti;
    }

    public void addProdotti(Prodotto... prodotti) {
        for(Prodotto p : prodotti){
            this.prodotti.add(p);
        }
    }

    public abstract void stampaDettagli();

}
