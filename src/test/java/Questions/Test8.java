package Questions;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;

import  org.testng.Assert;
import static org.testng.Assert.assertEquals;
public class Test8 {
    Question8 q8 = new Question8();

    public void actualLogic(int [] ele,ArrayList<Integer> expected){
        ArrayList<Integer> actual  = q8.uniqueElements(ele);
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void testMethod1(){
        int [] ele = {1,7,5,5,7,7};
        HashSet<Integer> set = new HashSet<>();
        for(int num: ele){
            set.add(num);
        }
        ArrayList<Integer> expected = new ArrayList<>(set);
        actualLogic(ele,expected);
    }
    @Test
    public void testMethod2(){
        int [] ele = {0,0,1111,22,-555,-44};
        HashSet<Integer> set = new HashSet<>();
        for(int num: ele){
            set.add(num);
        }
        ArrayList<Integer> expected = new ArrayList<>(set);
        actualLogic(ele,expected);
    }
    @Test
    public void testMethod3(){
        int [] ele = {-22,-5,-4,-5,4,4,3,2,1};
        HashSet<Integer> set = new HashSet<>();
        for(int num: ele){
            set.add(num);
        }
        ArrayList<Integer> expected = new ArrayList<>(set);
        actualLogic(ele,expected);
    }
    @Test
    public void testMethod4(){
        int [] ele = {999,999,999,88,55,44,444,444,44,2,5};
        HashSet<Integer> set = new HashSet<>();
        for(int num: ele){
            set.add(num);
        }
        ArrayList<Integer> expected = new ArrayList<>(set);
        actualLogic(ele,expected);
    }
    @Test
    public void testMethod5(){
        int [] ele = {-99,-99,88,65,45,45};
        HashSet<Integer> set = new HashSet<>();
        for(int num: ele){
            set.add(num);
        }
        ArrayList<Integer> expected = new ArrayList<>(set);
        actualLogic(ele,expected);
    }
    @Test
    public void testMethod6(){
        int [] ele = {0,1,0,1,0,1};
        HashSet<Integer> set = new HashSet<>();
        for(int num: ele){
            set.add(num);
        }
        ArrayList<Integer> expected = new ArrayList<>(set);
        actualLogic(ele,expected);
    }


}
