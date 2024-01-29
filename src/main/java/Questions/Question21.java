package Questions;

public class Question21 {
    public static void main(String args[]){
        double a = 100;
        double b = 55;
        double c = 25;
        double result = Question21.largestNumber(a,b,c);
    }
    public static double largestNumber(double a, double b, double c){
        if(a > b && a > c){
            return a;
        } else if (b > c && b > a ) {
            return b;
        } else{
            return c;
        }
    }
}
