package class11;

public class E4StringDemo {
    public static void main(String[] args) {

        String str="Now I love Java Java is great";
        System.out.println(str.startsWith("")); // Nothing present
        System.out.println(str.startsWith("N")); // True because it starts with N
        System.out.println(str.endsWith("great")); // True because ends in great
        System.out.println(str.contains("Java")); // True because it does contain the word Java
    }
}
