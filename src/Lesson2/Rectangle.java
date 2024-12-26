package Lesson2;

import java.util.Scanner;

public class Rectangle {
    public static float square(float width, float height){
        return width*height;
    }

    public static float perimeter(float width, float height){
        return 2*(width+height);
    }

    public static void calculateRectangleFromInput(){
        Scanner scanner = new Scanner(System.in);
        float width;
        float height;
        do{
            System.out.print("Введите длину прямоугольника: ");
            width =  scanner.nextInt();
        }while(width < 0f);
        do{
            System.out.print("Введите длину прямоугольника: ");
            height =  scanner.nextInt();
        }while(height < 0f);
        System.out.println("Периметр: " + perimeter(width, height));
        System.out.println("Площадь: " + square(width, height));
    }
}
