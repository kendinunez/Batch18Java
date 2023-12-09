package class14;

public class Cat {
    //Instance Variable => Inside class but outside method
    String name="Kitty";

    void printName(){
        // Local Variable => It is inside a method/ a block of code
       String name="Pishak"; // If this wasn't here, Kitti/Local variable would be printed instead of Pishak/Instance variable
        System.out.println(name);
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.printName(); // Pishak => Local variables have more priority than Instance Variables always
    }
}
