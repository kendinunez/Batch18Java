package class4;

import java.util.Scanner;

public class WorkedYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter number of worked years");
        int years = scanner.nextInt();
        System.out.println("Please Enter annual salary");
        int salary = scanner.nextInt();

        if(years>=5){
            System.out.println("User is eligible for the bonus");

            if(salary>50000){
                System.out.println("Bonus = 5000");
            }else{
                System.out.println("Bonus = 3000");
            }
        }else{
            System.out.println("Not eligible");
        }

    }
}
