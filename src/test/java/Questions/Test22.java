package Questions;

import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.HashSet;
import java.util.Set;

import static org.testng.Assert.assertEquals;
public class Test22 {
    Question22 Q22 = new Question22();
    public void actualLogic(int []arr,Set<Integer> expected){
        Set<Integer> actual = Q22.findDuplicateElements(arr);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testMethod1(){
        int [] arr = {1,2,3,4,5,5,6,6};
        int [] ar = {5,6};
        Set<Integer> expected = new HashSet<>();
        for(int num: ar){
            expected.add(num);
        }
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod2(){
        int [] arr = {11,11,22,22,3,4,5,5,6,6};
        int [] ar = {5,6,22,11};
        Set<Integer> expected = new HashSet<>();
        for(int num: ar){
            expected.add(num);
        }
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod3(){
        int [] arr = {0,-1,-1,-2,-1,2};
        int [] ar = {-1};
        Set<Integer> expected = new HashSet<>();
        for(int num: ar){
            expected.add(num);
        }
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod4(){
        int [] arr = {0,0,-9,-9,5};
        int [] ar = {0,-9};
        Set<Integer> expected = new HashSet<>();
        for(int num: ar){
            expected.add(num);
        }
        actualLogic(arr,expected);
    }
    @Test
    public void testMethod5(){
        int [] arr = {0,0,0,0,4,5,5};
        int [] ar = {0,5};
        Set<Integer> expected = new HashSet<>();
        for(int num: ar){
            expected.add(num);
        }
        actualLogic(arr,expected);
    }

    @Test
    public void testMethod6(){
        int [] arr = {-1,-1,-1,2,2,2,5,8,7};
        int [] ar = {-1,2};
        Set<Integer> expected = new HashSet<>();
        for(int num: ar){
            expected.add(num);
        }
        actualLogic(arr,expected);
    }
}
