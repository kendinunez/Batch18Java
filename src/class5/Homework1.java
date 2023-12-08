package class5;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter grade");

        char grade = scanner.next().charAt(0);

        switch(grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Bad");
                break;
            default:
                System.out.println("Not Acceptable");
        }
    }
}
