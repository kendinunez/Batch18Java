package class11;

public class E1StringDemo {
    public static void main(String[] args) {
        //Create an object of that class
        /*
        String => datatype
        str => variable name
        new String() => creating the object of String
         */
       String str=new String("Hello");
        System.out.println(str.length()); // Calling the length method using the str object => 5
        System.out.println(str.toUpperCase()); // Everything in str in upper case => HELLO
        // We can store the result of a method as well
        String upper=str.toUpperCase();
        System.out.println(upper);
        System.out.println(str.toLowerCase()); // Everything in str in lower case => hello
        System.out.println(str.concat("Hello Batch 18")); // Concat with str => HelloHello Batch 18
        System.out.println(str+"Hello Batch 18"); // Like above example but a better approach
    }
}
