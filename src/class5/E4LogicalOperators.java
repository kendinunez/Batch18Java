package class5;

public class E4LogicalOperators {
    public static void main(String[] args) {

        boolean bringFlowers = false;
        boolean bringChocolates = false;
        boolean allMyMistake = false;

        if(bringFlowers||bringChocolates||allMyMistake){
            System.out.println("HomeMinister is Happy");
        }else{
            System.out.println("HomeMinister is Angry");
        }
    }
}
