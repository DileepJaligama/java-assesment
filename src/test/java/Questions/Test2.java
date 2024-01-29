package Questions;
import org.testng.annotations.Test;
import  static org.testng.Assert.assertEquals;
public class Test2 {
    Question2 q2 = new Question2();
    public void actualLogic(int arr[],int expected){
        int actual = q2.secondLarge(arr);
        assertEquals(actual,expected);
    }

    @Test
    public void testMethod1(){
        int[] arr = {-1,2,3,4,5,55,25,-10,-5,0};
        int expected = 25;
        actualLogic(arr,expected);
    }

    @Test
    public void testMethod2(){
        int[] arr = {-1,2,3,4,5,-10,-5,0};
        int expected = 4;
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod3(){
        int [] arr = {0,2,999,888,101,-500};
        int expected = 888;
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod4(){
        int [] arr = {0,-5,-6,-6,3};
        int expected = 0;
        actualLogic(arr,expected);
    }
    @Test
    public  void testMethod5(){
        int [] arr = {100001,1002,59999,25,-9898985};
        int expected = 59999;
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod6(){
        int [] arr = {-99999,-8888,52,14,0,65};
        int expected = 52;
        actualLogic(arr,expected);
    }
}
