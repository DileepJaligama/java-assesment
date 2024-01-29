package Questions;

public class Question30 {
        public static void main(String[] args) {
            int[] numbers = {45, 78, 23, 56, 90, 12, 67};

            int minElement = findMinElement(numbers);
        }

        public static int findMinElement(int[] arr) {

            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        }
}
