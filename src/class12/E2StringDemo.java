package class12;

public class E2StringDemo {
    public static void main(String[] args) {
        String str="It's Savera's Birthday today. It's Sunday. Today is Java Class";
        String[] wordArray=str.split(" ");//Splits array everytime there is a space
        System.out.println(wordArray.length);
        System.out.println(wordArray[0]); //It's


    }
}
