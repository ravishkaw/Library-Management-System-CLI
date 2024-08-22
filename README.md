# Library Management System (CLI)

A simple command-line interface (CLI) application for managing a library. This system allows you to add books, register members, borrow and return books, and save/load library data to/from a file.

## Features

- **Add Books:** Register new books by providing details like ID, title, author, and genre.
- **Register Members:** Add new members to the library with a unique ID, name, and email.
- **Borrow Books:** Members can borrow books from the library.
- **Return Books:** Members can return borrowed books.
- **List Available Books:** View a list of all books currently available in the library.
- **Save Library Data:** Save the current state of the library (books, members, transactions) to a file.
- **Load Library Data:** Load the library state from a previously saved file.

## Project Structure

- `models/`: Contains classes for `Book` and `Member`.
- `services/`: Contains the core functionality of the system.
- `main/`: Contains the `Main` class that handles user interaction through the CLI.

## Technologies Used

- **Java**: The application is built entirely using Java, leveraging concepts like OOP, collections, and file handling.


## Usage

Upon running the application, you'll be presented with a menu offering various options to manage the library. Select an option by entering the corresponding number.

Example workflow:
1. Add a book.
2. Register a member.
3. Borrow a book.
4. Return a book.
5. View books and members details