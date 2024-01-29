package Questions;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class Test4 {
    Question4 q4 = new Question4();
    public void actualLogic(String str,String expected){
        String actual = q4.reverseString(str);
        assertEquals(actual,expected);
    }
    @Test
    public void testMethod1(){
        String str = "java";
        String expected = "avaj";
        actualLogic(str,expected);
    }
    @Test
    public void testMethod2(){
        String str = " ab ";
        String expected = "ba";
        actualLogic(str,expected);
    }
    @Test
    public void testMethod3(){
        String str = "123 d ";
        String expected = "d321";
        actualLogic(str,expected);
    }
    @Test
    public void testMethod4(){
        String str = "1 a 3 v f g h a";
        String expected = "ahgfv3a1";
        actualLogic(str,expected);
    }
    @Test
    public void testMethod5(){
        String str = " -1a b gdb";
        String expected = "bdgba1-";
        actualLogic(str,expected);
    }
    @Test
    public void testMethod6(){
        String str = "98i12";
        String expected = "21i89";
        actualLogic(str,expected);
    }
}
