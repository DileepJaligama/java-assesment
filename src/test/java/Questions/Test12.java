package Questions;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.expectThrows;

public class Test12 {
    Question12 q12 = new Question12();
    public void actualLogic(int[] arr ,long expected){
        long actual = q12.calculateProduct(arr);
        assertEquals(actual,expected);
    }
    @Test
    public void testMethod1(){
        int []arr = {12,1};
        long  expected = 12;
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod2(){
        int []arr = {12,1,2,2};
        long  expected = 48;
        actualLogic(arr,expected);
    }@Test
    public void testMethod3(){
        int []arr = {-1,1,-2};
        long  expected = 2;
        actualLogic(arr,expected);
    }@Test
    public void testMethod4(){
        int []arr = {0,1};
        long  expected = 0;
        actualLogic(arr,expected);
    }@Test
    public void testMethod5(){
        int []arr = {0,1,5,-2};
        long  expected = 0;
        actualLogic(arr,expected);
    }@Test
    public void testMethod6(){
        int []arr = {4,3,1};
        long  expected = 12;
        actualLogic(arr,expected);
    }
}
