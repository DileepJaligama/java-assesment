package Questions;

import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class Test21 {
    Question21 Q21 = new Question21();
    public void actualLogic(double a,double b,double c,double expected){
        double actual = Q21.largestNumber(a,b,c);
        assertEquals(actual,expected);
    }

    @Test
    public void testMethod1(){
        double a = 1;
        double b = 0.25;
        double c  = -1;
        double expected = 1;
        actualLogic(a,b,c,expected);
    }
    @Test
    public void testMethod2(){
        double a = 0;
        double b = -0.25;
        double c  = -1;
        double expected = 0;
        actualLogic(a,b,c,expected);
    }
    @Test
    public void testMethod3(){
        double a = 999.25;
        double b = 999.5;
        double c  = 999.1;
        double expected = 999.5;
        actualLogic(a,b,c,expected);
    }
    @Test
    public void testMethod4(){
        double a = -0.02;
        double b = -0.2;
        double c  = -0.01;
        double expected = -0.01;
        actualLogic(a,b,c,expected);
    }
    @Test
    public void testMethod5(){
        double a = 10;
        double b = 0.25;
        double c  = -1;
        double expected = 10;
        actualLogic(a,b,c,expected);
    }
    @Test
    public void testMethod6(){
        double a = 100;
        double b = 200;
        double c  = 50;
        double expected = 200;
        actualLogic(a,b,c,expected);
    }

}
