package day19_class_vs_object_string;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName= "Eyerus";
        String expPassword= "1234";
        String userName ="eyerus";
        String password="123";
        if (expPassword.equals(password) && expUserName.equalsIgnoreCase(userName)){
            System.out.println("login is sucess");
        }else {
            if (!expUserName.equalsIgnoreCase(expUserName))//do username first becuase that is teh first step//
            {
                System.out.println("incorrect username try again");
            }else if(!expPassword.equals(password)){
                System.out.println("incorrect password try again"); ;
            }

        }
    }
}
