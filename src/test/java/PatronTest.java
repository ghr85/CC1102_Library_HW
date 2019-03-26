import org.junit.Before;
import org.junit.Test;

public class PatronTest {
    private Patron patron;

    @Before
    public void before(){
        patron = new Patron("Davey");
    }

    @Test

    public void hasName(){
        assertEquals("Davey",patron.getName());
    }
}
