package class15;

public class Teacher {
    String name;
    String address;
    private int age;
    private double weight;


    public Teacher(String name, String address, int age, double weight){
        this.name=name;
        this.address=address;
        this.age=age;
        this.weight=weight;
    }
    public Teacher(String name, String address, int age){
        this.name=name;
        this.address=address;
        this.age=age;
    }
    void printInfo(){
        System.out.println(name+" "+address);
    }
}
