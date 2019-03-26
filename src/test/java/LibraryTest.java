import org.junit.Before;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;

public class LibraryTest {
   private LibraryTest libraryTest;
@Before
    public void before(){
    libraryTest = new LibraryTest("The Turning Leaf");
}
@Test
    public void hasName(){
    assertEquals("The Turning Leaf",libraryTest.getName());
}
}
