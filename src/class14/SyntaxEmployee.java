package class14;
/*
Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
 */
public class SyntaxEmployee {

    int empID;
    int salary;
    static String CEO;


    public static void main(String[] args) {
        SyntaxEmployee s1=new SyntaxEmployee();
        s1.empID=12234567;
        s1.salary=200000;
        s1.CEO="Sumair";

        SyntaxEmployee s2=new SyntaxEmployee();
        s2.empID=7572895;
        s2.salary=300000;
        s2.CEO="Sumair";

        System.out.println("Name of CEO is"+CEO+", emplyee ID is "+ s1.empID+" and salary is "+ s1.salary);
        System.out.println("Name of CEO is"+CEO+", emplyee ID is "+ s2.empID+" and salary is "+ s2.salary);
    }
}
