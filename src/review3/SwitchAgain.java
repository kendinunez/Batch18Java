package review3;

public class SwitchAgain {
    public static void main(String[] args) {

        char choice = 'Y';

        switch(choice){

            case 'y':
                System.out.println("Means Yes");
                break;
            case 'n':
                System.out.println("Means No");
                break;
            case 'm':
                System.out.println("Maybe");
                break;
            default:
                System.out.println("I do not understand you");

        }
    }
}
