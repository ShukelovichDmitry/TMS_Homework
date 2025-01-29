package Lesson6;

public class SortWithNegativeNumbers {
    public static void sort(int[] arr){
        int temp, j;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= 0){
                continue;
            }
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] >= 0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
