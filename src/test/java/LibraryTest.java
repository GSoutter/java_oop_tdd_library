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



}
