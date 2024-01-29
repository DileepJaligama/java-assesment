package Questions;
public class Question19 {

        public static void main(String[] args) {
            int number = 123;
            int reversedNumber = reverseNumber(number);

        }

        public static int reverseNumber(int num) {
            int reversedNum = 0;

            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }

            return reversedNum;
        }

}
