package Questions;

public class Question18 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        double result = calculateAverage(array);

    }

    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}
