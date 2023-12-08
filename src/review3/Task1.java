package review3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where are you from?");
        String country = scanner.nextLine();

        switch(country){
            case "India":
                System.out.println("You love biriyani");
                break;
            case "Egypt":
                System.out.println("You love Koshary");
                break;
            case "Georgia":
                System.out.println("You love Hachapuri");
            case "Moldova":
                System.out.println("You love Mamaliga");
                break;
            case "USA":
                System.out.println("You love burger and french fries");
                break;
            case "Great Britain":
                System.out.println("You love fish and chips");
                break;
            default:
                System.out.println("I don't know your favorite food");
        }


    }
}
