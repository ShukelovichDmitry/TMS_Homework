package Lesson3;

public class PrimeNumber {
    public static boolean isPrimeNumber(int input) {
        for(int i = 2; i < input / i; i++){
            if(input % 2 == 0){
                return false;
            }
        }
        return true;
    }
}