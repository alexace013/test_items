package hw2.library;

/**
 * Created by alexander on 21.12.15.
 */
public class LibraryMain {

    public static void main(String[] args) {

        Library library = new Library("Washington Library of South Dakota");
//        Library testLibrary = new Library();

        System.out.println(library.getLibraryName());
//        System.out.println(testLibrary.getLibraryName());

        Book book = new Book("OOP", "Bob Truck");
        Book book1 = new Book("Most Interesting Patterns, who using in office", "Clark Dickenson");
        Book book2 = new Book("K.Family", "Shevchenko Taras");
        Book book3 = new Book("Awesome coding", "Patrick Jonson");
        Book book4 = new Book("My best friend my computer", "Samanta Detritch");
        Book book5 = new Book("Learn clean code", "Frank Wasovski");
        Book book6 = new Book("TDD & other", "Robert Cristopher");
        Book book7 = new Book("Coder life", "Jesica Brunch");
        Book book8 = new Book("Tester my code", "Pedro Maerdinni");
        Book book9 = new Book("Greatest algoritms to the world", "Lisa Cranch & Piter Rubert");
        Book book10 = new Book();

        System.out.println("\n========== BOOKS ADD TO LIBRARY ==========\n");

        System.out.println(library.addBookInLibrary(book));
        System.out.println(library.addBookInLibrary(book1));
        System.out.println(library.addBookInLibrary(book2));
        System.out.println(library.addBookInLibrary(book3));
        System.out.println(library.addBookInLibrary(book4));
        System.out.println(library.addBookInLibrary(book5));
        System.out.println(library.addBookInLibrary(book6));
        System.out.println(library.addBookInLibrary(book7));
        System.out.println(library.addBookInLibrary(book8));
        System.out.println(library.addBookInLibrary(book9));
        System.out.println(library.addBookInLibrary(book10));

        System.out.println("\n========== GET BOOKS LIST ==========\n");
        System.out.println(library.getFreeBooksList());

        Reader reader = new Reader("Dave");
        Reader reader2 = new Reader("Marta");
        Reader reader3 = new Reader("Steaven");
        Reader reader4 = new Reader("Kurt");

        System.out.println("\n========== CREATE AND ADD READERS ==========\n");

        System.out.println(library.addReaderInReadersList(reader));
        System.out.println(library.addReaderInReadersList(reader2));
        System.out.println(library.addReaderInReadersList(reader3));
        System.out.println(library.addReaderInReadersList(reader4));

        reader.addBook(book);
        reader.addBook(book1);
        reader.addBook(book2);
        reader2.addBook(book10);
        reader2.addBook(book9);
        reader3.addBook(book5);
        reader3.addBook(book6);
        library.setBookForReader(book8, 4);

        System.out.println("\n========== ALL BOOKS READERS ==========\n");
        System.out.println(library.allBooksReaders());

        System.out.println("\n========== GET BOOKS LIST ==========\n");
        System.out.println(library.getFreeBooksList());

        System.out.println("\n========== GET READERS LIST ==========\n");
        System.out.println(library.getReadersList());

        System.out.println("\n========== GET READER BOOKS ==========\n");
        System.out.println(reader4.getBooksToString());

        // add a book that another reader
        library.setBookForReader(book8, 2);
        // adding a book that is not included in a limited number of
        library.setBookForReader(book7, 1);
        // add a book that another reader
        library.setBookForReader(book, 2);

        System.out.println("\n========== GET BOOKS LIST ==========\n");
        System.out.println(library.getFreeBooksList());



    }

}
