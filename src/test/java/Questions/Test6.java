package Questions;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class Test6 {
    Question6 q6 = new Question6();
    public void actualLogic(int[] arr,int indexPos, int value, int[] expected ){
        int [] actual = q6.insert(arr,indexPos,value);
        assertEquals(actual,expected);
    }
    @Test
    public void testMethod1(){
        int [] arr = {1,2,3,4,5,6};
        int indexPosition = 2;
        int valueToInsert = 6;
        int [] expected = {1,2,6,3,4,5};
        actualLogic(arr,indexPosition,valueToInsert,expected);
    }
    @Test
    public void testMethod2(){
        int [] arr = {-1,3,-4,5,0};
        int indexPosition = 0;
        int valueToInsert = 1;
        int [] expected = {1,-1,3,-4,5};
        actualLogic(arr,indexPosition,valueToInsert,expected);
    }
    @Test
    public void testMethod3(){
        int [] arr = {0,0,0,-1,2};
        int indexPosition = 4;
        int valueToInsert = 4;
        int [] expected = {0,0,0,-1,4};
        actualLogic(arr,indexPosition,valueToInsert,expected);
    }
    @Test
    public void testMethod4(){
        int [] arr = {0,10,0,-1,2,-100};
        int indexPosition = 5;
        int valueToInsert = -185;
        int [] expected = {0,10,0,-1,2,-185};
        actualLogic(arr,indexPosition,valueToInsert,expected);
    }
    @Test
    public void testMethod5(){
        int [] arr = {-100,1,0,-1,2,4,5,602,1};
        int indexPosition = 7;
        int valueToInsert = -999;
        int [] expected = {-100,1,0,-1,2,4,5,-999,602};
        actualLogic(arr,indexPosition,valueToInsert,expected);
    }
    @Test
    public void testMethod6(){
        int [] arr = {5,8,6,9,5,4,1,2};
        int indexPosition = 7;
        int valueToInsert = 0;
        int [] expected = {5,8,6,9,5,4,1,0};
        actualLogic(arr,indexPosition,valueToInsert,expected);
    }

}
