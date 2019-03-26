import org.junit.Before;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;

public class LibraryTest {
   private Library library;
@Before
    public void before(){
    library = new Library("The Turning Leaf");
}
@Test
    public void hasName(){
    assertEquals("The Turning Leaf",library.getName());
}

@Test
    public void startsWithEmptyStock(){
    assertEquals(0, library.stockCount());
}

@Test
    public void canAddBookToStock(){
    library.addBook(book);
    assertEquals(1,library.stockCount());
}
}
