package core;

import data.Book;

import java.util.List;

public interface ManagerBooks {
    public void addBooks(Book book);
    public List<Book> getAllBooks();
    public void borrowBook(Book book);
}
