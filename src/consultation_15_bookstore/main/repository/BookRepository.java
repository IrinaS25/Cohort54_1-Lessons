package consultation_15_bookstore.main.repository;

import consultation_15_bookstore.main.model.Book;

import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getAllBooks() {
        return null;
    }
}
