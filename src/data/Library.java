package data;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> booksList = new ArrayList<>();
    private List<Author> authorsList = new ArrayList<>();
    private List<Loan> loansList = new ArrayList<>();

    public List<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }

    public List<Author> getAuthorsList() {
        return authorsList;
    }

    public void setAuthorsList(List<Author> authorsList) {
        this.authorsList = authorsList;
    }

    public List<Loan> getLoansList() {
        return loansList;
    }

    public void setLoansList(List<Loan> loansList) {
        this.loansList = loansList;
    }
}
