
import javax.swing.JLabel;

public class ContoCorrente {
    double saldo;
    public ContoCorrente(double saldo){
        this.saldo = saldo;
    }

    public void deposita(double importo, JLabel risultato){
        saldo += importo;
        risultato.setText("Saldo del conto: " + saldo + "€");
    }
    public void preleva(double importo, JLabel risultato){
        if(saldo>=importo){
            saldo -=importo;
            risultato.setText("Saldo del conto: " + saldo + "€");
        } else{
            risultato.setText("Non hai abbastanza soldi nel conto!");
        }
        
    }
    public void getSaldo(JLabel risultato){
        risultato.setText("Saldo del conto: " + saldo + "€");
    }
}
