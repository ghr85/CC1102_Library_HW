import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PatronTest {
    private Patron patron;
    private Book book;
    private Library library;

    @Before
    public void before(){
        patron = new Patron("Davey");
        book = new Book("The iliad", "Homer","Classic",-750);
        library = new Library("The Turning Leaf", 4);
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
        library.addBook(book);
        patron.rentBook(library);
        assertEquals(1,patron.countBooks());
    }

    @Test
    public void canReturnBook(){
        library.addBook(book);
        patron.rentBook(library);
        patron.returnBook();
        assertEquals(0,patron.countBooks());
    }
}
