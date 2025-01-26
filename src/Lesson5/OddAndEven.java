package Lesson5;

public class OddAndEven {
    public static void count(int[] arr){
        if(arr.length < 1){
            System.out.println("Массив пуст");
            return;
        }
        int odd = 0, even = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Кол-во чётных: " + even);
        System.out.println("Кол-во нечётных: " + odd);
    }
}
