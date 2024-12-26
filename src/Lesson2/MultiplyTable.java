package Lesson2;

import java.util.Scanner;

public class MultiplyTable {
    public static void printMultiplyTableFromInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число между от 2 до 9: ");
        int number = scanner.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(number + "*" + i + "=" + number*i);
        }
    }
}
