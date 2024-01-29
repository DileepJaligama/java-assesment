package Questions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test29 {
    Question29 q29 = new Question29();
    public void actualLogic(int num,boolean expected){
        boolean actual = q29.isPalindrome(num);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testMethod1(){
        int num = 121;
        boolean expected = true;
        actualLogic(num,expected);
    }

    @Test
    public void testMethod2(){
        int num = 122;
        boolean expected = false;
        actualLogic(num,expected);
    }
    @Test
    public void testMethod3(){
        int num = 333;
        boolean expected = true;
        actualLogic(num,expected);
    }
    @Test
    public void testMethod4(){
        int num = 144;
        boolean expected = false;
        actualLogic(num,expected);
    }
    @Test
    public void testMethod5(){
        int num = 299;
        boolean expected = false;
        actualLogic(num,expected);
    }
    @Test
    public void testMethod6(){
        int num = 292;
        boolean expected = true;
        actualLogic(num,expected);
    }
}
