package hw2.library;

import java.util.concurrent.atomic.AtomicInteger;

public class Book {

    private final AtomicInteger BOOK_ID = new AtomicInteger((int)(Math.random() * this.hashCode()));
    private String bookName;
    private String author;
    private boolean bookShelf;

    public Book() {
        bookName = "DEFAULT BOOK";
        author = "DEFAULT AUTHOR";
        bookShelf = true;
    }

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
        bookShelf = true;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getBOOK_ID() {
        return BOOK_ID.get();
    }

    public boolean isBookShelf() {
        return bookShelf;
    }

    public void setBookShelf(boolean bookShelf) {
        this.bookShelf = bookShelf;
    }
}
