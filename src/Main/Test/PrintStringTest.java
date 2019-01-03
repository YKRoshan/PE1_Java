import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrintStringTest {

    PrintString obj;
    @Before
    public void setUp() throws Exception {
        obj= new PrintString();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void printStringSuccess() {
        String actual = obj.printString("Stackroute",5);
        String expected = "Stackrouterouterouterouterouteroute";
        assertEquals(expected,actual);
    }

    @Test
    public void printStringFail() {
        String actual = obj.printString("Stackroute",4);
        String expected = "Stackrouterouterouterouterouteroute";
        assertNotEquals(expected,actual);
    }
}