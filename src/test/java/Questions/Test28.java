package Questions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test28 {
    Question28 q28 = new Question28();
    public void actualLogic(int [] arr, int [] evenExpected,int [] oddExpected){
        int [] evenActual = q28.even(arr);
        int [] oddActual = q28.odd(arr);
        Assert.assertEquals(evenActual,evenExpected);
        Assert.assertEquals(oddActual,oddExpected);
    }
    @Test
    public void testMethod1(){
        int [] arr = {1,2,3,4,5,6};
        int even [] = {2,4,6};
        int odd [] = {1,3,5};
        actualLogic(arr,even,odd);
    }

    @Test
    public void testMethod2(){
        int [] arr = {100,101,102,103};
        int even [] = {100,102};
        int odd [] = {101,103};
        actualLogic(arr,even,odd);
    }

    @Test
    public void testMethod3(){
        int [] arr = {-2,-3,-4,-5,-6};
        int even [] = {-2,-4,-6};
        int odd [] = {-3,-5};
        actualLogic(arr,even,odd);
    }

    @Test
    public void testMethod4(){
        int [] arr = {2,-2,4,-4,6,-6,-3,-1};
        int even [] = {2,-2,4,-4,6,-6};
        int odd [] = {-3,-1};
        actualLogic(arr,even,odd);
    }

    @Test
    public void testMethod5(){
        int [] arr = {-99,-88,44,22};
        int even [] = {-88,44,22};
        int odd [] = {-99};
        actualLogic(arr,even,odd);
    }

    @Test
    public void testMethod6(){
        int [] arr = {0,4,3,5};
        int even [] = {0,4};
        int odd [] = {3,5};
        actualLogic(arr,even,odd);
    }
}
