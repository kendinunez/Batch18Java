package class19;

public class AnimalTester {
    public static void main(String[] args) {
        Animal a=new Dog("Jacky", "Black", 1, 12);
        Dog d =(Dog)a;
        d.bark();

        double[] arr={10, 20};

        Dog d1=new Dog("Jacky",  "Black", 1, 12);
        //Cat c1=new Cat("Lovly", "White", 1, 12);
        Animal a1=new Animal("Lovly", "White", 1, 12);
    }
}
