package Questions;

import org.testng.Assert;
import org.testng.annotations.Test;
public class Test27 {
    Question27 Q27 = new Question27();
    public void actualLogic(int arr[] ,int [] expected){
        int [] actual = Q27.removeDuplicates(arr);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testMethod1(){
        int [] arr = {1,2,2,3,2,4,5};
        int [] expected = {1,2,3,4,5};
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod2(){
        int [] arr = {-99,-88,88,99,-10,11};
        int [] expected = {-99,-88,88,99,-10,11};
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod3(){
        int [] arr = {0,-1,5,3,4,3};
        int [] expected = {0,-1,5,3,4};
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod4(){
        int [] arr = {5,5,5,4,4};
        int [] expected = {5,4};
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod5(){
        int [] arr = {0,0,1,1,2,2};
        int [] expected = {0,1,2};
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod6(){
        int [] arr = {5,4,3,2,1,1,2,3};
        int [] expected = {5,4,3,2,1};
        actualLogic(arr,expected);
    }
}
