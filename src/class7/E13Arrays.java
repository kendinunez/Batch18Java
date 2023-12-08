package class7;
// if number present print found
//search for number 55
public class E13Arrays {
    public static void main(String[] args) {

        int [] numbers = {10,20,30,45,69,55,45,69,20};

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]==55){
                System.out.println("Found");
                break;
            }
        }

    }
}
