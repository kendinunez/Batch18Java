package class15;

public class Dog {
    // Instance Variables fields/properties/attributes
   private String name;
   private String breed;
   private String color;
   private int age;

   public Dog(String dName, String dBreed, String dColor, int dAge){
       name=dName;
       breed=dBreed;
       color=dColor;
       age=dAge;
       if(age<30){
           age=dAge;
       }else{
           System.out.println("Wrong Age");
       }

   }

    void printInfo(){
        System.out.println(name+" "+breed+" "+color+" "+age);
    }
}
