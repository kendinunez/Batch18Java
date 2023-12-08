package class13;
/*
Create a method that will say Hello in different language
based on the country that will pass when method is executed.
Do it for any five countries

 */
public class Hw1 {

    void sayHello(String country){
        switch (country){
            case "Usa":
                System.out.println("Hello");
                break;
            case "Mexico":
                System.out.println("Hola");
                break;
            case "France":
                System.out.println("Bonjour");
                break;
            case "Japanese":
                System.out.println("こんにちは");
                break;
            case "Germany":
                System.out.println("Guten Tag");
                break;
        }
    }

    public static void main(String[] args) {
        Hw1 h = new Hw1();

        h.sayHello("Mexico");
    }
}
