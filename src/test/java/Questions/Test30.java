package Questions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test30 {
    Question30 q30 = new Question30();
    public void actualLogic(int [] arr,int expected){
        int actual = q30.findMinElement(arr);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testMethod1(){
        int [] arr = {0,1,2,3,4};
        int expected = 0;
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod2(){
        int [] arr = {-99,44,44,-188};
        int expected = -188;
        actualLogic(arr,expected);
    }

    @Test
    public void testMethod3(){
        int [] arr = {0,5,4,-991};
        int expected = -991;
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod4(){
        int [] arr = {56,44,87};
        int expected = 44;
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod5(){
        int [] arr = {32,23,56,65};
        int expected = 23;
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod6(){
        int [] arr = {4,5,4,6,1};
        int expected = 1;
        actualLogic(arr,expected);
    }
}
