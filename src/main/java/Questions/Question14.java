package Questions;

public class Question14 {
    public static void main(String args[]){
        double number = 1547;
       boolean result = Question14.trueOrFalse(number);
    }
    public static  boolean trueOrFalse(double number){
        boolean verify;
        if(number >= 0 ){
            verify = true;
        } else{
            verify = false;
        }
        return verify;
    }
}
