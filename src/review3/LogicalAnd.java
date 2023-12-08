package review3;

public class LogicalAnd {
    public static void main(String[] args) {
        //For logical && - All condition needs to be true to get a TRUE
         boolean rain = false;
         boolean cold = true;

         if(cold && rain){
             System.out.println("I am staying home");
         }

         boolean messageDisplayed = true;
         String errorMessage = "Invalid";

         if(messageDisplayed && errorMessage.equals("Invalid Credentials")){
             System.out.println("Test Case passed");
         }else{
             System.out.println("Test Case failed");
         }
    }
}
