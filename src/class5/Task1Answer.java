package class5;

import java.util.Scanner;

public class Task1Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the height in inches");
        double height = scanner.nextDouble();

        if(height<60){
            System.out.println("short");
        }else if(height>=60&&height<72){
            System.out.println("medium");
        }else{
            System.out.println("tall");
        }
    }
}
