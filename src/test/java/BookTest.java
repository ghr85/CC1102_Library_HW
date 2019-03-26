import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {
    private Book book;
    @Before
    public void before(){
        book = new Book("The iliad", "Homer","Classic",-750);
    }
    @Test
    public void hasTitle(){
        assertEquals("The iliad", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Homer",book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Classic", book.getGenre());
    }

    @Test
    public void hasDate(){
        assertEquals(-750,book.getDate(),0.0);
    }

}
