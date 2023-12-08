package review6;

public class E2StringDemo {
    public static void main(String[] args) {
        //String str1 = new String("Java");
        String str = "    ";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());

        boolean r = str.isEmpty();
       // r.isBlank() => error
        int number=10;
        //number.isEmpty(); => error

        String str2 = "Java   ";
        str2.trim().isBlank();
    }
}
