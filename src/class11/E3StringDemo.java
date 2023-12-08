package class11;

public class E3StringDemo {
    public static void main(String[] args) {

        String str="    Ja va   ";
        System.out.println(str); //    Ja va
        System.out.println(str.trim()); // Cuts/remove all spaces ONLY before and after but NOT in between => Ja va
    }
}
