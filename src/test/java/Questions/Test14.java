package Questions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test14 {
    Question14 Q14 = new Question14();
    public  void actualLogic(double num,boolean expeced){
        boolean actual = Q14.trueOrFalse(num);
        assertEquals(actual,expeced);
    }
    @Test
    public  void testMethod1(){
        int num = 14587;
        boolean expected = true;
        actualLogic(num,expected);
    }
    @Test
    public  void testMethod2(){
        double num = -1.4587;
        boolean expected = false;
        actualLogic(num,expected);
    }
    @Test
    public  void testMethod3(){
        double num = 0.14587;
        boolean expected = true;
        actualLogic(num,expected);
    }
    @Test
    public  void testMethod4(){
        int num = -88 * 2;
        boolean expected = false;
        actualLogic(num,expected);
    }
    @Test
    public  void testMethod5(){
        int num = 0;
        boolean expected = true;
        actualLogic(num,expected);
    }
    @Test
    public  void testMethod6(){
        int num = -14587;
        boolean expected = false;
        actualLogic(num,expected);
    }
}
