import java.util.Scanner;
public class EnergyCalculator {
    Scanner input = new Scanner(System.in);
    private final double costoKwh = 0.25;
    private double consumoOrarioKwh;
    private int oreUtilizzoGiorno;
    public EnergyCalculator(){
        do{
            System.out.println("Inserisci il consumo dell'elettrodomestico: ");
            consumoOrarioKwh = input.nextDouble();
            if(consumoOrarioKwh < 0){
                System.out.println("Consumo di |" + consumoOrarioKwh + " Kwh| non valido.");
            }
        }while(consumoOrarioKwh < 0);
        do{
            System.out.println("Inserisci per quante ore(max 24 h) è stato utilizzato: ");
            oreUtilizzoGiorno = input.nextInt();
            if(oreUtilizzoGiorno < 0 || oreUtilizzoGiorno > 24){
                System.out.println("Numero di |" + oreUtilizzoGiorno + " ore| non valido.");
            }
        }while(oreUtilizzoGiorno < 0 || oreUtilizzoGiorno > 24);
        
        double consumoMensile = consumoOrarioKwh * oreUtilizzoGiorno * 30;
        double costoLordo = consumoMensile * costoKwh;
        if(consumoMensile < 50){
            System.out.println("Consumo mensile: " + consumoMensile + " Kwh, costo da pagare: " + (costoLordo - 5) + " euro(senza bonus " + costoLordo + " euro)");
        } else{
            System.out.println("Consumo mensile: " + consumoMensile + " Kwh, costo da pagare: " + (costoLordo - 5) + " euro");
        }
        
    }
    public static void main(String[] args) {
        new EnergyCalculator();
    }
}
