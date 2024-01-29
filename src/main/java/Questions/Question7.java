package Questions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question7 {
    public static void main(String []args)
    {
        int firstNum = 200;
        int secondNum =220;
        int [] result = Question7.prime(firstNum, secondNum);

    }
    public static int[] prime(int first,int second){
        ArrayList<Integer> prime = new ArrayList<>();
        for(int i = first; i <= second; i++){
            int count = 0;
            for( int j=i; j>=1 ; j--){
                if(i%j==0) {
                    count ++;
                }
            }
            if(count == 2){
                prime.add(i);
            }
        }
        int [] array = new int[prime.size()];
        for(int k=0; k < prime.size();k++){
            array[k] = prime.get(k);
        }
        return array;
    }
}
