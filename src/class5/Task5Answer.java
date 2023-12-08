package class5;

import java.util.Scanner;
/*
Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”.

 */
public class Task5Answer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter Your Birthday");
        String monthName = scanner.next();
        String season;

        if(monthName.equals("December")||monthName.equals("January")||monthName.equals("February")){
            season="Winter";
        }else if(monthName.equals("March")||monthName.equals("April")||monthName.equals("May")){
            season="Spring";
        }else if(monthName.equals("June")||monthName.equals("July")||monthName.equals("August")){
            season="Summer";
        }else if(monthName.equals("September")||monthName.equals("October")||monthName.equals("November")) {
            season = "Autumn";
        }else{
            season="Invalid";
        }
        System.out.println("You were born in season "+season);
    }
}
