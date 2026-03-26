import javax.swing.*;
import java.awt.*;

public class Libro extends JFrame {
    String titolo, autore;
    int anno;
    double prezzo;
    boolean disponibile;

    public Libro() {
        titolo = "Le avventure di Louise Maloney";
        autore = "Andrea Di Santo";
        anno = 1991;
        prezzo = 19.99;
        disponibile = true;

        setTitle("Libreria");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JPanel etPanel = new JPanel(new FlowLayout());
        etPanel.add(new JLabel("Titolo: " + titolo));
        etPanel.add(new JLabel("Autore: " + autore));
        etPanel.add(new JLabel("Anno: " + anno));
        etPanel.add(new JLabel("Prezzo: " + prezzo));
        if(disponibile){
            etPanel.add(new JLabel("Disponibile: sì"));
        } else {
            etPanel.add(new JLabel("Disponibile: no"));
        }

        add(etPanel);
        setVisible(true);
    }

}
