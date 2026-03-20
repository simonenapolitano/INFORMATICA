public class Pila {
    private Vettura first;
    private int nNodi;

    public void push(String targa, int cil){
        Vettura a = new Vettura(targa, cil);

        if(nNodi == 0){
            first = a;
            nNodi++;
        } else{
            a.setNext(first);
            first = a;
            nNodi++;
        }
    }
    public String pop(){
        Vettura p;
        if(nNodi == 0){
            return "Lista vuota";
        }
        p = first;
        first = p.getNext();
        nNodi--;
        return p.getTarga();
    }

    @Override
    public String toString() {
        Vettura p;

        p = first;
        if(p == null){
            return "Non ci sono auto disponibili";
        } else{
            String s = "";
            while(p!=null){
                s += p.getTarga() + "\t" + p.getCil() + "\n";
                p = p.getNext();
            }
            return s;
        }
    }
}
