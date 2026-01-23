import java.util.HashMap;

public class CentroCommerciale{
    private HashMap<String, Negozio> negozi = new HashMap<>();

    public void registraNegozio(Negozio n){
        negozi.put(n.getNome(), n);
    }

    public void avviaCampagnaSconti(double perc){
        for(Negozio negozio : negozi.values()){
            if(negozio instanceof Abbigliamento){
                try {
                    ((Abbigliamento)negozio).applicaSaldi(perc);
                } catch (ValoreScontoException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public void stampaNegozi(){
        for(Negozio negozio : negozi.values()){
            System.out.println("Nome: " + negozio.getNome());
            System.out.println("    Prodotti: ");
            for(Prodotto prodotto : negozio.getListaProdotti()){
                System.out.println("        Nome: " + prodotto.getNome() + " Prezzo: " + prodotto.getPrezzo());
            }
        }
    }

}