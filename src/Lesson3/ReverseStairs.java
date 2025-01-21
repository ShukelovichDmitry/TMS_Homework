package Lesson3;

public class ReverseStairs {
    public static void reverseStairs(int N){
        while(N > 0){
            System.out.println("#".repeat(N--));
        }
    }
}