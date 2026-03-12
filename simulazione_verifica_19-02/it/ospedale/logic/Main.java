public class Main {
    Ambulatorio ambulatorio = new Ambulatorio();
    public Main(){
        try {
            ambulatorio.addPaziente(new Paziente("Dylan", "D'Amico", "1"));
            ambulatorio.addPaziente(new Paziente("Adrians", "Cirauds", "2"));
            ambulatorio.addPaziente(new Paziente("Feds", "Fulgions", "1"));
        } catch (PazienteGiaPresenteException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Paziente chiamato: " + ambulatorio.chiamaProssimo());
            System.out.println("Paziente chiamato: " + ambulatorio.chiamaProssimo());
            System.out.println("Paziente chiamato: " + ambulatorio.chiamaProssimo());
        } catch (SalaVuotaException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new GUI();
    }
}
