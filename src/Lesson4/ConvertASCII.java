package Lesson4;

import java.util.Scanner;

public class ConvertASCII {
    public static String toASCII(String input) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < input.length(); i++){
            sb.append(String.format("%4d", (int)input.charAt(i)));
        }
        return sb.toString();
    }

    public static String toStr(String input) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(input);
        while(scanner.hasNext()){
            int ascii = (char)scanner.nextInt();
            sb.append((char)ascii);
        }
        return sb.toString();
    }
}
