package main;

import models.Book;
import models.Member;
import services.Library;

import java.util.*;

public class Main {
    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Library Management System");

        while (true) {

            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    addMember();
                    break;
                case 3:
                    borrowBook();
                    break;
                case 4:
                    returnBook();
                    break;

            }
        }

    }

    public static void showMenu() {
        System.out.println("\n1. Add Book");
        System.out.println("2. Add Member");
        System.out.println("3. Borrow Book");
        System.out.println("4. Return Book");
        System.out.println("5. List Available Books");
        System.out.println("6. List Borrowed Books");
        System.out.println("7. List All Books");
        System.out.println("8. List All Members");
        System.out.println("9. Exit");
        System.out.print("Choose an option: ");
    }

    public static void addBook() {
        System.out.print("Enter Book ID : ");
        String bookId = scanner.nextLine();
        System.out.print("Enter Book Title : ");
        String bookTitle = scanner.nextLine();
        System.out.print("Enter Book Author : ");
        String bookAuthor = scanner.nextLine();
        System.out.print("Enter Book Genre : ");
        String bookGenre = scanner.nextLine();

        Book book = new Book(bookId, bookTitle, bookAuthor, bookGenre);
        library.addBook(book);
        System.out.println("Book added successfully.");

    }

    public static void addMember() {
        System.out.print("Enter Member ID : ");
        String memberId = scanner.nextLine();
        System.out.print("Enter Member Name : ");
        String memberName = scanner.nextLine();
        System.out.print("Enter Member Email : ");
        String memberEmail = scanner.nextLine();

        Member member = new Member(memberId, memberName, memberEmail);
        library.addMember(member);
        System.out.println("Member added successfully.");
    }

    public static void borrowBook() {
        System.out.print("Enter Member ID : ");
        String memberId = scanner.nextLine();
        System.out.print("Enter Book ID : ");
        String bookId = scanner.nextLine();

        library.borrowBook(memberId, bookId);

    }

    public static void returnBook() {
        System.out.print("Enter Member ID : ");
        String memberId = scanner.nextLine();
        System.out.print("Enter Book ID : ");
        String bookId = scanner.nextLine();

        library.returnBook(memberId, bookId);

    }

}