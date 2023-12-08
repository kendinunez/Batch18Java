package review4;

public class DoWhileLoop {
    public static void main(String[] args) {
        //while - when we do NOT know in advance how many times we want to repeat block of code
        //how many times we want to repeat block of code

        /*
        while vs do while

        In do while block of code will be executed at least once even when condition is false
         */

        // I want to say hello 4 times
        int n=1;

        do{
            System.out.println("Hello");
            n++;
        }while(n<=4);
        System.out.println(n);

        System.out.println("------------Another way-------------");

        int i = 0;
        do{
            if(i%2==0)
            System.out.print(i+" ");
            i++;
        }while(i<=10);
    }
}
