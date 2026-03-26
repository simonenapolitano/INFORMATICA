import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private JButton bottoneAggiungi, bottoneChiama;
    private JTextField nomeInput, cognomeInput, codiceInput;
    private JLabel risultato;
    private Ambulatorio elSkippy = new Ambulatorio();
    public GUI(){
        bottoneAggiungi = new JButton("Aggiungi paziente");
        bottoneChiama = new JButton("Chiama prossimo paziente");
        nomeInput = new JTextField(10);
        cognomeInput = new JTextField(10);
        codiceInput = new JTextField(10);
        risultato = new JLabel();
        setTitle("Ambulatorio");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        JPanel panel = new JPanel(new GridLayout(1, 7, 3, 3));
        panel.add(new JLabel("Nome del paziente: "));
        panel.add(nomeInput);
        panel.add(new JLabel("Cognome del paziente: "));
        panel.add(cognomeInput);
        panel.add(new JLabel("Codice sanitario del paziente: "));
        panel.add(codiceInput);
        panel.add(bottoneAggiungi);
        bottoneAggiungi.addActionListener(e -> {
            try {
                elSkippy.addPaziente(new Paziente(nomeInput.getText(), cognomeInput.getText(), codiceInput.getText()));
            } catch (PazienteGiaPresenteException exception) {
                System.out.println(exception.getMessage());
            }
            
        });
        JPanel panel1 = new JPanel(new GridLayout(1, 2, 3, 3));
        panel1.add(bottoneChiama);
        panel1.add(risultato);
        bottoneChiama.addActionListener(e ->{
            try{
                risultato.setText("Paziente chiamato: " + elSkippy.chiamaProssimo());
            } catch (SalaVuotaException exception){
                risultato.setText(exception.getMessage());
            }
        });


        add(panel);
        add(panel1);
        setVisible(true);
    }
}
