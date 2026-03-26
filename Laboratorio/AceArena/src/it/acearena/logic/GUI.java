package it.acearena.logic;

import javax.swing.*;

import it.acearena.business.ClubManager;
import it.acearena.exceptions.CampiEsauritiException;
import it.acearena.model.*;

import java.awt.*;

public class GUI extends JFrame {
    private JTextField inputNome;
    private JTextField inputCodiceIdentificativo;
    private JCheckBox lezionePerfezione;
    private JCheckBox racchettaSi;
    private JButton bottoneAggiungi;
    private ClubManager clubManager;
    public GUI(){
        inputNome = new JTextField(10);
        inputCodiceIdentificativo = new JTextField(10);
        lezionePerfezione = new JCheckBox("Lezione di perfezionamento?");
        racchettaSi = new JCheckBox("racchetta?");
        bottoneAggiungi = new JButton("Aggiungi Prenotazione");
        clubManager = new ClubManager();
        setTitle("AceArena");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        JPanel panel = new JPanel(new GridLayout(5,7, 1, 1));
        panel.add(new JLabel("Nome: "));
        panel.add(inputNome);
        panel.add(new JLabel("Codice identificativo: "));
        panel.add(inputCodiceIdentificativo);
        panel.add(lezionePerfezione);
        panel.add(racchettaSi);
        panel.add(bottoneAggiungi);
        lezionePerfezione.addActionListener(e -> {
            racchettaSi.setEnabled(!lezionePerfezione.isSelected());
        });

        racchettaSi.addActionListener(e -> {
            lezionePerfezione.setEnabled(!racchettaSi.isSelected());
        });
        bottoneAggiungi.addActionListener(e -> {
            try {
                if(lezionePerfezione.isSelected()){
                    clubManager.addGiocatore(new LezionePerfezionamento(inputNome.getText(), inputCodiceIdentificativo.getText(), 50));
                } else{
                    clubManager.addGiocatore(new AffittoSemplice(inputNome.getText(), inputCodiceIdentificativo.getText(), racchettaSi.isSelected()));
                }
            } catch (CampiEsauritiException ex) {
                JOptionPane.showMessageDialog(this, "ERRORE: " + ex.getMessage(), "Errore", JOptionPane.ERROR_MESSAGE);
            }
        });
        add(panel);
        setVisible(true);
    }
}
