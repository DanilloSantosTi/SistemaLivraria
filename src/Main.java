import core.ManagerBooks;
import core.ManagerBooksImpl;
import data.Author;
import data.Book;
import data.Loan;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Main {

    // Helper method to convert LocalDate to Date
    private static Date convertToDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static void main(String[] args) {
        // 1. Criar Autores
        Author author1 = new Author("J.R.R. Tolkien", convertToDate(LocalDate.of(1892, 1, 3)));
        Author author2 = new Author("George Orwell", convertToDate(LocalDate.of(1903, 6, 25)));

        // 2. Criar Livros
        // Initially, no loan, so we pass null.  Also, using LocalDate.now() for updateDate.
        Book book1 = new Book("The Hobbit", author1, null, LocalDate.now());
        Book book2 = new Book("The Lord of the Rings", author1, null, LocalDate.now());
        Book book3 = new Book("1984", author2, null, LocalDate.now());

        // 3. Criar o Gerenciador de Livros
        ManagerBooks managerBooks = new ManagerBooksImpl();

        // 4. Adicionar Livros à Biblioteca
        managerBooks.addBooks(book1);
        managerBooks.addBooks(book2);
        managerBooks.addBooks(book3);

        // 5. Exibir todos os livros
        System.out.println("--- All Books ---");
        managerBooks.getAllBooks().forEach(book -> System.out.println(book.getTitle() + " by " + book.getAuthor().getName()));

        // 6. Simular Empréstimo
        System.out.println("\n--- Borrowing '1984' ---");
        managerBooks.borrowBook(book3);
        System.out.println(book3.getTitle() + " availability: " + book3.getAvailable().isBookAvailable()); // Should print false

        // 7. Exibir todos os livros novamente para verificar se o empréstimo atualizou a lista
        System.out.println("\n--- All Books After Borrowing ---");
        managerBooks.getAllBooks().forEach(book -> System.out.println(book.getTitle() + " by " + book.getAuthor().getName()));
    }
}