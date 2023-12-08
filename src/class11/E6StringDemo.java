package class11;

public class E6StringDemo {
    public static void main(String[] args) {
        String str="Java is fun";
        char c=str.charAt(4); // Empty because spaces are counted too
        System.out.println(c);

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }
}
