package Questions;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;
public class Test18 {
    Question18 Q18 = new Question18();

    public void actualLogic(int [] num,double expected){
        double actual = Q18.calculateAverage(num);
        assertEquals(actual,expected);
    }
    @Test
    public void testMethod1(){
        int [] num = {1,2,3};
        double expected = 2;
        actualLogic(num,expected);
    }

    @Test
    public void testMethod2(){
        int [] num = {8,8,8};
        double expected = 8;
        actualLogic(num,expected);
    }
    @Test
    public void testMethod3(){
        int [] num = {2,0,2,3,0,0};
        double expected = 1.1666666666666667;
        actualLogic(num,expected);
    }
    @Test
    public void testMethod4(){
        int [] num = {1,2,5,0};
        double expected = 2;
        actualLogic(num,expected);
    }
    @Test
    public void testMethod5(){
        int [] num = {-1,-2,6};
        double expected = 1;
        actualLogic(num,expected);
    }
    @Test
    public void testMethod6(){
        int [] num = {1,2,-3};
        double expected = 0;
        actualLogic(num,expected);
    }
}
