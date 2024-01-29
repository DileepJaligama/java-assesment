package Questions;
import java.util.Arrays;
public class Question6 {
    public static  void  main(String args[]){

        int[] arr = {10,2,5,4,4,8,9};
        int indexPosition = 2;
        int valueToInsert = 10;
        int[] result = Question6.insert(arr,indexPosition,valueToInsert);
    }
    public static int[] insert(int[] arr,int indexPosition,int valueToInsert){

        for(int i = arr.length - 1  ; i > indexPosition ; i--){
            arr[i] = arr[i-1];
        }
        arr[indexPosition] = valueToInsert;
        return arr;
    }
}
