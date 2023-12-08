package class5;

import java.util.Scanner;

public class Task4Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter hour from 1-24");
        int hourNumber = scanner.nextInt();
        if(hourNumber>=1&&hourNumber<=11){
            System.out.println("Morning");
        }else if(hourNumber>=12&&hourNumber<=15){
            System.out.println("Afternoon");
        }else if(hourNumber>=16&&hourNumber<=20){
            System.out.println("Evening");
        }else if(hourNumber>=21&&hourNumber<=24){
            System.out.println("Night");
        }else{
            System.out.println("Invalid");
        }
    }
}
