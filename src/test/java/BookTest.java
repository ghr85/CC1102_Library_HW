import org.junit.Before;
import org.junit.Test;

public class BookTest {
    private Book book;
    @Before
    public void before(){
        book = new Book("The iliad", "Homer",-750);
    }
    @Test
    public void hasTitle(){
        assertEquals("The ilead", book.getTitle());
    }

}
