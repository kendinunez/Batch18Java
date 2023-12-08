package class12;

public class E1StringDemo {
    public static void main(String[] args) {

        String str="It's Savera's Birthday today. It's Sunday. Today is Java Class";
        String[] strArray=str.split("[.]"); //Splits array everytime there is a .
        System.out.println(strArray.length); //3
        System.out.println(strArray[0]); //It's Savera's Birthday today
        System.out.println(strArray[1]);// It's Sunday
        System.out.println(strArray[1].trim()); //It's Sunday => No space before because of trim
        System.out.println(strArray[2]); // Today is Java Class
        System.out.println(strArray[2].trim()); //Today is Java Class =>  No space before because of trim

    }
}
