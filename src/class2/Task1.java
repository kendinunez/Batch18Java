package class2;

public class Task1 {
    public static void main(String[] args) {
        /*
        Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say.
        “The __ of 2 numbers __ and  is equal to __”
        The addition of 2 numbers 10 and 20 is equal to 30
         */
        double num1 = 5.55;
        double num2 = 10.55;
        double add = num1+num2;
        double subtract = num1-num2;
        double multiply = num1*num2;

        System.out.println("The addition of 2 numbers "+num1+ " and "+num2+" is equal to "+add);
        System.out.println("The subtraction of 2 numbers "+num1+ " and "+num2+" is equal to "+subtract);
        System.out.println("The multiplication of 2 numbers "+num1+ " and "+num2+" is equal to "+multiply);
    }
}
