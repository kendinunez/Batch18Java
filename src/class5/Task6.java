package class5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quiz Score");
        int quiz = scanner.nextInt();
        System.out.println("Mid Term");
        int midTerm = scanner.nextInt();
        System.out.println("Final Score");
        int finalScore = scanner.nextInt();
        double averageScore = (quiz+midTerm+finalScore)/3;

        if(averageScore>=90){
            System.out.println("Grade = A");
        }else if(averageScore>=70 && averageScore<90){
            System.out.println("Grade = B");
        }else if(averageScore>=50 && averageScore<70){
            System.out.println("Grade = C");
        }else if(averageScore<50){
            System.out.println("Grade = F");
        }

    }
}
