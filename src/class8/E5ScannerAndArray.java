package class8;

import java.util.Scanner;

public class E5ScannerAndArray {
    public static void main(String[] args) {

        int [] numbers=new int[5]; //create empty array of size 5
        Scanner scanner = new Scanner(System.in); //activation of scanner
        for (int i = 0; i < numbers.length; i++) { //loop starts from 0
            System.out.println("Please Enter a number");
            numbers[i]=scanner.nextInt();
        }
        System.out.println("Here are all the numbers you entered");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]+" ");
        }
    }
}
