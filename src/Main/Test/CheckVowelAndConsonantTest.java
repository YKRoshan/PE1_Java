import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckVowelAndConsonantTest {
    //a Vowel
    //p Consonant
    CheckVowelAndConsonant obj;
    @Before
    public void setUp() {
        System.out.println("Inside setup");
        obj=new CheckVowelAndConsonant();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        obj = null;
    }

    @Test
    public void checkVowelAndConsonant() {
        String actual;
        String expected = "a Vowel p Consonant ";
       actual = obj.checkVowelAndConsonant("ap");
       assertEquals(expected,actual);
    }
    @Test
    public void test2(){
        String actual;
        String expected = "a Vowel ";
        actual = obj.checkVowelAndConsonant("a");
        assertEquals(expected,actual);
    }
}