package class13;
/*
Create a method that will take a number
and prints whether the number is even or odd.
 */
public class T2 {

    void oddEven(int num){
        if(num%2==0){
            System.out.println(num+" is Even");
        }else{
            System.out.println(num+" is Odd");
        }
    }
//Not necessary
    public static void main(String[] args) {
        T2 n = new T2();
        n.oddEven(6);
    }
}
