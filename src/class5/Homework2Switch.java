package class5;

import java.util.Scanner;

public class Homework2Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Please enter second number");
        int num2 = scanner.nextInt();
        System.out.println("please enter an operator (+, -, *, /)");
        char operator = scanner.next().charAt(0);

        switch(operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
        }
    }
}
