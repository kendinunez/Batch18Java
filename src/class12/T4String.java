package class12;

import java.util.Scanner;

public class T4String {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String father="Mary";
        String mother="Daniel";
        boolean isGirl=true;

        if(isGirl){
            String fatherFirstPart=father.substring(0,father.length()/2);
            String motherLastPart=mother.substring(mother.length()/2,mother.length());
            System.out.println(fatherFirstPart.trim()+motherLastPart.trim());
        }else{
            String motherFirstPart=mother.substring(0,mother.length()/2);
            String fatherLastPart=father.substring(father.length()/2,father.length());
            System.out.println(motherFirstPart.trim()+fatherLastPart.trim());
        }
    }
}

