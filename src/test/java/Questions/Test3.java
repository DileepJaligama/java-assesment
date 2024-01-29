package Questions;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class Test3 {
    Question3 q3 = new Question3();
    public void actualLogic(String a,String b,String expected){
        String actual = q3.program(a,b);
        assertEquals(actual,expected);
    }
    @Test
    public void testMethod1(){
        String a = "abc   ";
        String b = "     def";
        String expected = "adbecf";
        actualLogic(a,b,expected);
    }
    @Test
    public void testMethod2(){
        String a = "azf";
        String b = "cdf";
        String expected = "aczdff";
        actualLogic(a,b,expected);
    }
    @Test
    public void testMethod3(){
        String a = " abc  hd";
        String b = "c df";
        String expected = "acbdcfhd";
        actualLogic(a,b,expected);
    }
    @Test
    public void testMethod4(){
        String a = "a";
        String b = "cd";
        String expected = "acd";
        actualLogic(a,b,expected);
    }
    @Test
    public void testMethod5(){
        String a = "";
        String b = "ab";
        String expected = "ab";
        actualLogic(a,b,expected);
    }
    @Test
    public void testMethod6(){
        String a = " zxl";
        String b = "";
        String expected = "zxl";
        actualLogic(a,b,expected);
    }
}
