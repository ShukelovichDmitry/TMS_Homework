import Lesson2.Fibonachi;
import Lesson2.MultiplyTable;
import Lesson2.Rectangle;
import Lesson2.StudentScore;
import Lesson3.Palindrome;
import Lesson3.PrimeNumber;
import Lesson4.ConvertASCII;
import Lesson4.ReverseWordsInString;
import Lesson5.ArrayPalindrome;
import Lesson5.FindMaxMin;
import Lesson5.OddAndEven;
import Lesson5.ReverseArray;
import Lesson6.CountReplacement;
import Lesson6.FrequencySort;
import Lesson6.SortWithNegativeNumbers;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int[] arr = new int[]{4, -5, -6, 6, 5, -3, -6, -1, 2};
        /*Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }
        }*/
        //FrequencySort.sort(arr);
        //SortWithNegativeNumbers.sort(arr);
        int count = CountReplacement.sort(arr, 0, arr.length-1);
        System.out.println("Результат: " + count);
        System.out.println("Результат: " + Arrays.toString(arr));
    }
}
