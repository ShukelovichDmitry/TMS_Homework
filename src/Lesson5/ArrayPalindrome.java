package Lesson5;

public class ArrayPalindrome {
    public static void isPalindrome(int[] arr){
        if(arr.length < 1){
            System.out.println("Массив пуст");
            return;
        }
        int i = 0, j = arr.length - 1;
        while (i < j){
            if(arr[i++] != arr[j--]){
                System.out.println("Массив не является палиндромом");
                return;
            }
        }
        System.out.println("Массив является палиндромом");
    }
}
