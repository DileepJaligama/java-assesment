package Questions;
public class Question9 {
    public static void main(String args[]){
        int num = 224;
        int result = Question9.sum(num);
    }
public static int sum(int num){
        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        return sum;
    }
}
