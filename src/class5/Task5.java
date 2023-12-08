package class5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birthday month");
        String month = scanner.next();

        if(month.equals("March")||month.equals("April")||month.equals("May")){
            System.out.println("You were born in season: Spring");
        }else if(month.equals("June")||month.equals("July")||month.equals("August")){
            System.out.println("You were born in season: Summer");
        }

    }
}
