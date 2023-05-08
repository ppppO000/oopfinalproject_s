package oopproject;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void borrowBook(User user, Book book) {
        user.borrowBook(book);
    }

    public void returnBook(User user, Book book) {
        user.returnBook(book);
    }

    public List<Book> searchBook(String keyword) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword) || book.getIsbn().contains(keyword)) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<User> getUsers() {
        return users;
    }
    
}
	
	