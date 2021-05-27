package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginInfo ("cybertekStudent","123abc");//postitive test
        loginInfo ("time to learn","123abx");//negavtive test
        System.out.println(loging("cybertekStudent","123abc"));
        System.out.println( loging("ssfsff","243cvcc"));
    }
    public static void  loginInfo( String username, String password){
        String secterUsername="cybertekStudent";
        String secretPassword= "123abc";
        if (secterUsername.equals(username)&& secretPassword.equals(password)){
            System.out.println("login is a success");

        }else {
            System.out.println("login failed");
        }
    }
    public static boolean loging (String username, String password) {
        String secterUsername = "cybertekStudent";
        String secretPassword = "123abc";
        /** ONE WAY TO DO IT
         * if (secterUsername.equals(username) && secretPassword.equals(password)){
         return true;
         }else {
         return false;
         }*/
/** SECOND WAY TO DO IT...THIS WILL EXIST AND PRINT FALSE ONCE THE STATEMENT  IF IT IS FALSE
 if (secterUsername.equals(username) && secretPassword.equals(password)) {
 return true;
 }
 return false;
 */
//ANOTHER WAY TO DO IT AND BEST PRACTICES
        return secterUsername.equals(username) && secretPassword.equals(password);

    }

}
