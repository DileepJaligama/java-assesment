package Questions;
import java.util.LinkedHashSet;
import java.util.Arrays;
public class Question27 {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 2, 9, 5, 6, 8, 1};
        int[] uniqueArray = Question27.removeDuplicates(array);
        //System.out.println(Arrays.toString(uniqueArray));
    }
    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }
}
