package Questions;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class Test5 {
    Question5 q5 = new Question5();
    public void actualLogic(int num,int expected){
        int actual = q5.factorial(num);
        assertEquals(actual,expected);
    }
    @Test
    public void testMethod1(){
        int num = 5;
        int expected = 120;
        actualLogic(num,expected);
    }
    @Test
    public void testMethod2(){
        int num = 7;
        int expected = 5040;
        actualLogic(num,expected);
    }
    @Test
    public void testMethod3(){
        int num = 10;
        int expected = 3628800;
        actualLogic(num,expected);
    }
    @Test
    public void testMethod4(){
        int num = 2;
        int expected = 2;
        actualLogic(num,expected);
    }
    @Test
    public void testMethod5(){
        int num = 4;
        int expected = 24;
        actualLogic(num,expected);
    }
    @Test
    public void testMethod6(){
        int num = 1;
        int expected = 1;
        actualLogic(num,expected);
    }
}
