package Questions;

public class Question25 {
    public static void main(String[] args) {
        String str = "Hello World!";
        String reversed = Question25.reverseCase(str);
    }

    public static String reverseCase(String str) {
        String withOutSpaces = str.replace(" ","");
        char[] chars = withOutSpaces.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }

        return new String(chars);
    }
}
