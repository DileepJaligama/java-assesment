package Questions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import static org.testng.Assert.assertEquals;

public class Test19 {
    Question19 Q19 = new Question19();

    public void actualLogic(int  num,int expected){
        int actual = Q19.reverseNumber(num);
        assertEquals(actual,expected);
    }
    @Test
    public void  testMethod1(){
        int num = 123456789;
        int expected = 987654321;
        actualLogic(num,expected);
    }

    @Test
    public void  testMethod2(){
        int num = 998906;
        int expected = 609899;
        actualLogic(num,expected);
    }

    @Test
    public void  testMethod3(){
        int num = 99988;
        int expected = 88999;
        actualLogic(num,expected);
    }

    @Test
    public void  testMethod4(){
        int num = 123;
        int expected = 321;
        actualLogic(num,expected);
    }

    @Test
    public void  testMethod5(){
        int num = 123;
        int expected = 321;
        actualLogic(num,expected);
    }

    @Test
    public void  testMethod6(){
        int num = 451;
        int expected = 154;
        actualLogic(num,expected);
    }
}
