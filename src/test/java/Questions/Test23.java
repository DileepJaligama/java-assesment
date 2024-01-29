package Questions;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Test23 {
    Question23 Q23 = new Question23();
    public void actualLogic(int [] arr,int [] expected){
        int [] actual = Q23.leftRotateByTwo(arr);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testMethod1(){
        int [] arr = {1,2,3,4,5,6};
        int [] expected = {3,4,5,6,1,2};
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod2(){
        int [] arr = {-1,-2,3,4,5,6};
        int [] expected = {3,4,5,6,-1,-2};
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod3(){
        int [] arr = {9,8,7,6,5,-4,-3};
        int [] expected = {7,6,5,-4,-3,9,8};
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod4(){
        int [] arr = {1,2,3,4,5,6};
        int [] expected = {3,4,5,6,1,2};
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod5(){
        int [] arr = {0,-99,88,-77,5,4};
        int [] expected = {88,-77,5,4,0,-99};
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod6(){
        int [] arr = {1,2,1,2};
        int [] expected = {1,2,1,2};
        actualLogic(arr,expected);
    }

}
