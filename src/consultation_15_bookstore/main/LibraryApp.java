package consultation_15_bookstore.main;

import consultation_15_bookstore.main.controller.BookController;

public class LibraryApp {
    public static void main(String[] args) {
        BookController bookController = new BookController();
        bookController.run();

    }
}
