package class4;

import java.util.Scanner;

public class DMVRepresentative {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please Enter your age");
        int age = scanner.nextInt();

        if(age>=18){
            System.out.println("I will issue a driver license");
        }else{
            System.out.println("I will offer you to get a learner's permit");
        }

    }
}
