package class11;

public class E5StringDemo {
    public static void main(String[] args) {

        String str="Java";
        System.out.println(str.equals("Python")); // False because it is not same as str
        System.out.println(str.equals("Java")); // True because it is the same as str
        System.out.println(str.equalsIgnoreCase("java")); // Doesn't care if it is upper case or lower case => True

    }
}
