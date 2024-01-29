package Questions;
import java.util.ArrayList;
public class Question11 {
    public static void main(String args[]){
        int a = 5;
        int b = 20;
        ArrayList<Integer> result = Question11.swap(a,b);
    }
    public static ArrayList<Integer> swap(int a, int b){
        ArrayList<Integer> array = new ArrayList<>();
        a = a + b;
        b = a - b;
        a = a - b;
        array.add(a);
        array.add(b);
        return  array;
    }
}
