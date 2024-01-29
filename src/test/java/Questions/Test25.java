package Questions;

import org.testng.Assert;
import org.testng.annotations.Test;
public class Test25 {
    Question25 Q25 = new Question25();
    public void actualLogic(String str,String expected){
        String actual = Q25.reverseCase(str);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testMethod1(){
        String str = "HELLO";
        String expected = "hello";
        actualLogic(str,expected);
    }

    @Test
    public void testMethod2(){
        String str = "HelLo";
        String expected = "hELlO";
        actualLogic(str,expected);
    }

    @Test
    public void testMethod3(){
        String str = " j a v a ";
        String expected = "JAVA";
        actualLogic(str,expected);
    }
    @Test
    public void testMethod4(){
        String str = " a B c D ";
        String expected = "AbCd";
        actualLogic(str,expected);
    }
    @Test
    public void testMethod5(){
        String str = "samplE";
        String expected = "SAMPLe";
        actualLogic(str,expected);
    }
    @Test
    public void testMethod6(){
        String str = " 5t  e s Ting";
        String expected = "5TEStING";
        actualLogic(str,expected);
    }
}
