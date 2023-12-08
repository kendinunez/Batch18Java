package review4;

public class NestedLoop2 {
    public static void main(String[] args) {

        for (int index = 1; index <= 3; index++) {
            System.out.println("Hello");

            for (int j = 1; j < 3; j--) {
                System.out.println("Bye");
            }
        }
    }
}
