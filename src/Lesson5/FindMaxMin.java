package Lesson5;

public class FindMaxMin {
    public static void findMaxMin(int[] arr){
        if(arr.length < 1){
            System.out.println("Массив пуст");
            return;
        }
        int maxValue = arr[0], maxIndex = 0;
        int minValue = arr[0], minIndex = 0;
        for (int i = 1; i < arr.length; i++){
            if(minValue > arr[i]){
                minValue = arr[i];
                minIndex = i;
            } else if (maxValue < arr[i]) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        System.out.print("Минимальное значение: " + minValue);
        System.out.println(" Индекс минимального значения: " + minIndex);
        System.out.print("Максимальное значение: " + maxValue);
        System.out.println(" Индекс максимального значения: " + maxIndex);
    }
}











