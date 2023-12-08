package class13;

public class T3 {

    void palindrome(String p){

        String reversedWord="";
        for (int i = p.length()-1; i >= 0 ; i--) {
            reversedWord=reversedWord+p.charAt(i);
        }
        if(p.equalsIgnoreCase(reversedWord)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }

    public static void main(String[] args) {
        T3 p = new T3();
        p.palindrome("Java");
    }
}
