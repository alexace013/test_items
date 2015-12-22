package hw2.library;

import java.util.ArrayList;
import java.util.List;

/*
*  Предметная область - Библиотека
   Основные классы: Библиотека, Книга, Читатель

   Написать программу позволяющую узнать следующую информацию:
     1) посмотреть список читателей ++
     2) посмотреть список доступных книг ++
     3) добавить книгу в библиотеку ++
     4) добавить читателя в список читателей ++
     5) выдать книгу читателю (если книга есть в наличии). ++
        Читателю запрещается брать больше 3-х книг. +
     6) посмотреть список книг, которые находятся у читателей ++
     7) посмотреть список книг, которые находятся у конкретного читателя ++
     8) добавить читателя в черный список (ему нельзя выдавать книги) ++
     9) посмотреть книги конкретного автора ++
     10) посмотреть новые книги (год издания выше 2013) ++

* */

public class Library {

    private final int MAX_READERS_SIZE = 40; // max places in library
    private final int MAX_BOOKS_SIZE = 20_000; // max quantity books in library
    private String libraryName = null;
    private List<Reader> readers;
    private List<Book> books;
    private List<Reader> blackListReaders = new ArrayList<>(5);

    // DEFAULT constructor
    public Library() {
        this.libraryName = "DEFAULT LIBRARY";
        readers = new ArrayList<Reader>(MAX_READERS_SIZE);
        books = new ArrayList<Book>(MAX_BOOKS_SIZE);
    }

    public Library(String name) {
        readers = new ArrayList<Reader>(MAX_READERS_SIZE);
        books = new ArrayList<Book>(MAX_BOOKS_SIZE);
        this.libraryName = name;
    }

    // добавить книгу в библиотеку
    public String addBookInLibrary(Book book) {
        books.add(book);
        return String.format("Book: %s, author: %s add to %s",
                book.getBookName(), book.getAuthor(), getLibraryName());
    }

    // добавить читателя в список читателей
    public String addReaderInReadersList(Reader reader) {
        reader.setTablePlace(readers.size() + 1);
        readers.add(reader);
        return String.format("Reader %s sat down at the table %s",
                reader.getReaderName(), reader.getTablePlace());
    }

    // посмотреть список доступных книг
    public String getFreeBooksList() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).isBookShelf()) {
                builder.append(String.format("%s, %s (book id: %s)",
                        books.get(i).getBookName(), books.get(i).getAuthor(),
                        books.get(i).getBOOK_ID()) + "\n");
            }
        }
        return builder.toString();
    }

    // посмотреть список читателей
    public String getReadersList() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < readers.size(); i++) {
            builder.append(String.format("%s sat down at the table #%d\n",
                    readers.get(i).getReaderName(), readers.get(i).getTablePlace()));
        }
        return builder.toString();
    }

    // выдать книгу читателю (если книга есть в наличии).
    public void setBookForReader(Book book, int tableNumber) {

        Book tmpBook = book;

        if (book.isBookShelf() == true &&
                readers.get(tableNumber - 1).isFreeBook() &&
                readers.get(tableNumber - 1).isIssuingBook() == true) {
            readers.get(tableNumber - 1).addBook(tmpBook);
            readers.get(tableNumber - 1).indexIncrement();
            book.setBookShelf(false);
        } else {
            System.out.println(String.format("the book \"%s\" is not there", book.getBookName()));
        }

    }

    // посмотреть список книг, которые находятся у читателей
    public String allBooksReaders() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < readers.size(); i++) {
            builder.append("table #" + readers.get(i).getTablePlace() +
                    " have books: " + readers.get(i).getBooksToString() + "\n");
        }
        return builder.toString();
    }

    // посмотреть список книг, которые находятся у конкретного читателя
    public String allBooksReader(String readerName) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < readers.size(); i++) {
            if (readerName.equals(readers.get(i).getReaderName())) {
                builder.append(String.format("reader %s have this books: \n%s",
                        readerName, readers.get(i).getBooksToString()));
            }
        }
        return builder.toString();
    }

    // добавить читателя в черный список (ему нельзя выдавать книги)
    public void addReaderToBlackList(Reader reader) {
        blackListReaders.add(reader);
        reader.setIssuingBook(false);
        System.out.println(String.format("Reader %s add to black list.", reader.getReaderName()));
    }

    // посмотреть книги конкретного автора
    public String getAuthorBooks(String author) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < books.size(); i++) {
            if (author.equals(books.get(i).getAuthor())) {
                builder.append(books.get(i).getBookName() + "\n");
            }
        }
        return builder.toString();
    }

    // посмотреть новые книги (год издания выше 2013)
    public String getYearBooks(int year) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getYear() >= year) {
                builder.append(String.format("book: %s, author: %s, year: %d",
                        books.get(i).getBookName(), books.get(i).getAuthor(),
                        books.get(i).getYear()) + "\n");
            }
        }
        return builder.toString();
    }

    public String getLibraryName() {
        return libraryName;
    }

}
