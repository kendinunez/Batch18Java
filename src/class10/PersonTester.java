package class10;

public class PersonTester {
    public static void main(String[] args) {

        Person person=new Person();
        person.name="Kendi";
        person.age=18;
        person.weight=102;
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.weight);
        person.talk();
        person.run();
        person.sleep();
    }
}
