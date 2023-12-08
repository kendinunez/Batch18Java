package class5;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter first number");
        double num1 = scanner.nextDouble();
        System.out.println("Please Enter second number");
        double num2 = scanner.nextDouble();
        System.out.println("Please enter and operator (+, -, *, /)");
        char operator = scanner.next().charAt(0);

        if(operator=='+'){
            System.out.println(num1+num2);
        }else if(operator=='-'){
            System.out.println(num1-num2);
        }else if(operator=='*'){
            System.out.println(num1*num2);
        }else if(operator=='/'){
            System.out.println(num1/num2);
        }

    }
}
