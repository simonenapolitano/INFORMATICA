public class Coda {
    private Persona first;
    private Persona last;
    private Double incasso;

    public Coda(){
        this.first = null;
        this.last = null;
        this.incasso = 0.0;
    }

    public void push(Persona p){
        if(first == null){
            first = p;
            last = p;
        } else{
            last.setNext(p);
            last = p;
        }
        
    }

    public String pop(){
        if(first == null){
            return "<!>Coda vuota<!>";
        }
        Persona p = first;
        first = first.getNext();
        incasso += p.getImporto();
        return p.toString();
    }
    
    public Double getIncasso() {
        return incasso;
    }

    public void setIncasso(Double incasso) {
        this.incasso = incasso;
    }

    public int contaPersone(){
        int contatore = 0;
        Persona p = first;
        while(p != null){
            contatore++;
            p = p.getNext();
        }
        return contatore;
    }

    public String stampaUltimo(){
        if(first == null){
            return "<!>Coda vuota<!>";
        }
        return last.toString();
    }

    @Override
    public String toString() {
        String s = "";
        Persona p = first;
        if(first == null){
            s = "<!>La coda e' vuota<!>";
        }
        else{
            while(first != null){
                s += p.toString() + "\n";
                p = p.getNext();
            }
        }
        return s;
    }
}
