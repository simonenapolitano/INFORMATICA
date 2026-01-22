import java.util.ArrayList;

public abstract class Negozio{
    private String nome;
    private ArrayList<Prodotto> prodotti;

    public Negozio(String nome){
        this.nome = nome;
        prodotti = new ArrayList<>();
    }
    public String getNome(){
        return nome;
    }
    public ArrayList<Prodotto> getListaProdotti(){
        return prodotti;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void addProdotto(Prodotto prodotto){
        prodotti.add(prodotto);
    }
    public abstract void stampaDettagli();
}