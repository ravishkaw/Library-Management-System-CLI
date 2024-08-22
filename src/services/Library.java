package services;

import models.Book;
import models.Member;

import java.util.*;

public class Library {
    private List<Book> bookList = new ArrayList<>();
    private List<Member> memberList = new ArrayList<>();
    private HashMap<String, List<String>> transactions = new HashMap<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void addMember(Member member) {
        memberList.add(member);
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void borrowBook(String memberId, String bookId) {
        Member member = getMemberById(memberId);
        Book book = getBookById(bookId);

        if (member != null && book != null && !book.isBorrowed()) {
            book.setBorrowed(true);
            member.borrowBook(book);
            transactions.putIfAbsent(memberId, new ArrayList<>());
            transactions.get(memberId).add(bookId);
        }
    }

    public void returnBook(String memberId, String bookId) {
        Member member = getMemberById(memberId);
        Book book = getBookById(bookId);

        if (member != null && book != null && book.isBorrowed()) {
            book.setBorrowed(false);
            member.returnBook(book);
            transactions.get(memberId).remove(bookId);
        }
    }

    public HashMap<String, List<String>> borrowedBooks() {
        return transactions;
    }

    public List<Book> availableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : bookList) {
            if (!book.isBorrowed()) {
                availableBooks.add(book);
            }
        }

        return availableBooks;
    }

    private Member getMemberById(String id) {
        for (Member member : memberList) {
            if (member.getId().equals(id)) {
                return member;
            }
        }
        return null;
    }

    private Book getBookById(String id) {
        for (Book book : bookList) {
            if (book.getBookId().equals(id)) {
                return book;
            }
        }
        return null;
    }

}