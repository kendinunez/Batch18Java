package class4;

import java.util.Scanner;

public class TempAndCity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter your city");
        String city = scanner.nextLine();

        System.out.println("Please Enter the temperature in "+city);
        double temp = scanner.nextDouble();

        double tempInCelsius =(temp-32)*5.0/9.0;
        System.out.println("Temperature in "+city+" is "+tempInCelsius+"C");







    }
}
