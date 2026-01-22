import java.util.HashMap;

public class CentroCommerciale{
    HashMap<String, Negozio> negozi = new HashMap<>();

    public void registraNegozio(Negozio n){
        negozi.put(n.getNome(), n);
    }
    public void avviaCampagnaSconti(int perc){
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
}