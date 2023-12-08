package review3;

public class LogicalNot {
    public static void main(String[] args) {

        boolean hungry = !true;

        System.out.println(hungry);

        boolean agreeCheckBox = true;

        if(!agreeCheckBox){
            System.out.println("I will click on check box to select it");
        }else{
            System.out.println("I am not clicking on check box");
        }
        System.out.println("Clicking on Submit Payment");
    }
}
