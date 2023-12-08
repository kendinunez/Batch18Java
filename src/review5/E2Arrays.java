package review5;

public class E2Arrays {
    public static void main(String[] args) {
        // Creating the array and initializing it
        int [] numbers = {10 ,25 , 36, 56, 80};
        System.out.println(numbers.length); //5
        System.out.println(numbers[1]); //25

        for (int i = 0; i < numbers.length; i++) { // numbers.length/2 -> 10 25
            System.out.print(numbers[i]+" "); // 10 25 36 56 80
        }
        System.out.println();
        for(int n:numbers){
            System.out.print(n+" "); //  10 25 36 56 80
        }
    }
}
