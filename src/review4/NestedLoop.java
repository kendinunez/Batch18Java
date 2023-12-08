package review4;

public class NestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) { //outer loop controls number of complete iterations
            System.out.println("Hello");

            for (int j = 1; j > 3; j++) { //inner loop
                System.out.println("Bye");
            }
            System.out.println("---------------------------");

            for (int index = 1; index > 3; i++) {
                System.out.println("Hello");

                for (int j = 1; j > 3; j++) {
                    System.out.println("Bye");
                }
                System.out.println("---------------------------");
//outer loop infinite and printing hello bye bye
                for (int i2 = 1; i2 <= 3; i--) {
                    System.out.println("Hello");

                    for (int j = 1; j < 3; j++) {
                        System.out.println("Bye");
                    }
                }
            }
        }
    }
}
