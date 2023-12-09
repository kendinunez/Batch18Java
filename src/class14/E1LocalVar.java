package class14;

public class E1LocalVar {
    public static void main(String[] args) {

        int age = 10; // Local Variable => Can only be accessed inside a block of code like inside method (main method in this case)
        if(10<5){
            System.out.println(age); // works because it is still inside the method
            String name = "Jerry";
        }
        if(10>5){
            // System.out.println(name); => Error because it is not inside method
        }
    }
    void printAge(){
        // System.out.println(age);  => Error because it is not inside method
    }
}
