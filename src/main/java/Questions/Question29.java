package Questions;
public class Question29 {
    public static void main(String[] args) {
        int num  = 121;
        boolean result = isPalindrome(num);
    }

    public static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
