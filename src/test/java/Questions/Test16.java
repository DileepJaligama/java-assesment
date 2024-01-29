package Questions;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
public class Test16 {
     Question16 Q16 = new Question16();
     public  void actualLogic(int num,boolean expected){
         boolean actual = Q16.armStrong(num);
        assertEquals(actual,expected);
     }
     @Test
    public  void testMethod1(){
         int num = 52;
         boolean expected = false;
         actualLogic(num,expected);
    }
    @Test
    public  void testMethod2(){
        int num = 1;
        boolean expected = true;
        actualLogic(num,expected);
    }
    @Test
    public  void testMethod3(){
        int num = 512;
        boolean expected = false;
        actualLogic(num,expected);
    }
    @Test
    public  void testMethod4(){
        int num = -9;
        boolean expected = false;
        actualLogic(num,expected);
    }
    @Test
    public  void testMethod5(){
        int num = 153;
        boolean expected = true;
        actualLogic(num,expected);
    }
    @Test
    public  void testMethod6(){
        int num = 371;
        boolean expected = true;
        actualLogic(num,expected);
    }
}
