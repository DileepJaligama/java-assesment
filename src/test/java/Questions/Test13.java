package Questions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
public class Test13 {

    Question13 q13 = new Question13();
    public  void  actualLogic(String s,String expected){
        String actual = q13.stringSorting(s);
        assertEquals(actual,expected);
    }
    @Test
    public  void testMethod1(){
        String  s = "ba";
        String expected = "ab";
        actualLogic(s,expected);
    }

    @Test
    public  void testMethod2(){
        String  s = "b  a";
        String expected = "ab";
        actualLogic(s,expected);
    }

    @Test
    public  void testMethod3(){
        String  s = "  ba";
        String expected = "ab";
        actualLogic(s,expected);
    }
    @Test
    public  void testMethod4(){
        String  s = " w r e";
        String expected = "erw";
        actualLogic(s,expected);
    }
    @Test
    public  void testMethod5(){
        String  s = "321";
        String expected = "123";
        actualLogic(s,expected);
    }
    @Test
    public  void testMethod6(){
        String  s = "zyx";
        String expected = "xyz";
        actualLogic(s,expected);
    }
}
