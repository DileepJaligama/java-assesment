package Questions;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Test9 {
    Question9 q9 = new Question9();
    public void actualLogic(int num,int expected){
        int actual = q9.sum(num);
        assertEquals(actual,expected);
    }
    @Test
    public void testMethod1(){
        int num = 521;
        int expected = 8;
        actualLogic(num,expected);
    }
    @Test
    public void testMethod2(){
        int num = 999;
        int expected = 27;
        actualLogic(num,expected);
    }
    @Test
    public void testMethod3(){
        int num = 1000;
        int expected = 1;
        actualLogic(num,expected);
    }
    @Test
    public void testMethod4(){
        int num = 101;
        int expected = 2;
        actualLogic(num,expected);
    }
    @Test
    public void testMethod5(){
        int num = 9991;
        int expected = 28;
        actualLogic(num,expected);
    }

    @Test
    public void testMethod6(){
        int num = 1999;
        int expected = 28;
        actualLogic(num,expected);
    }

}
