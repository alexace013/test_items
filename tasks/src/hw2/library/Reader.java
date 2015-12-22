package hw2.library;

import java.util.ArrayList;
import java.util.UUID;

public class Reader {

    private String readerName;
    private static final UUID READER_ID = UUID.randomUUID();
    private int tablePlace;
    private ArrayList<Book> books;
    private final int MAX_BOOKS_SIZE = 2; // the maximum number of books that can take the reader
    private int index = 0;
    private boolean freeBook = checkPlace(); // free or busy book
    private boolean issuingBook;

    // DEFAULT constructor
    public Reader() {
        readerName = "DEFAULT READER";
        books = new ArrayList<Book>(MAX_BOOKS_SIZE);
        issuingBook = true;
    }

    public Reader(String readerName) {
        this.readerName = readerName;
        books = new ArrayList<Book>(MAX_BOOKS_SIZE);
        issuingBook = true;
    }

    public String getReaderName() {
        return readerName;
    }

    public int getTablePlace() {
        return tablePlace;
    }

    public void setTablePlace(int tablePlace) {
        this.tablePlace = tablePlace;
    }

    public UUID getReaderId() {
        return READER_ID;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public String getBooksToString() {
        StringBuilder builder = new StringBuilder();
        for (Book book : books) {
            builder.append(book.getBookName() + " / " + book.getAuthor() + "\n");
        }
        return builder.toString();
    }

    // method add book to the list of reader
    public void addBook(Book book) {
        if (!isIssuingBook()) {
            System.out.println("Your add to black list.");
            return;
        }
        if (checkPlace()) {
            book.setBookShelf(false);
            books.add(book);
            indexIncrement();
        } else {
            System.out.println("sorry, you have a maximum of books.");
        }
    }

    // index advance (increment)
    protected void indexIncrement() {
        index++;
    }

    // check on the number of books the reader (max books: 3)
    private boolean checkPlace() {
        if (index > MAX_BOOKS_SIZE) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isFreeBook() {
        return freeBook;
    }

    public void setIssuingBook(boolean issuingBook) {
        this.issuingBook = issuingBook;
    }

    public boolean isIssuingBook() {
        return issuingBook;
    }
}
