package class11;
/*
Create a String and print it in reverse order (Sunday → yadnuS)
 */
public class Hw {
    public static void main(String[] args) {
        String str="Sunday";

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i)+" ");
        }
    }
}
