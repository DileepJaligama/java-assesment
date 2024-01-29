package Questions;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;
public class Test17 {
    Question17 Q17 = new Question17();
    public void actualLogic(int start,int end,int expected){
        ArrayList<Integer> actual = Q17.armStrongNumbers(start,end);
        int actualSize = actual.size();
        assertEquals(actualSize,expected);
    }
    @Test
    public  void testMethod1(){
        int start = 100;
        int end = 1000;
        int expectedSize = 4;
        actualLogic(start,end,expectedSize);
    }

    @Test
    public  void testMethod2(){
        int start = 200;
        int end = 500;
        int expectedSize = 3;
        actualLogic(start,end,expectedSize);
    }

    @Test
    public  void testMethod3(){
        int start = 1000;
        int end = 2000;
        int expectedSize = 0;
        actualLogic(start,end,expectedSize);
    }

    @Test
    public  void testMethod4(){
        int start = 2000;
        int end = 3000;
        int expectedSize = 0;
        actualLogic(start,end,expectedSize);
    }

    @Test
    public  void testMethod5(){
        int start = 1000;
        int end = 1010;
        int expectedSize = 0;
        actualLogic(start,end,expectedSize);
    }

    @Test
    public  void testMethod6(){
        int start = 400;
        int end = 500;
        int expectedSize = 1;
        actualLogic(start,end,expectedSize);
    }


}
