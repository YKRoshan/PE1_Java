import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

        Palindrome que ;
        @Before
        public void setUp() throws Exception {
            System.out.println("Inside the setup.");
            que=new Palindrome();
        }

        @After
        public void tearDown() throws Exception {
            System.out.println("Inside the teardown.");
            que=null;

        }

        @Test
        public void palindrome() {
            boolean actual=que.palindrome(2468642);
            assertEquals(true,actual);

        }

        @Test
        public void evenNumberSum() {
            long actual=que.evenNumberSum(2468642);

            assertEquals(32,actual);
        }

}