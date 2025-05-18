package data;

import java.time.LocalDate;
import java.util.UUID;

public class Book {
    private final UUID id = UUID.randomUUID();
    private String title;
    private Author author;
    private Loan available;
    private final LocalDate registerDate = LocalDate.now();
    private LocalDate updateDate;

    public Book(String title, Author author, Loan available, LocalDate updateDate) {
        this.title = title;
        this.author = author;
        this.available = available;
        this.updateDate = updateDate;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Loan getAvailable() {
        return available;
    }

    public void setAvailable(Loan available) {
        this.available = available;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate() {
        this.updateDate = LocalDate.now();
    }
}
