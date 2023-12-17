package review7;

public class Dog {
   private String name;
   private String color;
   private int age;
   private double weight;

    public Dog(String name, String color, int age, double weight){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
    int sum=0;
    int sumArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
