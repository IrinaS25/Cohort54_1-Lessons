package consultation_16.main.model;

public class Book {
    public static int counter = 1;

    private int id;
    private String title;
    private String author;
    private double price;
    private int year;


    public Book(String title, String author, double price, int year) {
        this.id = counter++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book: {" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}




