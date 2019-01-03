import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class GuessedNumberGameTest {
    GuessedNumberGame obj;
    private static final String Inp="23 44 34";
    ByteArrayInputStream input=new ByteArrayInputStream(Inp.getBytes());

    @Before
    public void setUp() throws Exception {
        obj=new GuessedNumberGame();
        System.setIn(input);
    }

    @Test
    public void gameTest() {
        Boolean answer=obj.game(34);
        Boolean a=true;
        assertEquals(a,answer);
    }
}