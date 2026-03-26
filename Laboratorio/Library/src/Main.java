import javax.swing.*;
import java.util.ArrayList;
import java.awt.FlowLayout;

public class Main extends JFrame {
    private JTextField inputTitle, inputAutor, inputYear, inputPrice, inputAvailable, searchBook;
    private JButton goToSearch, goToAdd, searchButton, addButton; 
    private JLabel endResult = new JLabel();
    boolean found = false;
    ArrayList<Book> library = new ArrayList<>();

    public Main(){
        inputTitle = new JTextField(10);
        inputAutor = new JTextField(10);
        inputYear = new JTextField(10);
        inputPrice = new JTextField(10);
        inputAvailable = new JTextField(10);
        searchBook = new JTextField(10);

        goToSearch = new JButton("Search a book");
        goToAdd = new JButton("Add a book");
        searchButton = new JButton("Search");
        addButton = new JButton("Add");

        setTitle("Library");
        setSize(700, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        searchLibro();
        
        setVisible(true);
    }

    public void addLibro(){
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Insert the title:"));
        inputPanel.add(inputTitle);
        inputPanel.add(new JLabel("Insert the autor:"));
        inputPanel.add(inputAutor);
        inputPanel.add(new JLabel("Insert the year it was written in:"));
        inputPanel.add(inputYear);
        inputPanel.add(new JLabel("Insert the price:"));
        inputPanel.add(inputPrice);
        inputPanel.add(new JLabel("Is it available:"));
        inputPanel.add(inputAvailable);
        inputPanel.add(addButton);
        inputPanel.add(goToSearch);
        goToSearch.addActionListener(e->{
            getContentPane().removeAll();
            searchLibro();
            revalidate();
            repaint();
        });
        addButton.addActionListener(e->{
            library.add(new Book(inputTitle.getText(), inputAutor.getText(), Integer.parseInt(inputYear.getText()), Double.parseDouble(inputPrice.getText()), Boolean.parseBoolean(inputAvailable.getText())));
            searchLibro();
        });
        add(inputPanel);
    }

    public void searchLibro(){
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Insert the title:"));
        inputPanel.add(searchBook);
        inputPanel.add(searchButton);
        searchButton.addActionListener(e->{
            for(Book book: library){
                if(book.getTitle().equals(inputTitle.getText())){
                    endResult.setText(("|Title: " + book.getTitle() + "| |Autor: " + book.getAutor() + "| |Year: " + book.getYear() + "| |Price: " + book.getPrice() + "| |Available: " + book.getAvailable() + "|"));
                    revalidate();
                    repaint();
                   found = true;
                }
            }
            if(!found){
                endResult.setText("The book doesn't exist");
            }
            
        });
        inputPanel.add(goToAdd);
        goToAdd.addActionListener(e->{
            getContentPane().removeAll();
            addLibro();
            revalidate();
            repaint();
        });
        inputPanel.add(endResult);
        
        
        add(inputPanel);
    }
    public static void main(String[] args) throws Exception {
        new Main();
    }
}
