package Questions;
import java.util.Arrays;
public class Question24 {
    public static void main(String[] args) {
        int[] array = {4, 3, 2, 1, 2, 5, 2};
        int elementToRemove = 2;
        int[] modifiedArray = removeElementFromArray(array, elementToRemove);

    }

    public static int[] removeElementFromArray(int[] arr, int element) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != element) {
                arr[index++] = arr[i];
            }
        }

        return Arrays.copyOf(arr, index);
    }
}
