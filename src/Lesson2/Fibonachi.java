package Lesson2;

import java.util.Scanner;

public class Fibonachi {
    public static int fibonachiRecursive(int orderNumber){
        if(orderNumber <= 1)
            return 0;
        if(orderNumber == 2)
            return 1;
        return fibonachiRecursive(orderNumber-1) + fibonachiRecursive(orderNumber-2);
    }

    public static int fibonachiCycle(int orderNumber){
        int nextFib = 0;
        int firstFib = 0;
        int secondFib = 1;
        if(orderNumber<1) return firstFib;
        if(orderNumber == 2) return secondFib;
        while (orderNumber-- > 2){
            nextFib = firstFib + secondFib;
            firstFib = secondFib;
            secondFib = nextFib;
        }
        return nextFib;
    }

    public static void getFibonachiFromInput(){
        Scanner scanner = new Scanner(System.in);
        int orderNumber;
        do{
            System.out.print("Введите порядковый номер в ряду фибоначи: ");
            orderNumber =  scanner.nextInt();
        }while(orderNumber < 0);
        System.out.println("Число фибоначи под номером " + orderNumber + ", посчитанным через рекурсию: " + fibonachiRecursive(orderNumber));
        System.out.println("Число фибоначи под номером " + orderNumber + ", посчитанным через цикл: " + fibonachiCycle(orderNumber));
    }
}
