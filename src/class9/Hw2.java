package class9;
/*
Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
Print the sum of all numbers.
 */
public class Hw2 {
    public static void main(String[] args) {

        int [][] numbers = {
                {5, 10, 15},
                {20, 25, 30},
                {35, 40, 45}
        };
        int sum=0;
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                sum += numbers[i][j];
            }
            }
        System.out.println("The sum of all numbers is "+sum);
        }
    }

