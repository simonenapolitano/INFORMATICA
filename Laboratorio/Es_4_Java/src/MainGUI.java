import javax.swing.*;
import java.awt.*;

public class MainGUI extends JFrame {
    int i=0;
    float somma=0;
    int max = 0;
    String nomemax, classemax;
    public MainGUI(){
        Preside[] presidi = new Preside[3];
        presidi[0] = new Preside("Luca", "1A info", 7);
        presidi[1] = new Preside("Anna", "2A info", 10);
        presidi[2] = new Preside("Giorgio", "3A info", 2);
        setTitle("Gestione Classi");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));

        for(Preside preside : presidi){
            if(max<preside.getVoto()){
                max = preside.getVoto();
                nomemax = preside.getNome();
                classemax = preside.getClasse();
            }
            somma += preside.getVoto();
        }
        JPanel pannello = new JPanel(new GridLayout(presidi.length, 4, 15, 15));
        for (int i = 0; i < presidi.length; i++) {
            pannello.add(new JLabel("Studente " + (i+1)));
            pannello.add(new JLabel("Nome " + presidi[i].getNome()));
            pannello.add(new JLabel("Classe " + presidi[i].getClasse()));
            pannello.add(new JLabel("Voto " + presidi[i].getVoto()));
        }
        JPanel sotto = new JPanel(new GridLayout(1, 5, 15, 15));
        pannello.add(new JLabel("Studente con voto più alto"));
        pannello.add(new JLabel("Nome " + nomemax));
        pannello.add(new JLabel("Classe " + classemax));
        pannello.add(new JLabel("Voto " + max));
        pannello.add(new JLabel("Media di tutta la scuola: " + (somma/presidi.length)));
        //add(buttonPanel);
        add(pannello);
        setVisible(true);
    }
    public static void main(String[] args) throws Exception {
        new MainGUI();
    }
}
