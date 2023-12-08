package class7;

public class E2NestedLoops {
    public static void main(String[] args) {

        for (int row = 0; row < 5; row++) { // rows

            for (int column = 0; column < 5; column++) { //# of stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
