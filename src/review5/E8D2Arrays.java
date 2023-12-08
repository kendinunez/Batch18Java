package review5;

public class E8D2Arrays {
    public static void main(String[] args) {

        int [][] numbers={
                {10, 20, 30, 40},
                {20, 40, 60, 80},
                {30, 60, 90, 120}
        };
       int[] row0 = numbers[0]; //Getting back complete 1D array from 2D Array

       int num= numbers[2][2]; //Getting back individual number from 2D Array
        System.out.println(num);
    }
}
