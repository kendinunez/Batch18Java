package class7;
/*
Create an array of animals and store 5 elements into it.
Using 2 different loops print all elements from the array.
 */
public class Hw2 {
    public static void main(String[] args) {

        String [] animals={"Dog","Cat","Turtle","Horse","Monkey"};
        System.out.println(animals[0]+" "+animals[1]+" "+animals[2]+" "+animals[3]+" "+animals[4]);

        String [] animal = new String[10];
        animal[0]="Dog";
        animal[1]="Cat";
        animal[2]="Turtle";
        animal[3]="Horse";
        animal[4]="Monkey";
        System.out.println(animal[0]+" "+animal[1]+" "+animal[2]+" "+animal[3]+" "+animal[4]);
    }
}
