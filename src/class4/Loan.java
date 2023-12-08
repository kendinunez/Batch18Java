package class4;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the amount of loan needed");
        double loan = scanner.nextDouble();

        if(loan<=200000){
            System.out.println("Lend the money");
        }else{
            System.out.println("Reject the client");
        }


    }
}
