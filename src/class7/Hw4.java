package class7;
/*
From an array of integer elements find the largest number.
 */
public class Hw4 {
    public static void main(String[] args) {
        int[] number = {10, 20, 30};
        int largestNum = 0;

        for (int i = 1; i < number.length; i++) {
            if (number[i] > largestNum) {
                largestNum = number[i];
            }
        }
        System.out.println("Largest number is "+largestNum);
    }
}