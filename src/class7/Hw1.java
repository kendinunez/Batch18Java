package class7;
/*
Create an array of cars and store 6 elements into it.
Using 2 different loops print all values from the array.
 */
public class Hw1 {
    public static void main(String[] args) {
        String [] cars={"Equinox", "Camry","Camaro","Mustang","Tahoe","Tesla"};
        System.out.println(cars[0]+" "+cars[1]+" "+cars[2]+" "+cars[3]+" "+cars[4]+" "+cars[5]);

        String [] car = new String[10];
        car[0]="Equinox";
        car[1]="Camry";
        car[2]="Camaro";
        car[3]="Mustang";
        car[4]="Tahoe";
        car[5]="Tesla";
        System.out.println(car[0]+" "+car[1]+" "+car[2]+" "+car[3]+" "+car[4]+" "+car[5]);
    }
}
