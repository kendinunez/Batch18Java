package review2;

public class ElseIfBlock {
    public static void main(String[] args) {

        int worldCup = 2002;

        if(worldCup==2002){
            System.out.println("Host country is Korea and Japan");
        }else if(worldCup==2006){
            System.out.println("Host country is Germany");
        }else if(worldCup==2010){
            System.out.println("host country is South Africa");
        }else if(worldCup==2014){
            System.out.println("Host country is Brazil");
        }else{
            System.out.println("Host country is unknown");
        }

        /*
        if(condition) {};

        if(condition) {
                code to execute;
        } else{
                code to execute;
                }
                // when we have multiple condition to test

                if(condition) {
                        code to execute;
                }else if(condition) {
                        code to execute;
                }else if(condition) {
                        code to execute;
                }else if(condition) {
                        code to execute;
                }
         */
    }
}
