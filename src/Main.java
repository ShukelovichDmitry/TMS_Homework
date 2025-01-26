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

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(1000);
        }
        System.out.println("Входной массив: " + Arrays.toString(arr));
        FindMaxMin.findMaxMin(arr);
        ArrayPalindrome.isPalindrome(arr);
        OddAndEven.count(arr);
        ReverseArray.reverse(arr);

    }
}
