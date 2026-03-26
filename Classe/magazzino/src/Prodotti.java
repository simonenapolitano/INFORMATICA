public class Prodotti {
    private String nome;
    private int scorta;
    public Prodotti(String nome, int scorta){
        this.nome = nome;
        this.scorta = scorta;
    }

    public String getNome(){
        return nome;
    }
    public int getScorta(){
        return scorta;
    }
}
