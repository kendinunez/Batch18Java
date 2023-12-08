package class8;

public class E7Loops {
    public static void main(String[] args) {
        //write a loop to print these letters in reverse order yadnus
        char[] word={'S', 'u', 'n', 'd', 'a', 'y'};
        for (int i = word.length - 1; i >= 0; i--) {
            System.out.print(word[i]);
        }
    }
}
