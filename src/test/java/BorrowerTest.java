import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book;
    private Book book2;
    private Book book3;
    private Library library;
    private Borrower borrower;


    @Before
    public void before() {
        book = new Book("Of Mice and Men", "John Steinbeck", "Literary Fiction");
        book2 = new Book("The Pearl", "John Steinbeck", "Literary Fiction");
        book3 = new Book("1984", "George Orwell", "Science Fiction");

        library = new Library(5);

        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);

        borrower = new Borrower();

    }

    @Test
    public void hasEmptyCollection(){
        assertEquals(0, borrower.collectionSize());
    }

    @Test
    public void canTakeBookFromLibrary(){

        borrower.takeBook(library);
        assertEquals(2, library.numberOfBooks());
        assertEquals(1, borrower.collectionSize());

    }

    @Test
    public void cannotTakeTooManyBooksFromLibrary(){

        borrower.takeBook(library);
        borrower.takeBook(library);
        borrower.takeBook(library);
        borrower.takeBook(library);
        assertEquals(0, library.numberOfBooks());
        assertEquals(3, borrower.collectionSize());

    }


}
