package Questions;

public class Question3 {

    public static void main(String[] args){
        String a = "abcfsed";
        String b = "fghjikl";
        String result = Question3.program(a,b);

    }
    public static  String program(String a,String b){
        String firstString = a.replace(" ","");
        String secondString = b.replace(" ","");
        String combinedString = "";
        int maxLength = Math.max(firstString.length(),secondString.length());
        for(int i = 0; i<= maxLength    ; i++){
            if(i <= firstString.length() - 1){
                combinedString += firstString.toCharArray()[i];
            }
            if(i <= secondString.length() - 1){
                combinedString += secondString.toCharArray()[i];
            }
        }
        return combinedString;
    }


}
