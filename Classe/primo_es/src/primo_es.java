import javax.swing.*;
import java.awt.FlowLayout;

public class primo_es extends JFrame {
    public primo_es() {
        setTitle("Louise Maloney");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        setVisible(true);
    }

    public static void main(String[] args) {
        new primo_es();
    }
}
