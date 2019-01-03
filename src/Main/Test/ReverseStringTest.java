import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString obj;
    @Before
    public void setUp() throws Exception {
        obj=new ReverseString();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void reverseStringSuccess() {
        String actual = obj.reverseString("London");
        String expected = "nodnoL";
        assertEquals(expected,actual);
    }
    @Test
    public void reverseStringFail() {
        String actual = obj.reverseString("StackRoute");
        String expected = "etuorkcatS";
        assertNotEquals(expected,actual);
    }
}