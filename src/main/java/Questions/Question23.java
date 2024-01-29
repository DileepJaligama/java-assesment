package Questions;
import java.util.Arrays;
public class Question23 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int [] result =  Question23.leftRotateByTwo(arr);
    }
    public static int[] leftRotateByTwo(int[] arr) {
        int n = arr.length;
        int rotations = 2;
        for (int i = 0; i < rotations; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
        return arr;
    }
}
