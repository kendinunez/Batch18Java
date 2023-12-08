package class4;

public class E2NestedIfConditions {
    public static void main(String[] args) {

        double budget = 25000;
        String engineType = "Patrol";

        if(budget>=50000){

            if(engineType.equals("Electric")){
                System.out.println("I want to buy a Tesla");
            }else if(engineType.equals("Hybrid")){
                System.out.println("I want to buy a Toyota");
            }else{
                System.out.println("I want to buy a Porche");
            }
        }else if(budget>=30000){

            if(engineType.equals("Electric")){
                System.out.println("I want to buy a BYD");
            }else if(engineType.equals("Hybrid")){
                System.out.println("I want to buy a Camry");
            }else{
                System.out.println("hyundai Sonata");
            }
        }else if(budget>=20000){

            if(engineType.equals("Electric")){
                System.out.println();
            }else if(engineType.equals("Hybrid")){
                System.out.println("Kia");
            }else{
                System.out.println("Honda Civic");
            }
        }else{
            System.out.println("Let's save more");
        }

    }
}
