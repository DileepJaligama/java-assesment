package Questions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test15 {
    Question15 Q15 = new Question15();
    public void actualLogic(int num,boolean expected){
        boolean actual = Q15.isFibonacciNumber(num);
        assertEquals(actual,expected);
    }
    @Test
    public  void testMethod1(){
        int num = 55;
        boolean expected = true;
        actualLogic(num,expected);
    }
    @Test
    public  void testMethod2(){
        int num = 8;
        boolean expected = true;
        actualLogic(num,expected);
    }
    @Test
    public  void testMethod3(){
        int num = 4;
        boolean expected = false;
        actualLogic(num,expected);
    }
    @Test
    public  void testMethod4(){
        int num = 13;
        boolean expected = true;
        actualLogic(num,expected);
    }
    @Test
    public  void testMethod5(){
        int num = -7;
        boolean expected = false;
        actualLogic(num,expected);
    }
    @Test
    public  void testMethod6(){
        int num = 34;
        boolean expected = true;
        actualLogic(num,expected);
    }
}
