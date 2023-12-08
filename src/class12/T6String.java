package class12;
/*
How would you check if String is palindrome or not? aba => true Abbc => false
If you get the original String back it is called a palindrome otherwise it is not
Ex:
String str = "MoM"; => palindrome => MoM
String str = "Car"; => Not palindrome => rac
 */
public class T6String {
    public static void main(String[] args) {
        String str = "Mom";
        String reversedWord="";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reversedWord=reversedWord+str.charAt(i);
        }
        if(str.equalsIgnoreCase(reversedWord)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }

    }
}
