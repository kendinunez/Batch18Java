package class11;

public class E8StringDemo {
    public static void main(String[] args) {

        String str="Today is Saturday";
        System.out.println(str.indexOf('T'));
        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf('S'));
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('z'));
        System.out.println();

        // Print all the index of letter a from above string
        for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i)=='a'){
               System.out.print(i+" ");
           }
        }
    }
}
