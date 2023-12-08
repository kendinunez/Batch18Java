package class9;
/*
Assign 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
Retrieve all values from that array using 2 different loops
 */
public class Hw1 {
    public static void main(String[] args) {

        System.out.println("Nested Loops:");
        String[][] groceries={
                {"Carrot", "Broccoli", "Tomatoes", "Potatoes"},
                {"Strawberries", "Bananas", "Kiwi", "Pineapple"},
                {"Yogurt", "Cheese", "Milk", "Butter"},
                {"Chocolate", "Cake", "Donuts", "Cookies"}
        };
        for(int i=0; i< groceries.length; i++){
            for (int j = 0; j < groceries[i].length; j++) {
                System.out.print(groceries[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Enhanced Loop:");

        for(String[] grocery:groceries){
            for(String g:grocery){
                System.out.print(g+" ");
            }
            System.out.println();
        }
    }
}
