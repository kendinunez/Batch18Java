package class4;

public class Task2 {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 6;
        int num3 = 7;

        if (num1>num2 && num1>num3){
            System.out.println("The largest number is "+num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("The largest number is "+num2);
        }else if(num3>num1 && num3>num2){
            System.out.println("The largest number is "+num3);
        }

    }
}
