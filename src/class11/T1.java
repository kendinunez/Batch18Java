package class11;

public class T1 {
    public static void main(String[] args) {

        String username="nunezkendi";
        String password="dhbk73274";
        String confirm="dhbk3274";

        if(username.isEmpty() || password.isEmpty()==true){
            System.out.println("Username or Password cannot be empty");
        }else if(password.length()<8){
            System.out.println("Password is too short");
        }else if(password.contains(username)){
            System.out.println("Password cannot contain username");
        }else if(!password.equals(confirm)){
            System.out.println("Password does not match");
        }else{
            System.out.println("Your username and password has been created");
        }
    }
}
