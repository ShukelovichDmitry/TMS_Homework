package Lesson4;

public class ReverseWordsInString {
    public static String reverseLine(String input){
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (int i=0; i < input.length(); i++){
            if(input.charAt(i) == ' '){
                sb.append(new StringBuilder(input.substring(j, i)).reverse());
                j = i+1;
                sb.append(" ");
            }
        }
        sb.append(new StringBuilder(input.substring(j, input.length())).reverse());
        sb.reverse();
        return sb.toString();
    }
}
