import org.junit.Before;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;

public class LibraryTest {
   private Library library;
   private Book book;
@Before
    public void before(){
    library = new Library("The Turning Leaf", 4);
    book = new Book("The iliad", "Homer","Classic",-750);
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
    public void canAddBookToStock_positive(){
    library.addBook(book);
    assertEquals(1,library.stockCount());
}
@Test
    public void hasCapacity(){
    assertEquals(4,library.getCapacity());
}

@Test
    public void canAddBookToStock_negative(){
    library.addBook(book);
    library.addBook(book);
    library.addBook(book);
    library.addBook(book);
    library.addBook(book);
    assertEquals(4, library.stockCount());
}

@Test
    public void canCheckOutBook(){
    library.addBook(book);
    library.checkOutBook(book);
    assertEquals(0,library.stockCount());
}


}
