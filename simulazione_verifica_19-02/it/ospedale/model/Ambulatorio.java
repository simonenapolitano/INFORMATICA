import java.util.ArrayList;


public class Ambulatorio {
    private ArrayList<Paziente> pazientiInAttesa;

    public Ambulatorio(){
        pazientiInAttesa = new ArrayList<Paziente>();
    }

    public void addPaziente(Paziente paziente) throws PazienteGiaPresenteException {
        for(int i = 0; i < pazientiInAttesa.size(); i++){
            if(paziente.getCodiceSanitario().equals(pazientiInAttesa.get(i).getCodiceSanitario())){
                throw new PazienteGiaPresenteException();
            }
        }
        pazientiInAttesa.add(paziente);
    }

    public Paziente chiamaProssimo() throws SalaVuotaException {
        if(pazientiInAttesa.size() == 0){
            throw new SalaVuotaException();
        } else{
            Paziente p = pazientiInAttesa.get(0);
            pazientiInAttesa.remove(0);
            return p;
        }
    }

}
