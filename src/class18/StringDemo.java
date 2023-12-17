package class18;

public class StringDemo {
    public static void main(String[] args) {
        String str="My phone number is 911";
        str=str.replaceAll("[^0-9]", "");
        System.out.println(str);
    }
}
