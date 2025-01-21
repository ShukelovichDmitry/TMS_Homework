package Lesson3;

public class SumOfDigits {
    public static int sumOfDigits(int input){
        int sum = 0;
        while (input > 0){
            sum += input % 10;
            input /= 10;
        }
        return sum;
    }
}
