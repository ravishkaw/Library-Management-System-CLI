package models;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String id;
    private String name;
    private String email;
    private List<String> borrowedBooksIds = new ArrayList<>();

    public Member(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getBorrowedBooksIds() {
        return borrowedBooksIds;
    }

    public void borrowBook(Book book) {
        String bookId = book.getBookId();
        borrowedBooksIds.add(bookId);
        book.setBorrowed(true);
    }

    public void returnBook(Book book) {
        String bookId = book.getBookId();
        borrowedBooksIds.remove(bookId);
        book.setBorrowed(false);
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", borrowedBooks=" + borrowedBooksIds +
                '}';
    }
}