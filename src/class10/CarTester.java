package class10;

public class CarTester {
    public static void main(String[] args) {

        //Create an object from the class
        Car bmw=new Car();
        bmw.model="I7";
        bmw.color="Blue";
        bmw.make="BMW";
        bmw.price=120000;
        bmw.honk();
        bmw.drive();
        bmw.applyBrakes();
    }
}
