package review2;

public class NestedIf {
    public static void main(String[] args) {

        //nested if -> if statement inside another if
        /*
        if(condition) {
            if(condition){
          }
       }
         */


        boolean allergy = true;
        String allergyType = "fish" ;

        if(allergy){ //Outer if
            System.out.println("Let's check what kind of allergy you have");

            if(allergyType.equals("peanut")){ //nested if -> an if inside another if ->Nested if has a dependency on first if condition (outer if)
                System.out.println("Please avoid food that contains peanuts");
            } else if(allergyType.equals("dairy")){
                System.out.println("Please avoid food with dairy products");
            } else if(allergyType.equals("Pollen")){
                System.out.println("Please stay indoor when trees are blooming");
            }
        }


    }
}
