package oopproject;
import java.util.ArrayList;
import java.util.List;
public class User {
    private String name;
    private String email;
    private String password;
    private List<Book> borrowedBooks;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setIsAvailable(false);
            borrowedBooks.add(book);
        } else {
            System.out.println("Sorry, the book is not available for borrowing.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.setIsAvailable(true);
            borrowedBooks.remove(book);
        } else {
            System.out.println("Sorry, you have not borrowed this book.");
        }
    }
}
