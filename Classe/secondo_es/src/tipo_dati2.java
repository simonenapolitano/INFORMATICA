import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class tipo_dati2 extends JFrame {

    private JTextField input1, input2;
    private JLabel risultato;
    private JButton div_int, div_rel, mult_int, mult_rel, conv_bin_1, conv_bin_2;


    public tipo_dati2(){
        setTitle("Adriano Ciraudo Champion su R6");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        input1 = new JTextField(10);
        input2 = new JTextField(10);
        risultato = new JLabel("Risultato: ");
        div_int = new JButton("Dividi intero");
        div_rel = new JButton("Dividi reale");
        mult_int = new JButton("Moltiplica intero");
        mult_rel = new JButton("Moltiplica reale");
        conv_bin_1 = new JButton("Trasforma in binario numero 1");
        conv_bin_2 = new JButton("Trasforma in binario numero 2");

        add(new JLabel("--- Esempio Numerico ---"));
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Numero 1:"));
        inputPanel.add(input1);
        inputPanel.add(new JLabel("Numero 2:"));
        inputPanel.add(input2);

        JPanel btPanel = new JPanel(new FlowLayout());
        btPanel.add(div_int);
        btPanel.add(div_rel);
        btPanel.add(mult_int);
        btPanel.add(mult_rel);
        btPanel.add(conv_bin_1);
        btPanel.add(conv_bin_2);

        div_int.addActionListener(e-> {
            risultato.setText("Risultato: " + String.valueOf(Integer.parseInt(input1.getText()) / Integer.parseInt(input2.getText())));
        });
        div_rel.addActionListener(e-> {
            risultato.setText("Risultato: " + String.valueOf(Double.parseDouble(input1.getText()) / Double.parseDouble(input2.getText())));
        });
        mult_int.addActionListener(e->{
            risultato.setText("Risultato: " + String.valueOf(Integer.parseInt(input1.getText()) * Integer.parseInt(input2.getText())));
        });
        mult_rel.addActionListener(e->{
            risultato.setText("Risultato: " + String.valueOf(Double.parseDouble(input1.getText()) * Double.parseDouble(input2.getText())));
        });
        conv_bin_1.addActionListener(e->{
            String bin = "";
            int num = Integer.parseInt(input1.getText());
            do{
                bin = String.valueOf(num % 2) + bin;
                num = num / 2;
            }while(num !=0);
            risultato.setText("Risultato: " + bin);
        });
        conv_bin_2.addActionListener(e->{
            String bin = "";
            int num = Integer.parseInt(input2.getText());
            do{
                bin = String.valueOf(num % 2) + bin;
                num = num / 2;
            }while(num !=0);
            risultato.setText("Risultato: " + bin);
        });
        add(inputPanel);
        add(btPanel);

        add(risultato);
        setVisible(true);
    }


    public static void main(String[] args) throws Exception {
        new tipo_dati2();
    }
}
