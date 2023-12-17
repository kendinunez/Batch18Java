package class15;

public class Student {

    String name;
    double sMarks1;
    double sMarks2;
    double sMarks3;


    Student(String sName, double m1, double m2, double m3){
        name=sName;
        sMarks1=m1;
        sMarks2=m2;
        sMarks3=m3;

    }
    public void calcAvg(){
        double avg=(sMarks1+sMarks2+sMarks3)/3;
        System.out.println(name+"s Avg Marks are "+avg);
    }
}
