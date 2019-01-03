import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomAndJerryTest {
    TomAndJerry obj;
    @Before
    public void setUp() {
        obj = new TomAndJerry();
        System.out.println("Inside the setup.");
    }

    @After
    public void tearDown() {
        System.out.println("Inside the teardown.");
        obj = null;
    }

    @Test
    public void fun() {
        String actual = obj.printTomOrJerry(23);
        String expected = "Tom";
        assertEquals(expected,actual);
    }

}