import java.util.ArrayList;

public class SpaManager {
    static final int CAPIENZA_MAX = 30;
    ArrayList<Benessere> prenotazioni = new ArrayList<Benessere>();
    public SpaManager(){
        try {
            prenotazioni.add(new IngressoTerme("Julia", "1", 5.00, true));
            if(prenotazioni.size() + 1 < CAPIENZA_MAX){
                throw new LimiteOspitiRaggiuntiException();
            }
        } catch (LimiteOspitiRaggiuntiException e) {
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Prenotazione fatta!");
        }
    }

    public static void main(String[] args){

    }
}
