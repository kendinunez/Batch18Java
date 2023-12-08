package class5;

import java.util.Scanner;

public class Task6Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double quizMarks, midMarks, finalMarks, averageMarks;
        char grade;

        System.out.println("Please enter the mark for quiz 0-100");
        quizMarks = scanner.nextDouble();
        System.out.println("Please enter the mark for midterm 0-100");
        midMarks = scanner.nextDouble();
        System.out.println("Please enter the mark for final 0-100");
        finalMarks = scanner.nextDouble();

        averageMarks = (quizMarks+midMarks+finalMarks)/3;

        if(averageMarks>=90){
            grade='A';
        }else if(averageMarks>=70 && averageMarks<90){
            grade='B';
        }else if(averageMarks>=50 && averageMarks<70){
            grade = 'C';
        }else{
            grade = 'F';
        }
        System.out.println(grade);
    }
}
