package class14;
/*
Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
 */
public class Students {

    static String name;
    int ID;
    static int noOfStudents;
    int count;

    public static void main(String[] args) {
        Students s1=new Students();
        s1.name="Kendi";
        s1.ID=1223243;
        s1.noOfStudents++;

        Students s2=new Students();
        s2.name="Sino";
        s2.ID=1221980;
        s2.noOfStudents++;

        Students s3=new Students();
        s3.name="Asghar";
        s3.ID=8998777;
        s3.noOfStudents++;

        System.out.println("The number of students is "+noOfStudents);

    }

}
