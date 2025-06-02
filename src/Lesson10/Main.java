package Lesson10;

import Lesson10.Task2.TooYoungException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void task1(Scanner scanner){
        //Задание 1
        Integer number1, number2;
        try {
            //if(scanner.hasNext()) scanner.reset();
            number1 = scanner.nextInt();
            number2 = scanner.nextInt();
            System.out.println(number1 / number2);
        } catch (InputMismatchException e) {
            System.out.println("Неверный формат ввода");
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0 не допустимо");
        }
    }

    public static void task2(Scanner scanner){
        //Задание 2
        Integer age;
        try {
            //if(scanner.hasNext()) scanner.reset();
            age = scanner.nextInt();
            if(age < 18) throw new TooYoungException();
        } catch (InputMismatchException e) {
            System.out.println("Неверный формат ввода");
        } catch (TooYoungException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void task3(){
        //Задание 3
        String line;
        try {
            //if(scanner.hasNext()) scanner.reset();
            line = System.console().readLine();
            if(line.isEmpty()) throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("Строка ввода пустая");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        task1(scanner);
        task2(scanner);
        task3();
    }
}
