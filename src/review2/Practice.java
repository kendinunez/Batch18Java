package review2;
/*
1.Write a program to store a value whether user has degree or not.
If user has a degree, you should say congratulations and after that check
If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”,
otherwise → “You should have studied harder” .
if user does not have a degree print you should get a degree
 */
public class Practice {
    public static void main(String[] args) {

        boolean userHasDegree = true;
        double gpaScore = 5.3;

        if (userHasDegree) {
            System.out.println("Congratulations");

            //Write your inner if in here
            if (gpaScore > 3.5) {

            } else {
                System.out.println("You should get a degree");
            }
        }
    }
}
