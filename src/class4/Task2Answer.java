package class4;

public class Task2Answer {
    public static void main(String[] args) {

        int num1=100,num2=200,num3=300;

        if(num1>num2){

            if(num1>num3){
                System.out.println("Largest number is "+num1);
            }

        }else{
            if(num2>num3){
                System.out.println("Largest number is "+num2);
            }else{
                System.out.println("Largest number is "+num3);
            }
        }
    }
}
