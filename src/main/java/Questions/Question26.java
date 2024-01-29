package Questions;
import java.util.Arrays;

public class Question26 {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
       int [] result =  sortAscending(array);
    }
    public static int[] sortAscending(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
