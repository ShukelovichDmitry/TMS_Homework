package Lesson6;

import java.util.HashMap;
import java.util.Map;

public class CountReplacement {

    public static int sort(int[] arr, int left, int right){
        int temp;
        int count = 0;
        int left2 = left, right2 = right;
        if (left >= right) {
            return count;
        }
        int pivot = arr[left + (right - left)/2];
        while (left <= right){
            while (arr[left] < pivot){
                left++;
            }
            while (arr[right] > pivot){
                right--;
            }
            if(left <= right){
                //Если left и right остановяться на pivot или на равных ему элементах, то перестановка не нужна
                if(arr[left] != arr[right]){
                    temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    count++;
                }
                left++;
                right--;
            }
        }
        count += sort(arr, left2, left - 1) + sort(arr, left, right2);
        return count;
    }
}
