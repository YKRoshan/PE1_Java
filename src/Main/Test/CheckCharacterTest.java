import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckCharacterTest {
    CheckCharacter obj;

    @Before
    public void setUp() throws Exception {
        obj=new CheckCharacter();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void checkCharacterSuccess_1() {
        String actual = obj.checkCharacter('A');
        String expected = "Capital Letter";
        assertEquals(expected,actual);
    }
    @Test
    public void checkCharacterSuccess_2() {
        String actual = obj.checkCharacter('d');
        String expected = "Small Letter";
        assertEquals(expected,actual);
    }
    @Test
    public void checkCharacterSuccess_3() {
        String actual = obj.checkCharacter('2');
        String expected = "Number";
        assertEquals(expected,actual);
    }
    @Test
    public void checkCharacterSuccess_4() {
        String actual = obj.checkCharacter('@');
        String expected = "Special Symbol";
        assertEquals(expected,actual);
    }
}