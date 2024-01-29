package Questions;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class Test20 {
    Question20 Q20 = new Question20();
    public void actualLogic(String str,HashMap<String,String> expected){
        HashMap<String,String> actual = Q20.vowelsAndConsonants(str);
        Assert.assertEquals(actual.keySet(),expected.keySet());
        Assert.assertEquals(actual.values(),expected.values());
    }
    @Test
    public void testMethod1(){
        String str = "hello world";
        HashMap<String,String > expected = new HashMap<>();
        String vowels = "eoo";
        String cons = "hllwrld";
        expected.put(vowels,cons);
        actualLogic(str,expected);

    }

    @Test
    public void testMethod2(){
        String str = "java";
        HashMap<String,String > expected = new HashMap<>();
        String vowels = "aa";
        String cons = "jv";
        expected.put(vowels,cons);
        actualLogic(str,expected);

    }

    @Test
    public void testMethod3(){
        String str = "python";
        HashMap<String,String > expected = new HashMap<>();
        String vowels = "o";
        String cons = "pythn";
        expected.put(vowels,cons);
        actualLogic(str,expected);

    }

    @Test
    public void testMethod4(){
        String str = "    r   a j u";
        HashMap<String,String > expected = new HashMap<>();
        String vowels = "au";
        String cons = "rj";
        expected.put(vowels,cons);
        actualLogic(str,expected);

    }

    @Test
    public void testMethod5(){
        String str = " you are welcome ";
        HashMap<String,String > expected = new HashMap<>();
        String vowels = "ouaeeoe";
        String cons = "yrwlcm";
        expected.put(vowels,cons);
        actualLogic(str,expected);

    }

    @Test
    public void testMethod6(){
        String str = "harry porter";
        HashMap<String,String > expected = new HashMap<>();
        String vowels = "aoe";
        String cons = "hrryprtr";
        expected.put(vowels,cons);
        actualLogic(str,expected);

    }
}
