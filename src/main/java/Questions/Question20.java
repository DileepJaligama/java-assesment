package Questions;

import java.util.HashMap;

public class Question20 {
    public static void main(String args[]){
        String str = "hello world";
        HashMap<String,String> result =  Question20.vowelsAndConsonants(str);
    }
    public static HashMap<String,String> vowelsAndConsonants(String sampleStrng){
        String str = sampleStrng.replace(" ","");
        HashMap<String,String> data = new HashMap<>();
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        String lowercaseData = str.toLowerCase();
        for(int i =0; i< str.length();i++){
            char ch = lowercaseData.charAt(i);
            if(Character.isLetter(ch)){
                if(ch == 'a' ||  ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels.append(ch);
                } else {
                    consonants.append(ch);
                }
            }
        }
        String vowelsKey = vowels.toString();

        data.put(vowelsKey,consonants.toString());
        return data;
    }
}
