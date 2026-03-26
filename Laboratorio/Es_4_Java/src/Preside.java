public class Preside {
    private String nome;
    private String classe;
    private int voto;
    public Preside(String nome, String classe, int voto){
        this.nome = nome;
        this.classe = classe;
        this.voto = voto;
    }
    public String getNome(){
        return nome;
    }
    public String getClasse(){
        return classe;
    }
    public int getVoto(){
        return voto;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setClasse(String classe){
        this.classe = classe;
    }
    public void setVoto(int voto){
        this.voto = voto;
    }

}
