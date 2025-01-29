package Lesson5;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] arr){
        if(arr.length < 1){
            System.out.println("Массив пуст");
            return;
        }
        int temp;
        int i = 0, j = arr.length - 1;
        while (i < j){
            temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
        System.out.println("Результат: " + Arrays.toString(arr));
    }
}
