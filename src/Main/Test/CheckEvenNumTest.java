import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckEvenNumTest {

    CheckEvenNum obj;
    @Before
    public void setUp() throws Exception {
        obj=new CheckEvenNum();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void sortTest() {
        int []arr=obj.sort(123456);
        int[] arr2=new int[20];
        arr2[0]=6;
        arr2[1]=5;
        arr2[2]=4;
        arr2[3]=3;
        arr2[4]=2;
        arr[5]=0;
    assertArrayEquals(arr2,arr);
    }

    @Test
    public void sumOfEvenTest() {
        int []arr=obj.sort(123456);
        boolean actual=obj.sumOfEvenNum(arr,20);
        boolean expected = false;
        assertEquals(expected,actual);
    }
}