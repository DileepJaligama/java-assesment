package Questions;
public class Question5{
    public static void main(String args[]){
        int num = 7;
        int result  = Question5.factorial(num);

    }
    public static int factorial(int num){
        int fact = 1;
        for(int i = num; i >= 1 ; i--){
            fact = fact * i ;
        }
        return fact;
    }
}