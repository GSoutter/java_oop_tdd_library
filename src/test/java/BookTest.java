import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {


    private Book book;

    @Before
    public void before() {

        book = new Book("Of Mice and Men", "John Steinbeck", "Literary Fiction");
    }

    @Test
    public void canGetTitle(){
        assertEquals("Of Mice and Men", book.getTitle());
    }
    @Test
    public void canGetAuthor(){
        assertEquals("John Steinbeck", book.getAuthor());
    }
    @Test
    public void canGetGenre(){
        assertEquals("Literary Fiction", book.getGenre());
    }

}
