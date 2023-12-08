package review4;

public class NestedLoop3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {

            for (int j = 0; j <= 9; j++) {

                for (int c = 0; c <= 9; c++) {

                    for (int b = 0; b <= 9; b++) {

                        System.out.println(i + " " + j + " " + c + " " +b );
                    }
                }
            }
        }
    }
}
