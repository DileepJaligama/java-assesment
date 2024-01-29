package Questions;
import java.util.Arrays;
public class Question13 {
    public static void main(String args[]){
        String sample = "  hello world";
        String result = Question13.stringSorting(sample);

    }
    public static String stringSorting(String sample){
        String sam = sample.replace(" ","");
        char charArray[] = sam.toCharArray();
        Arrays.sort(charArray);
        return new String (charArray);
    }
}
