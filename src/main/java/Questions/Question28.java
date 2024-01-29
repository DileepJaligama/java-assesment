package Questions;
import java.util.Arrays;
public class Question28 {
    public static void main(String[] args) {
        int[] array = {3, 8, 12, 5, 20, 7, 9, 10};
        int[] evenNumbers = even(array);
        int[] oddNumbers = odd(array);

    }

    public static int[] even(int[] arr) {
        int countEven = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                countEven++;
            }
        }
        int[] evenNumbers = new int[countEven];
        int index = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers[index++] = num;
            }
        }
        return evenNumbers;
    }

    public static int[] odd(int[] arr) {
        int countOdd = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                countOdd++;
            }
        }
        int[] oddNumbers = new int[countOdd];
        int index = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                oddNumbers[index++] = num;
            }
        }
        return oddNumbers;
    }
}
