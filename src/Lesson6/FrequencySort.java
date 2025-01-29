package Lesson6;

import java.util.HashMap;
import java.util.Map;

public class FrequencySort {
    public static void sort(int[] arr){
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            Integer currFrequency = frequencies.getOrDefault(arr[i], 0);
            frequencies.put(arr[i], currFrequency + 1);
        }
        Map.Entry<Integer, Integer>[] arr2 = frequencies.entrySet().toArray(new Map.Entry[frequencies.size()]);
        quickSort(arr2, 0, arr2.length-1);
        int k = 0;
        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].getValue(); j++){
                arr[k++] = arr2[i].getKey();
            }
        }
    }

    private static void quickSort(Map.Entry<Integer, Integer>[] arr, int left, int right){
        Map.Entry<Integer, Integer> temp;
        int left2 = left, right2 = right;
        if (left >= right) {
            return;
        }
        Map.Entry<Integer, Integer> pivot = arr[left + (right - left)/2];
        while (left <= right){
            while (arr[left].getValue() > pivot.getValue() ||
                    arr[left].getValue() == pivot.getValue() && arr[left].getKey() < pivot.getKey()){
                left++;
            }
            while (arr[right].getValue() < pivot.getValue() ||
                    arr[right].getValue() == pivot.getValue() && arr[right].getKey() > pivot.getKey()){
                right--;
            }
            if(left <= right){
                if(arr[left] != arr[right]) {
                    temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
                left++;
                right--;
            }
        }
        quickSort(arr, left2,left - 1);
        quickSort(arr, left, right2);
    }
}
