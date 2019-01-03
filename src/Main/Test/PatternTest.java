import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {

    Pattern obj;
    @Before
    public void setUp() throws Exception {
        System.out.println("Inside setup.");
        obj=new Pattern();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Inside teardown.");
        obj=null;
    }

    @Test
    public void printPattern() {
        String expected = "1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 ";
        String actual = obj.printPattern(6);
        assertEquals(expected,actual);
    }
}