package Questions;

import org.testng.Assert;
import org.testng.annotations.Test;
public class Test26 {
    Question26 Q26 = new Question26();
    public void actualLogic(int [] arr,int [] expected){
        int []  actual = Q26.sortAscending(arr);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testMethod1(){
        int [] arr = {2,5,1,0};
        int [] expected = {0,1,2,5};
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod2(){
        int [] arr = {-99,8,5,4,99,55};
        int [] expected = {-99,4,5,8,55,99};
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod3(){
        int [] arr = {0,0,0,1,-5,-2};
        int [] expected = {-5,-2,0,0,0,1};
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod4(){
        int [] arr = {-8,-9,-5,-4,-1};
        int [] expected = {-9,-8,-5,-4,-1};
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod5(){
        int [] arr = {999,888,777,666};
        int [] expected = {666,777,888,999};
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod6(){
        int [] arr = {0,0,-5,1,6};
        int [] expected = {-5,0,0,1,6};
        actualLogic(arr,expected);
    }
}
