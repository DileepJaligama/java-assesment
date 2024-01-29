package Questions;

public class Question12 {
    public static void main(String[] args) {
        int[] array = {12,2,1};
        long product = Question12.calculateProduct(array);

    }

    public static long calculateProduct(int[] arr) {
        long product = 1;
        for (int a : arr){
            product *= a;
        }
        return  product;
    }
}
