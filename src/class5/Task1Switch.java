package class5;

import java.util.Scanner;

public class Task1Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your country");
        String country = scanner.next();

        switch(country){
            case "Mexico":
                System.out.println("Spanish");
                break;
            case "USA":
                System.out.println("English");
                break;
            case "Brazil":
                System.out.println("Portuguese");
                break;
            case "France":
                System.out.println("French");
                break;
            case "China":
                System.out.println("Chinese");
                break;
        }
    }
}
