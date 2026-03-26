import java.util.ArrayList;

public class CentroCommerciale{
    ArrayList<Negozio> negozi = new ArrayList<Negozio>();
    public ArrayList<Negozio> getListaNegozi() {
		return negozi;
	}

    public CentroCommerciale(Negozio... negozi){
        for(Negozio n : negozi){
            this.negozi.add(n);
        }
    }
    public void registraNegozio(Negozio... negozi){
        for(Negozio n : negozi){
            this.negozi.add(n);
        }
    }
    public void avviaCampagnaSconti(int perc){
        for(Negozio negozio : negozi){
            if(negozio instanceof Abbigliamento){
                Abbigliamento abbigliamento = (Abbigliamento)negozio;
                try {
                    abbigliamento.applicaSaldi(perc);
                } catch (ValoreScontoException e) {
                    System.out.println(e.getMessage());
                }
                
            }
        }
    }
}