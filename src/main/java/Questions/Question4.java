package Questions;
public class Question4{
    public static void main(String[] args) {
        String str = "hello World";
        String reversed = reverseString(str);
    }
    public static String reverseString(String st) {
        String str = st.replace(" ","");
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}