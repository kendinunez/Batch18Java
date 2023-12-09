package class14;

public class Dog {
    String name; // Instance Variable

    void printInfo(){
        System.out.println(name);
    }

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name="Jacki"; // Instance variable can be accessed anywhere with the help of object
        d1.printInfo(); // jacki
    }

}
