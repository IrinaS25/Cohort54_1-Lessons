package consultation_15_bookstore.main.service;

import consultation_15_bookstore.main.model.Book;
import consultation_15_bookstore.main.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;


    }
    public void addBook(Book book) {
        bookRepository.addBook(book);

    }
}
