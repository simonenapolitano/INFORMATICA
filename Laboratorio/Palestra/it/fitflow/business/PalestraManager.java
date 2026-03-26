import java.util.ArrayList;

import it.fitflow.exception.CapienzaMassimaException;

public class PalestraManager {
    private static final Integer MAX_ISCRITTI = 100;
    private ArrayList<Abbonamento> abbonamenti;

    public PalestraManager(Abbonamento... abbonamenti){
        try {
            if((abbonamenti.length + this.abbonamenti.size()) > MAX_ISCRITTI){
                throw new CapienzaMassimaException();
            }
        } catch (CapienzaMassimaException e) {
            System.out.println(e.getMessage());
        }
        
        this.abbonamenti = new ArrayList<Abbonamento>();
        for (Abbonamento abbonamento : abbonamenti) {
            this.abbonamenti.add(abbonamento);
        }
    }
   
}
