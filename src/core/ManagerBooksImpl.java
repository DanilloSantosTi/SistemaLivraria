package core;

import data.Book;
import data.Loan;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManagerBooksImpl implements ManagerBooks {

    private final List<Book> listBooks = new ArrayList<Book>();

    private Date getDateSystem() {
        LocalDate localDate = LocalDate.now();
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    @Override
    public void addBooks(Book book) {
        listBooks.add(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return listBooks;
    }

    @Override
    public void borrowBook(Book book) {

        Loan loanBook = new Loan(
                false,
                getDateSystem()
        );
        book.setAvailable(
                loanBook
        );
    }
}
