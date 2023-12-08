package class12;
/*
You have a String a="Is it Saturday? Is it raining? Do we have Java Class today?"
How would you find out how many sentences are in that String?
 */
public class T3String {
    public static void main(String[] args) {

        String str="It is saturday? Is it raining? Do we have java class today?"; //Splits array everytime there is a ?
        System.out.println(str.split("[?]").length);
    }
}
