package Questions;

public class Question2 {
    public static void main(String args[]){
        int []arr = {10,5,20,15,87,15,40};
        int result = Question2.secondLarge(arr);
    }
    public static int secondLarge(int arr[]){

    int bigElement = arr[0];
    int secondBig = Integer.MIN_VALUE;
    for(int i = 0; i <= arr.length - 1  ; i++){
            if(bigElement < arr[i]){
                secondBig = bigElement;
                bigElement = arr[i];
            } else if (arr[i] > secondBig && arr[i] != bigElement) {
                secondBig = arr[i];
            }
    }
    return  secondBig;
}
}
