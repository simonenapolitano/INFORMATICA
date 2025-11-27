import javax.swing.*;
import java.awt.*;

public class MainGUI extends JFrame {
    Articolo[] panini = {
        new Articolo("Panino", 2.00),
        new Articolo("Panino completo", 2.50),
        new Articolo("Piadina", 3.00)
    };
    Articolo[] bibite = {
        new Articolo("Coca-cola", 2.00),
        new Articolo("Acqua", 0.80),
        new Articolo("Fanta", 2.00)
    };
    JLabel[] quantita = new JLabel[panini.length + bibite.length];
    JButton[] bottoniplus = new JButton[panini.length + bibite.length];
    JButton[] bottoniminus = new JButton[panini.length + bibite.length];
    JLabel paniniTotale, bibiteTotale, prezzoTotale;
    double prezzoTot = 0;
    Articolo temp;
    int contPanini=0, contBibite=0;
    public MainGUI(){
        Sorting.bubbleSort(panini);
        Sorting.bubbleSort(bibite);
        setTitle("Bar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setSize(500, 500);
        JPanel paniniBibite = new JPanel(new GridLayout((panini.length + bibite.length), 5, 3, 3));
        for(int i=0; i<panini.length; i++){
            paniniBibite.add(new JLabel(String.valueOf(panini[i].getNome())));
            paniniBibite.add(new JLabel(String.valueOf(panini[i].getPrezzo()) + " €"));
            bottoniplus[i] = new JButton("+");
            bottoniminus[i] = new JButton("-");
            quantita[i] = new JLabel("0");
            paniniTotale = new JLabel("Panini: 0");
            bibiteTotale = new JLabel("Bibite: 0");
            prezzoTotale = new JLabel("Totale: 0 €");
            final int numero = i;
            bottoniplus[i].addActionListener(e ->{
                quantita[numero].setText(String.valueOf(Integer.parseInt(quantita[numero].getText()) + 1));
                contPanini +=1;
                prezzoTot += panini[numero].getPrezzo();
                paniniTotale.setText("Panini: " + String.valueOf(contPanini));
                prezzoTotale.setText(String.format("Totale: %.2f €", prezzoTot));
            });
            bottoniminus[i].addActionListener(e->{
                if (Integer.parseInt(quantita[numero].getText()) > 0) {
                    quantita[numero].setText(String.valueOf(Integer.parseInt(quantita[numero].getText()) - 1));
                    contPanini -=1;
                    prezzoTot -= panini[numero].getPrezzo();
                    paniniTotale.setText("Panini: " + String.valueOf(contPanini));
                    prezzoTotale.setText(String.format("Totale: %.2f €", prezzoTot));
                }
            });
            paniniBibite.add(quantita[i]);
            paniniBibite.add(bottoniplus[i]);
            paniniBibite.add(bottoniminus[i]);
        }
        for (int i = 0; i < bibite.length; i++) {
            paniniBibite.add(new JLabel(String.valueOf(bibite[i].getNome())));
            paniniBibite.add(new JLabel(String.valueOf(bibite[i].getPrezzo()) + " €"));
            bottoniplus[i+panini.length] = new JButton("+");
            bottoniminus[i+panini.length] = new JButton("-");
            quantita[i+panini.length] = new JLabel("0");
            final int numero = i;
            bottoniplus[i+panini.length].addActionListener(e ->{
                quantita[numero+panini.length].setText(String.valueOf(Integer.parseInt(quantita[numero+panini.length].getText()) + 1));
                contBibite +=1;
                prezzoTot += bibite[numero].getPrezzo();
                bibiteTotale.setText("Bibite: " + String.valueOf(contBibite));
                prezzoTotale.setText(String.format("Totale: %.2f €", prezzoTot));
            });
            bottoniminus[i+panini.length].addActionListener(e->{
                if (Integer.parseInt(quantita[numero+panini.length].getText()) > 0) {
                    quantita[numero+panini.length].setText(String.valueOf(Integer.parseInt(quantita[numero+panini.length].getText()) - 1));
                    contBibite -=1;
                    prezzoTot -= bibite[numero].getPrezzo();
                    bibiteTotale.setText("Bibite: " + String.valueOf(contBibite));
                    prezzoTotale.setText(String.format("Totale: %.2f €", prezzoTot));
                } 
            });
            paniniBibite.add(quantita[i+panini.length]);
            paniniBibite.add(bottoniplus[i+panini.length]);
            paniniBibite.add(bottoniminus[i+panini.length]);
        }
        JPanel scontrino = new JPanel(new GridLayout(1, 5, 3, 3));
        scontrino.add(new JLabel("Scontrino: "));
        scontrino.add(paniniTotale);
        scontrino.add(bibiteTotale);
        scontrino.add(prezzoTotale);
        add(paniniBibite);
        add(scontrino);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MainGUI();
    }
}
