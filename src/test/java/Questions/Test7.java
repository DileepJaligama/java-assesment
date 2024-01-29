package Questions;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class Test7 {
    Question7 q7 = new Question7();

    public void actualLogic(int first, int second, int[] expected) {
        int[] actual = q7.prime(first, second);
        assertEquals(actual, expected);
    }

    @Test
    public void testMethod1() {
        int first = 1;
        int second = 10;
        int[] expected = {2, 3, 5, 7};
        actualLogic(first, second, expected);
    }

    @Test
    public void testMethod2() {
        int first = 10;
        int second = 20;
        int[] expected = {11, 13, 17, 19};
        actualLogic(first, second, expected);
    }

    @Test
    public void testMethod3() {
        int first = 100;
        int second = 110;
        int[] expected = {101, 103, 107, 109};
        actualLogic(first, second, expected);
    }

    @Test
    public void testMethod4() {
        int first = 50;
        int second = 55;
        int[] expected = {53};
        actualLogic(first, second, expected);
    }

    @Test
    public void testMethod5() {
        int first = 200;
        int second = 220;
        int[] expected = {211};
        actualLogic(first, second, expected);
    }

    @Test
    public void testMethod6() {
        int first = 5;
        int second = 10;
        int[] expected = {5,7};
        actualLogic(first, second, expected);

    }
}