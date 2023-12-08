package class5;

public class E5LogicalOperators {
    public static void main(String[] args) {

        boolean is4GAvailable = false;
        boolean isWifiAvailable = false;

        if(isWifiAvailable||is4GAvailable){
            System.out.println("You can browse the internet");
        }else{
            System.out.println("Can't use internet");
        }
    }
}
