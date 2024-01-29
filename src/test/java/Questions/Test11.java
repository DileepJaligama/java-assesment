package Questions;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;
public class Test11 {
    Question11 q11 = new Question11();
    public void actualLogic(int a,int b,ArrayList<Integer> expected){
        ArrayList <Integer> actual = q11.swap(a,b);
        assertEquals(actual,expected);

    }
    @Test
    public void testMethod1(){
        int a = 10;
        int b = 20;
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(b);
        expected.add(a);
        actualLogic(a,b,expected);
    }

    @Test
    public void testMethod2(){
        int a = -5555;
        int b = -20;
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(b);
        expected.add(a);
        actualLogic(a,b,expected);
    }

    @Test
    public void testMethod3(){
        int a = 100;
        int b = 20000;
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(b);
        expected.add(a);
        actualLogic(a,b,expected);
    }

    @Test
    public void testMethod4(){
        int a = -55;
        int b = 20;
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(b);
        expected.add(a);
        actualLogic(a,b,expected);
    }

    @Test
    public void testMethod5(){
        int a = 65;
        int b = -20;
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(b);
        expected.add(a);
        actualLogic(a,b,expected);
    }

    @Test
    public void testMethod6(){
        int a = -10;
        int b = -250;
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(b);
        expected.add(a);
        actualLogic(a,b,expected);
    }
}
