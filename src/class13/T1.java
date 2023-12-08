package class13;
/*
Create a method that will take 2 parameters as a numbers and prints which number is larger.
 */
public class T1 {
    void largest(int input1, int input2){
        if(input1>input2){
            System.out.println(input1+" is the largest number "+input2);
        }else{
            System.out.println(input2+" is larger than "+input1);
        }
    }

    public static void main(String[] args) {
        T1 p = new T1();

        p.largest(10, 20);

    }

}
