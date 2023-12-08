package class5;

import java.util.Scanner;

public class Task2Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a number from 1-7");
        int dayNumber = scanner.nextInt();

        if(dayNumber>=1&&dayNumber<=5){
            System.out.println("Weekday");
        }else if(dayNumber>=6&&dayNumber<=7){
            System.out.println("Weekend");
        }else{
            System.out.println("Invalid");
        }

    }
}
