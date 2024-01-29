package Questions;
import java.util.ArrayList;
public class Question17 {
    public static void main(String args[]){
        int a = 1;
        int b = 1000;
        ArrayList<Integer> result =  Question17.armStrongNumbers(a, b);


    }
    public static  ArrayList<Integer> armStrongNumbers(int a,int b){
        int temp, total , number;
        ArrayList<Integer> values = new ArrayList<>();
        for(int i = a; i <= b; i++){
            total   =    0;
            number = i;
            while(number>0) {
                temp = number % 10;
                total = total + temp * temp * temp;
                number = number / 10;
            }
            if(total == i){
                values.add(i);
            }
            total = 0;
        }
        return values;
    }
}
