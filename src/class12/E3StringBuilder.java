package class12;

public class E3StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Hello World");
        //System.out.println(sb.reverse()); //reverse => dlroW olleH
        System.out.println(sb.deleteCharAt(0)); //delete H because it is in index 0 => ello World
        System.out.println(sb.insert(0,"H")); //Puts H back in the index specified => Hello World
        //System.out.println(sb.insert(1,"H")); //eHllo World

    }
}
