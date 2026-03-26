public class Vettura {
    private String targa;
    private int cil;
    private Vettura next;

    public Vettura(String targa, int cil){
        this.targa = targa;
        this.cil = cil;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getCil() {
        return cil;
    }

    public void setCil(int cil) {
        this.cil = cil;
    }

    public Vettura getNext() {
        return next;
    }

    public void setNext(Vettura next) {
        this.next = next;
    }

}
