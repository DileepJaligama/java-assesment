package Questions;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class Test1{

    Question1 q1 = new Question1();
    @Test

    public void testmethod1(){
        double len = 100.5;
        double breadth = 50.5;
        double actualResult = q1.areaOfRectangle( len, breadth);
        double expected = len * breadth;
        assertEquals(actualResult,expected);
    }
    @Test
    public void testMethod2(){
        double a = 1000.5;
        double b = 500;
        double actual = q1.areaOfRectangle(a,b);
        double expected = a*b;
        assertEquals(actual,expected);
    }
    @Test
    public void testMethod3(){
        double a = 0.5;
        double b = 155.2;
        double  actual  = q1.areaOfRectangle(a,b);
        double expected = a*b;
        assertEquals(actual,expected);
    }
    @Test
    public void testMethod4(){
        double a = 10.0;
        double b = 20.0;
        double actual = q1.areaOfRectangle(a,b);
        double expected = a*b;
        assertEquals(actual,expected);
    }
    @Test
    public void testMethod5(){
        double a = 99.99999;
        double b = 101.9888899;
        double actual = q1.areaOfRectangle(a,b);
        double expected = a*b;
        assertEquals(actual,expected);

    }
    @Test
    public void testMethod6(){
        double a = 0.9;
        double b = 101.2;
        double actual = q1.areaOfRectangle(a,b);
        double expected = a*b;
        assertEquals(actual,expected);
    }
}