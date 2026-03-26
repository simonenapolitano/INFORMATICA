public class Book {
    private String title;
    private String autor;
    private int year;
    private double price;
    private boolean available;
    public Book(String title, String autor, int year, double price, boolean available){
        this.title = title;
        this.autor = autor;
        this.year = year;
        this.price = price;
        this.available = available;
    }

    public String getTitle(){
        return title;
    }
    public String getAutor(){
        return autor;
    }
    public int getYear(){
        return year;
    }
    public double getPrice(){
        return price;
    }
    public boolean getAvailable(){
        return available;
    }

    public void setTitolo(String title){
        this.title = title;
    }
    public void setAutore(String autor){
        this.autor = autor;
    }
    public void setAnno(int year){
        this.year = year;
    }
    public void setPrezzo(double price){
        this.price = price;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }
}
