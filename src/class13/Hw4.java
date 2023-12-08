package class13;
/*
Create a method createEmail().
Based on values of users firstName, lastName and email type, your method should return complete email Address.
Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
 */
public class Hw4 {

    String createEmail(String fName, String lName, String emailType){
        String email = fName+lName+"@"+emailType+".com";
        return email;
    }

    public static void main(String[] args) {
        Hw4 h = new Hw4();
        String e = h.createEmail("Ken", "Nunez", "icloud");
        System.out.println(e);
    }
}
