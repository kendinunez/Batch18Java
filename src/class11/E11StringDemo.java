package class11;

public class E11StringDemo {
    public static void main(String[] args) {

        String str="e   2883    GSDUHDUehr   u8fj@";
        System.out.println(str.replaceAll("[A-Z]", "*"));
        System.out.println(str.replaceAll("[a-z]", "*"));
        System.out.println(str.replaceAll("[0-9]", "*"));
        System.out.println(str.replaceAll("[A-D]", "*"));
        System.out.println(str.replaceAll("[A-Za-z]", "*"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]", "*"));
        System.out.println((int)'A');
        System.out.println(str.replaceAll("[!-?]", ""));
        System.out.println(str.replaceAll("[\\d]", "*"));
        System.out.println(str.replaceAll("[\\s]", "*"));
    }
}
