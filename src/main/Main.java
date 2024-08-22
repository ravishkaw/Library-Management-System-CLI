package main;

import models.Book;
import services.Library;

import java.util.*;

public class Main {
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

            }
        }

    }

    public static void showMenu() {
        System.out.println("\n1. Add Book");
        System.out.println("2. Add Member");
        System.out.println("3. Borrow Book");
        System.out.println("4. Return Book");
        System.out.println("5. List Available Books");
        System.out.println("6. Save Library Data");
        System.out.println("7. Load Library Data");
        System.out.println("8. Exit");
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
        System.out.println("Book added successfully.");

    }

}