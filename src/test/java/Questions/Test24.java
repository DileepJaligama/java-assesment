package Questions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test24 {
    Question24 Q24 = new Question24();
    public  void actualLogic(int [] arr,int ele,int [] expected){
        int [] actual = Q24.removeElementFromArray(arr,ele);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testMethod1(){
        int [] arr = {1,1,2,3,4,5,6};
        int ele = 1;
        int [] expected = {2,3,4,5,6};
        actualLogic(arr,ele,expected);
    }

    @Test
    public void testMethod2(){
        int [] arr = {1,-2,3,4,5,6};
        int ele = -2;
        int [] expected = {1,3,4,5,6};
        actualLogic(arr,ele,expected);
    }

    @Test
    public void testMethod3(){
        int [] arr = {0,0,0,1,5,-4,3,-2,0};
        int ele = 0;
        int [] expected = {1,5,-4,3,-2};
        actualLogic(arr,ele,expected);
    }

    @Test
    public void testMethod4(){
        int [] arr = {-5,-4,-3,2,5,4};
        int ele = 5;
        int [] expected = {-5,-4,-3,2,4};
        actualLogic(arr,ele,expected);
    }

    @Test
    public void testMethod5(){
        int [] arr = {0,0,0,0,0,0,0,0};
        int ele = 0;
        int [] expected = {};
        actualLogic(arr,ele,expected);
    }

    @Test
    public void testMethod6(){
        int [] arr = {4,2,5,4,4,2,2};
        int ele = 4 ;
        int [] expected = {2,5,2,2};
        actualLogic(arr,ele,expected);
    }
}
