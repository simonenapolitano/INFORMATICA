
import javax.swing.*;
import java.util.ArrayList;
import java.awt.FlowLayout;

public class Main extends JFrame {
    ContoCorrente conto;
    private JTextField inputPreleva, inputDeposita, inputTitolare;
    private JLabel risultato;
    private JButton btnPreleva, btnDeposita, btnMostra;
    public Main(){
        conto = new ContoCorrente(400);
        inputPreleva = new JTextField(20);
        inputDeposita = new JTextField(20);
        inputTitolare = new JTextField(20);
        btnPreleva = new JButton("Preleva");
        btnDeposita = new JButton("Deposita");
        btnMostra = new JButton("Mostra Saldo");
        risultato = new JLabel("Saldo del conto: " + conto.saldo + "€");
        setTitle("App Banca");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(btnMostra);
        btnMostra.addActionListener(e->{
            conto.getSaldo(risultato);
        });
        panel.add(new JLabel("Inserisci il saldo da prelevare: "));
        panel.add(inputPreleva);
        panel.add(btnPreleva);
        btnPreleva.addActionListener(e->{
            conto.preleva(Double.parseDouble(inputPreleva.getText()), risultato);
        });
        panel.add(new JLabel("Inserisci il saldo da depositare: "));
        panel.add(inputDeposita);
        panel.add(btnDeposita);
        btnDeposita.addActionListener(e->{
            conto.deposita(Double.parseDouble(inputDeposita.getText()), risultato);
        });
        add(panel);
        add(risultato);
        setVisible(true);
    }
    public static void main(String[] args) throws Exception {
        new Main();
    }
}
