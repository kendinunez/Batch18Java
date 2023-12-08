package class6;

import java.util.Scanner;

public class E12ScannerAndLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the starting point");
        int start = scanner.nextInt();

        System.out.println("Please enter the ending point");
        int end = scanner.nextInt();

        System.out.println("Please enter the step size as well");
        int step= scanner.nextInt();
        while(start<=end){
            System.out.print(start+" ");
            start=start+step;
        }

    }
}
