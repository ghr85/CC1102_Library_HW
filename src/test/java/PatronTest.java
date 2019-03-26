import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PatronTest {
    private Patron patron;
    private Book book;

    @Before
    public void before(){
        patron = new Patron("Davey");
        book = new Book("The iliad", "Homer","Classic",-750);
    }

    @Test

    public void hasName(){
        assertEquals("Davey",patron.getName());
    }

    @Test
    public void startsWithEmptySubscriptions(){
        assertEquals(0,patron.countBooks());
    }

    @Test
    public void canRentBook(){
        patron.rentBook(book);
        assertEquals(1,patron.countBooks());
    }

    @Test
    public void canReturnBook(){
        patron.rentBook(book);
        patron.returnBook(book);
        assertEquals(0,patron.countBooks());
    }
}
