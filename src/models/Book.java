package models;

public class Book {

    private String id;
    private String title;
    private String author;
    private String genre;
    private boolean isBorrowed = false;

    public Book(String bookId, String bookName, String author, String genre) {
        this.id = bookId;
        this.title = bookName;
        this.author = author;
        this.genre = genre;
    }

    public String getBookId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.isBorrowed = borrowed;
    }


    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

}