import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateSumOfNumbersTest {
    CalculateSumOfNumbers obj;

    @Before
    public void setUp() throws Exception {
        obj=new CalculateSumOfNumbers();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }
    @Test
    public void calculateSumTest1(){
        int actual = obj.calculateSum("12 23 2 4");
        int expected = 41;
        assertEquals(expected,actual);
    }
    @Test
    public void calculateSumTest2(){
        int actual = obj.calculateSum("22 4 5 6 33 9");
        int expected = 79;
        assertEquals(expected,actual);
    }
}