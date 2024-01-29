package Questions;

public class Question16 {
    public static  void main(String args[]){
        int arm = 153;
        boolean result = Question16.armStrong(arm);
    }
    public static boolean armStrong(int arm){
        int  temp, total = 0, number;
        number = arm;
        boolean res;
        while(number != 0){
            temp = number % 10;
            total = total + temp*temp*temp;
            number = number / 10;
        }
        if(total == arm){
            res = true;
        } else{
            res = false;
        }
        return res;
    }
}
