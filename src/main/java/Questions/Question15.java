package Questions;

public class Question15 {
    public static void main(String[] args) {
        int numberToCheck = 55;
        boolean result = isFibonacciNumber(numberToCheck);
    }
    public static boolean isPerfectSquare(int num) {
        int srt = (int) Math.sqrt(num);
        return srt * srt == num;
    }
    public static boolean isFibonacciNumber(int num) {
        return isPerfectSquare(5 * num * num + 4) || isPerfectSquare(5 * num * num - 4);
    }
}
