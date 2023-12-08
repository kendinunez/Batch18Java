package class8;
//Write a program to count how many times the name Zeeshan appeared in this array
public class T1 {
    public static void main(String[] args) {
        String[] names={"Aidos", "Zeeshan", "Abid","Sharif","Zeeshan"};
        int count = 0;
        for (int i = 0; i < names.length; i++) {
            if(names[i].equals("Zeeshan")){
                count++;
            }
        }
        System.out.println("Zeeshan appeared "+count+" times");
        }
    }

