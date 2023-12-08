package class11;

public class E2StringDemo {
    public static void main(String[] args) {

        String str="Kendi"; // Creating an object of the String class & shorter version
        String str2=new String("Batch 18");
        System.out.println(str.length());
        System.out.println(str2.length());

        // Will return a boolean true/false => false because it is not empty
        boolean isEmpty=str.isEmpty();
        System.out.println(isEmpty);
    }
}
