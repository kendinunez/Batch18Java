package class19;

public class Animal {
    String name;
    String color;
    int age;
    double weight;

    public Animal(String name, String color, int age, double weight){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    public void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}
class Dog extends Animal{
    public Dog(String name, String color, int age, double weight){
        super(name, color, age, weight);
    }
    void bark(){
        System.out.println("Wuff Wuff...");
    }
    class Cat extends Animal{
        public Cat(String name, String color, int age, double weight){
            super(name, color, age, weight);
        }

        public void meow(){
            System.out.println("Meow Meow...");
        }
    }
}