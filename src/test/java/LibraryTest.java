import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;
    private Book book2;
    private Book book3;
    private Library library;

    @Before
    public void before() {
        book = new Book("Of Mice and Men", "John Steinbeck", "Literary Fiction");
        book2 = new Book("The Pearl", "John Steinbeck", "Literary Fiction");
        book3 = new Book("1984", "George Orwell", "Science Fiction");

        library = new Library(5);

    }

    @Test
    public void getCapacity(){
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void getNumberOfBooks(){
        assertEquals(0, library.numberOfBooks());
    }

    @Test
    public void canAddBooks(){
        library.addBook(book);
        library.addBook(book2);
        assertEquals(2, library.numberOfBooks());
    }

    @Test
    public void cannotAddTooManyBooks(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book2);
        library.addBook(book2);
        library.addBook(book2);
        library.addBook(book2);
        assertEquals(5, library.numberOfBooks());
    }

    @Test
    public void canRemoveBooks(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book2);
        library.removeBook();
        assertEquals(2, library.numberOfBooks());
    }

    @Test
    public void cannotRemoveTooManyBooks(){
        library.addBook(book);
        library.removeBook();
        library.removeBook();
        library.removeBook();
        assertEquals(0, library.numberOfBooks());
    }


    @Test
    public void canGetNumberofBooksInGenreFromHash(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.numberOfBooksByGenre("Literary Fiction"));
    }

    @Test
    public void canGetNumberofBooksInGenreFromHashWhenRemoved(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.removeBook();
        assertEquals(1, library.numberOfBooksByGenre("Literary Fiction"));
    }


    public void systemOutTest(){

    }



}
