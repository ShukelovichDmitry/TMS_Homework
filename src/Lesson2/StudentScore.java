package Lesson2;

import java.util.Scanner;

public class StudentScore {
    public static char getGrade(int score){
        if(score<30) return 'F';
        if(score<50) return 'D';
        if(score<75) return 'C';
        if(score<90) return 'B';
        return 'A';
    }

    public static void showGradeFromInputScore(){
        Scanner scanner = new Scanner(System.in);
        int score;
        do{
            System.out.print("Введите кол-во баллов от 0 до 100: ");
            score =  scanner.nextInt();
        }while(score < 0 || score > 100);
        System.out.println("Оценка: " + getGrade(score));
    }
}
