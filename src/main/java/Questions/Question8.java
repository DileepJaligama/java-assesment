package Questions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
public class Question8 {
    public static void main(String args[]){
        int[] firstArray = {1,12,5,7,8,9,10,5,7,8};
        ArrayList<Integer> result =  Question8.uniqueElements(firstArray);
    }
    public static ArrayList<Integer> uniqueElements(int[] firstArray){
        HashSet<Integer> map = new HashSet<>();
        for (int j : firstArray) {
            map.add(j);
        }
        return new ArrayList<>(map);
    }
}
