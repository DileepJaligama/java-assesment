package Questions;

public class Question10 {
    public static void main(String args[]){
        double fheit = 352;
        double result = Question10.convert(fheit);
    }
    public static double convert(double heit){
        double celsius = (( 5 *(heit - 32.0)) / 9.0);
        return celsius;
    }
}
