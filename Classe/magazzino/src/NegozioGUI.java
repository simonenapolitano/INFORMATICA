import javax.swing.*;
import java.awt.*;

public class NegozioGUI extends JFrame {
    public NegozioGUI(Prodotti[] prodotti){
        setTitle("Inventario");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(300, 300);

        JPanel Tabella = new JPanel(new GridLayout(prodotti.length, 2, 15, 15));
        for(Prodotti prodotto : prodotti){
            Tabella.add(new JLabel(prodotto.getNome()));
            Tabella.add(new JButton(String.valueOf(prodotto.getScorta())));
        }
        add(Tabella);
        setVisible(true);
    }
}
