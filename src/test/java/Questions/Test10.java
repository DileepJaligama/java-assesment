package Questions;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class Test10 {
    Question10 q10 = new Question10();
    public void actualLogic(double fh,double expected){
        double actual = q10.convert(fh);
        assertEquals(actual,expected);
    }
    @Test
    public void testMethod1(){
        double f = 100;
        double expected = 37.77777777777778;
        actualLogic(f,expected);
    }

    @Test
    public void testMethod2(){
        double f = 32;
        double expected = 0;
        actualLogic(f,expected);
    }

    @Test
    public void testMethod3(){
        double f = 64;
        double expected = 17.77777777777778;
        actualLogic(f,expected);
    }

    @Test
    public void testMethod4(){
        double f = 77;
        double expected = 25;
        actualLogic(f,expected);
    }

    @Test
    public void testMethod5(){
        double f = 13;
        double expected = -10.555555555555555;
        actualLogic(f,expected);
    }

    @Test
    public void testMethod6(){
        double f = -148;
        double expected = -100;
        actualLogic(f,expected);
    }
}
