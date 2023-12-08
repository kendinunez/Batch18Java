package class12;
/*
How would you swap 2 strings without a temporary variable?
 */
public class Hw {
    public static void main(String[] args) {

        String string1="Day";
        String string2="Night";

        System.out.println("Before Swapping: "+string1+string2);

        string1=string1+string2;
        string2=string1.substring(0,string1.length()-string2.length());
        string1=string1.substring(string2.length());

        System.out.println("After swapping: "+string1+string2);
    }
}
